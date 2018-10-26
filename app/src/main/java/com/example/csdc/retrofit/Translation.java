package com.example.csdc.retrofit;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by csdc on 2018/10/25.
 */

public class Translation {

    @SerializedName("type")
    private String type;

    @SerializedName("errorCode")
    private int errorVode;

   /* @SerializedName("translateResult")
    private Result mResult;*/

    @SerializedName("translateResult")
    private List<List<Result>> mResults;

    public class Result{

        @SerializedName("src")
        private String old;

        @SerializedName("tgt")
        private String result;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }

    public List<List<Result>> getResults() {
        return mResults;
    }

    public void setResults(List<List<Result>> results) {
        mResults = results;
    }
}
