package com.example.a3dhualanpic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;

import at.technikum.mti.fancycoverflow.FancyCoverFlow;
import at.technikum.mti.fancycoverflow.FancyCoverFlowAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FancyCoverFlow fancyCover = findViewById(R.id.fancy_cover);
        fancyCover.setAdapter(new FancyCoverFlowSampleAdapter());
        //todo 设置位被选中的透明度
        fancyCover.setUnselectedAlpha(1.0f);
        //todo 设置位被选中的图片饱和度
        fancyCover.setUnselectedSaturation(0.0f);
        //todo 设置位被选中的缩放比例
        fancyCover.setUnselectedScale(0.5f);
        //todo 设置两个图片的距离
        fancyCover.setSpacing(20);
        //todo 设置位被选中图像的最大旋转度
        fancyCover.setMaxRotation(40);
        //todo 设置位被选中图像的下沉度
        fancyCover.setScaleDownGravity(0.3f);
        fancyCover.setActionDistance(FancyCoverFlow.ACTION_DISTANCE_AUTO);
    }
}
