package com.sangamprashant.truevpn.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sangamprashant.truevpn.Model.Servers;
import com.sangamprashant.truevpn.R;

import java.util.ArrayList;

public class ServerListAdapter extends RecyclerView.Adapter<ServerListAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Servers> serverList;

    public ServerListAdapter(Context context, ArrayList<Servers> serverList) {
        this.context = context;
        this.serverList = serverList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.serverlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Servers server = serverList.get(position);
        holder.serverName.setText(server.getServerCountry());

        // Load image using Glide library
        Glide.with(context).load(server.getFlagUrl()).into(holder.serverIcon);
    }

    @Override
    public int getItemCount() {
        return serverList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView serverIcon;
        TextView serverName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            serverIcon = itemView.findViewById(R.id.serverIcon);
            serverName = itemView.findViewById(R.id.serverName);
        }
    }
}
