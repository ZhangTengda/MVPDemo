package com.roger.mvpdemo.presenter;

import android.content.Context;

/**
 * Presenter接口：ICidianPresenter
 * 需定义在实现类中需要用到的方法
 */
public interface ICidianPresenter {

    // 将View层获得的数据传入Model层
    void InputToModel(Context context, String str);
}
