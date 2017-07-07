package io.github.zqiang94.viewinject_api;

import android.app.Activity;
import android.view.View;

/**
 * Created by ZQiang94 on 2017/7/7.
 */

public enum Finder {

    VIEW {
        @Override
        public View findView(Object source, int id) {
            return ((View) source).findViewById(id);
        }
    },
    ACTIVITY {
        @Override
        public View findView(Object source, int id) {
            return ((Activity) source).findViewById(id);
        }
    };

    public abstract View findView(Object source, int id);

}
