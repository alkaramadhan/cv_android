package com.example.windows.cv_kelas12;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAndroidAdapter extends RecyclerView.Adapter<CardViewAndroidAdapter.CardViewHolder> {

        private ArrayList<Android> listAndroid;
        public CardViewAndroidAdapter(ArrayList<Android> list){this.listAndroid = list;}

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
    View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_apps, viewGroup,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
    Android android =listAndroid.get(position);

        Glide.with(holder.itemView.getContext())
                .load(android.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
            holder.tvName.setText(android.getName());
            holder.tvFrom.setText(android.getFrom());




    }

    @Override
    public int getItemCount() {
        return listAndroid.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;


        public CardViewHolder(@NonNull  View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
        }
    }
}
