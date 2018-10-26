package com.example.csdc.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by csdc on 2018/10/25.
 */

public interface GetRequest_Interface {

    @GET("ajax.php?a=fy&f=auto&t=auto&w=hello%20world")
    Call<Translate> getCall();
}
