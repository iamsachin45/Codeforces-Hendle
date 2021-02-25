package com.example.codeforceshandle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity2 extends AppCompatActivity
{
    private String baseurl = "https://codeforces.com/api/";
    private RecyclerView recyclerView;
    private List<Pojo> list;
    String sachin = "indiankiller";
    private LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.recycle1);
        Intent intent = getIntent();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // Retrofitinterface retrofitinterface = retrofit.create(Retrofitinterface.class);
        //    retrofit retrofitinterface = retrofit.create(retrofit.getClass())
        Retrofitinter retrofitinter = retrofit.create(Retrofitinter.class);
        Call<Root4> call = retrofitinter.getdata1("indiankiller");
        call.enqueue(new Callback<Root4>()
        {
            @Override
            public void onResponse(Call<Root4> call, Response<Root4> response)
            {
             //   int temp = response.body().getResult().get(0).getContestId();
               list = response.body().getResult();
           //     Log.d("ans -1 " ,String.valueOf(temp));
              //  Adapter adapter = new Adapter();
                layoutManager = new LinearLayoutManager(MainActivity2.this);
                recyclerView.setLayoutManager(layoutManager);
                Adapter adapter = new Adapter(list);
             recyclerView.setAdapter(adapter);

            }


            @Override
            public void onFailure(Call<Root4> call, Throwable t) {

            }
        });




    }

}