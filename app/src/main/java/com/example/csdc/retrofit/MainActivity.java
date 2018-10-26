package com.example.csdc.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestByGET();
        requestByPSOT();
    }

    private void requestByGET(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fy.iciba.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
        Call<Translate> call = request.getCall();
        call.enqueue(new Callback<Translate>() {
            @Override
            public void onResponse(Call<Translate> call, Response<Translate> response) {
                response.body().show();
            }

            @Override
            public void onFailure(Call<Translate> call, Throwable t) {

            }
        });
    }

    private void requestByPSOT(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PostRequest_Interface request = retrofit.create(PostRequest_Interface.class);

        Call<Translation> call = request.getCall("I Love You ");

        call.enqueue(new Callback<Translation>() {
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                Log.d("lqw",response.body().getResults().get(0).get(0).getResult());
            }

            @Override
            public void onFailure(Call<Translation> call, Throwable t) {
                Log.d("lqw",t.toString());
            }
        });
    }
}
