package com.example.codeforceshandle;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofitinter
{
  //  String name = new Helper();
  //  String name1 = new Helper().getHaldel();
 //   String s = name1 + "user.info?handles=";

    @GET("user.info")
    Call<Root4> getdata(@Query("handles=") String name1);

    @GET("user.rating")
    Call<Root4> getdata1(@Query("handles=") String name1);

}
