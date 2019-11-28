package com.roger.mvpdemo;

import android.content.Context;

import com.roger.mvpdemo.listener.OnFanyiListener;
import com.roger.mvpdemo.model.FanyiModel;
import com.roger.mvpdemo.presenter.ICidianPresenter;
import com.roger.mvpdemo.view.IfanyiView;

public class CidianPresenter implements OnFanyiListener, ICidianPresenter {

    // 1. 声明View层对应接口、Model层对应的类
    private IfanyiView ifanyiView;
    private final FanyiModel fanyiModel;

    // 2. 重构函数，初始化View接口实例、Model实例
    public CidianPresenter(IfanyiView ifanyiView) {
        this.ifanyiView = ifanyiView;
        fanyiModel = new FanyiModel();
    }

    @Override
    public void onSuccess(String success) {
        // 回调函数，调用UI更新
        ifanyiView.setInfo(success);
    }

    @Override
    public void onError() {
        // 回调函数，调用UI输出出错信息
        ifanyiView.setError();
    }

    @Override
    public void InputToModel(Context context, String str) {
        // 3.将View层获得的数据传入Model层,注意要传递this.当前类
        fanyiModel.handleData(context, str, this);
    }

    // 注：
    // a. 保留IfanyiView的引用，就可直接在CidianPresenter当前类进行UI操作而不用在Activity操作
    // b. 保留了Model层的引用就可以将View层的数据传递到Model层
}
