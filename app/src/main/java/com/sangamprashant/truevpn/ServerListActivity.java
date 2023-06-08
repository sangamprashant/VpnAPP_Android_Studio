package com.sangamprashant.truevpn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sangamprashant.truevpn.Adapter.ServerListAdapter;
import com.sangamprashant.truevpn.Model.Servers;

import java.util.ArrayList;

public class ServerListActivity extends AppCompatActivity {
    RecyclerView ServerRecyclerView;
    ArrayList<Servers> ServerList;
    ServerListAdapter serverListAdapter;
    View GotoMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_list);

        ServerRecyclerView = findViewById(R.id.serverRecyclerView);
        GotoMainActivity = findViewById(R.id.gotoMainActivity2);

        GotoMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ServerListActivity.this, MainActivity.class));
            }
        });

        ServerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ServerList = getServerList();

        if (ServerList != null) {
            serverListAdapter = new ServerListAdapter(this, ServerList);
            ServerRecyclerView.setAdapter(serverListAdapter);
        }
    }

    private ArrayList<Servers> getServerList() {
        ArrayList<Servers> servers = new ArrayList<>();
        servers.add(new Servers("Japan", Utils.getImage(R.drawable.japan), "japan.ovpn", "vpn", "vpn"));
        servers.add(new Servers("Korea", Utils.getImage(R.drawable.korea), "korea.ovpn", "vpn", "vpn"));
        servers.add(new Servers("Sweden", Utils.getImage(R.drawable.sweden), "sweden.ovpn", "vpn", "vpn"));
        servers.add(new Servers("US", Utils.getImage(R.drawable.us), "us.ovpn", "vpn", "vpn"));
        return servers;
    }
}
