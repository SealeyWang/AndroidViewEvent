package com.hyd.smart.androidviewevent;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.hyd.smart.androidviewevent.util.ZipUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity" ;
    private View tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        MyView();
        unzipFile();
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

    public void unzipFile(){
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String filePath = externalStorageDirectory +"/Tencent/TIMfile_recv/mt03RemoteUpdateEnglish.zip";
        String fileDir= externalStorageDirectory +"/Tencent/TIMfile_recv/mt03RemoteUpdateEnglish";
        try {
            List<File> files = ZipUtils.unzipFile(filePath, fileDir);
            for(File file :files){
                if(file.isFile())
                Log.d(TAG,file.getAbsolutePath()+"");
            }
        } catch (IOException e) {
            Log.d(TAG,"IOException");


        }
    }
}
