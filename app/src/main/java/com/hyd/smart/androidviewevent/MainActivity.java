package com.hyd.smart.androidviewevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity" ;
    private View tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        MyView();

    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    private void MyView(){

        float y = tv.getY();
        float x = tv.getX();
        int left = tv.getLeft();
        int top = tv.getTop();
        int right = tv.getRight();
        int bottom = tv.getBottom();

        Log.i(TAG,"TV y="+y+",x="+x+",left="+left+",top="+top+",right="+right+",bottom="+bottom);
    }
}
