package com.example.csdc.retrofit;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

/**
 * Created by csdc on 2018/10/25.
 */

public class Translate {

    @SerializedName("status")
    private static int status;
    @SerializedName("content")
    private content mContent;

    private static class content{

        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }

    public void show(){
        Log.d("lqw","原文内容类型："+mContent.from+"\n"
                                +"译文内容类型："+mContent.to+"\n"
                                +"译文内容："+mContent.out);
    }
}
