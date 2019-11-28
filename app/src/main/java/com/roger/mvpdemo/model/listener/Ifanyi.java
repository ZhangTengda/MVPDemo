package com.roger.mvpdemo.model.listener;

import android.content.Context;

import com.roger.mvpdemo.listener.OnFanyiListener;
import com.roger.mvpdemo.model.FanyiBean;

/**
 * Model层接口：Ifanyi
 * 需定义在实现类中需要用到的方法
 */
public interface Ifanyi {

    void handleData(Context context, String input, final OnFanyiListener listener);

    String fanyiToString(FanyiBean fyBean);
}
