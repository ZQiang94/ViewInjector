package io.github.zqiang94.viewinject_api;

/**
 * Created by ZQiang94 on 2017/7/7.
 */

public interface ViewInject<T> {
    void inject(T t, Object source);
}
