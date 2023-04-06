package com.lazday.recycle_view.retrofit;


import com.lazday.recycle_view.MainModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("data.php") Call<MainModel> getData();
}
