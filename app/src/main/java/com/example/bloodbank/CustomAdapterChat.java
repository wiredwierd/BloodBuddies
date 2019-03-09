package com.example.bloodbank;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;



import java.util.List;

public class CustomAdapterChat extends ArrayAdapter<ModelChat> {
    Context context;
    int resource;
    List<ModelChat> messagelist;
    public CustomAdapterChat(Context context, int resource, List<ModelChat> messagelist) {
        super(context, resource, messagelist);
        this.context=context;
        this.resource=resource;
        this.messagelist=messagelist;
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.list_item,null);
        TextView messageuser=view.findViewById(R.id.message_user);
        TextView messagetext=view.findViewById(R.id.message_text);


        ModelChat message=messagelist.get(position);

        messageuser.setText(message.getMessageuser());
        messagetext.setText(message.getMessagetext());

        return view;

    }
}
