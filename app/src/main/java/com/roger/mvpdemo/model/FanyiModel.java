package com.roger.mvpdemo.model;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.roger.mvpdemo.listener.OnFanyiListener;
import com.roger.mvpdemo.model.listener.Ifanyi;

public class FanyiModel implements Ifanyi {

    private FanyiBean fanyi = new FanyiBean();

    @Override
    public void handleData(Context context, String input, final OnFanyiListener listener) {
        RequestQueue mQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest("http://fanyi.youdao.com/openapi.do?keyfrom=Yanzhikai&key=2032414398&type=data&doctype=json&version=1.1&q=" + input, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();

                fanyi = gson.fromJson(response.trim(), fanyi.getClass());

                listener.onSuccess(fanyiToString(fanyi));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onError();
            }
        });
        mQueue.add(stringRequest);
    }

    @Override
    public String fanyiToString(FanyiBean fyBean) {
        // 处理解析后的json数据，转成UI输出的字符串
        String strexplain = "解释：";
        String strphonetic = "发音：";
        String strweb = "网络释义：";
        if (fyBean.getBasic() == null) {
            return "你所查找的还没有准确翻译";
        }
        for (int i = 0; i < fyBean.getBasic().getExplains().size(); i++) {
            strexplain += fyBean.getBasic().getExplains().get(i) + "\n";
            if (i != fyBean.getBasic().getExplains().size() - 1) {
                strexplain += "\t\t\t\t";
            }
        }
        strphonetic += fyBean.getBasic().getPhonetic() + "\n";
//        for (int i = 0; i < fyBean.getWeb().size(); i++) {
//            for (int j = 0; j < fyBean.getWeb().get(i).value.length; j++) {
//                strweb += fyBean.web.get(i).value[j] + ",";
//            }
//            strweb += fyBean.web.get(i).key + "\n";
//            strweb += "\t\t\t\t\t\t\t";
//        }


        for (int i = 0; i < fyBean.getWeb().size(); i++) {
            for (int j = 0; j < fyBean.getWeb().get(i).getValue().size(); j++) {
                strweb += fyBean.getWeb().get(i).getValue().get(j) + ",";
            }
            strweb += fyBean.getWeb().get(i).getKey() + "\n";
            strweb += "\t\t\t\t\t\t\t";
        }
        return strexplain + "\n" + strphonetic + "\n" + strweb;
    }

}
