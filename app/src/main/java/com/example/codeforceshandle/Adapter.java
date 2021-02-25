package com.example.codeforceshandle;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.view_ne>
{
    //  public String[] data;
    private List<Pojo> list;

    public Adapter(List<Pojo> list)
    {
     this.list = list;
    }

    //  @NonNull
    @Override
    public view_ne onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapt_view,parent,false);
        return new view_ne(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final view_ne holder, int position)
    {
    holder.textView1.setText(String.valueOf(list.get(position).getContestId()));
    /*    int temp1 = list.get(position).getContestId();
       String s1 = list.get(position).getContestName();
       String temp2 = list.get(position).getRank();
        holder.textView1.setText(String.valueOf(temp1));
        holder.textView2.setText(s1);
        holder.textView3.setText(String.valueOf(temp2));*/
       holder.textView2.setText(list.get(position).getContestName());
       holder.textView3.setText(String.valueOf(list.get(position).getRank()));
           holder.textView4.setText(String.valueOf(list.get(position).getOldRating()));
      holder.textView5.setText(String.valueOf(list.get(position).getNewRating()));
   //   Log.d("ans 12323 - " ,list.get(position).getContestName().toString());



    }

    @Override
    public int getItemCount()
    {

        // return 0;
        return list.size();
    }



    public class view_ne extends RecyclerView.ViewHolder
    {
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private TextView textView4;
        private TextView textView5;

        public view_ne(@NonNull View itemView)
        {
            super(itemView);
            textView1 = itemView.findViewById(R.id.t1);
            textView2 = itemView.findViewById(R.id.t2);
            textView3 = itemView.findViewById(R.id.t3);
            textView4 = itemView.findViewById(R.id.t4);
            textView5 = itemView.findViewById(R.id.t5);

        }

    }







}

