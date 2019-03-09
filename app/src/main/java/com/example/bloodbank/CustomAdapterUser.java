package com.example.bloodbank;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapterUser extends ArrayAdapter<ModelUser> {

    Context context;
    int resource;
    List<ModelUser> userlist;
    public CustomAdapterUser(Context context, int resource, List<ModelUser> userlist) {
        super(context, resource, userlist);
        this.context=context;
        this.resource=resource;
        this.userlist=userlist;
    }


    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.user_item,null);
        TextView username=view.findViewById(R.id.username);
        TextView blood=view.findViewById(R.id.blood);
        ImageView userimage=view.findViewById(R.id.userimage);

        ModelUser user=userlist.get(position);

        username.setText(user.getUsername());
        blood.setText(user.getBldgrp());
        Picasso.get().load(user.getImageUrl()).resize(56,56).centerCrop().into(userimage);


     return view;
    }
}
