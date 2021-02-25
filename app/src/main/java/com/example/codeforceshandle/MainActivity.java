package com.example.codeforceshandle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
{
    public String baseurl = "https://codeforces.com/api/";
    private TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text1);
      textView1 = findViewById(R.id.text2);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       // Retrofitinterface retrofitinterface = retrofit.create(Retrofitinterface.class);
    //    retrofit retrofitinterface = retrofit.create(retrofit.getClass())
        Retrofitinter retrofitinter = retrofit.create(Retrofitinter.class);
       String sachin = "indiankiller";
       Call<Root4> call = retrofitinter.getdata(sachin);
       call.enqueue(new Callback<Root4>()
       {
           @Override
           public void onResponse(Call<Root4> call, Response<Root4> response)
           {
               int temp = response.body().getResult().get(0).getMaxRating();
               textView1.setText(response.body().getResult().get(0).getFirstName());
            //   Pojo count = response.body();

          //     int temp = count.getRating();

           //    int count = response.body().get
               textView.setText(String.valueOf(temp));
             //  count.get()

           }


           @Override
           public void onFailure(Call<Root4> call, Throwable t) {

           }
       });




    }

    public void user(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

    }

}