package com.example.android.news_app_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<com.example.android.news_app_task.CustomViewHolder> {
    private Context context;
    private List<NewsHeadlines> headlines;

    public CustomAdapter(Context context, List<NewsHeadlines> headlines) {
        this.context = context;
        this.headlines = headlines;
    }

    @NonNull
    @Override
    public com.example.android.news_app_task.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new com.example.android.news_app_task.CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull com.example.android.news_app_task.CustomViewHolder holder, int position) {
        holder.text_title.setText(headlines.get(position).getTitle());
        holder.text_source.setText(headlines.get(position).getSource().getName());

        if(headlines.get(position).getUrlToImage()!=null)
        {
            Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.img_headlines);

        }

    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
