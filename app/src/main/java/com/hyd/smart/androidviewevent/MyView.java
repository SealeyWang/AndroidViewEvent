package com.hyd.smart.androidviewevent;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class MyView extends RelativeLayout {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void init() {
        //左上角横坐标
        int left = getLeft();
        //左上角纵坐标
        int top = getTop();

        //右下角横坐标
        int right = getRight();
        //右下角纵坐标
        int bottom = getBottom();

        int width = right - left;
        int height = bottom - top;

        //左上角横坐标
        float x = getX();
        //左上角纵坐标
        float y = getY();

        //view左上角相对于父容器的偏移量（是相对于父容器的坐标）  默认值为0
        float translationX = getTranslationX();
        float translationY = getTranslationY();

        /**
         * 这几个参数的换算关系
         * x = left + translationX
         * y = top + translationY
         *
         * view 在平移的过程中，top left 表示的是原始左上角的位置信息，
         * 其值并不会发生改变，此时发生变化的是x、y translationX translationY这四个参数
         */

    }
}
