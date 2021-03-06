package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/7/7.
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface BindView {

    int value();
}
