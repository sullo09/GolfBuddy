package com.example.sullo.golfbuddy.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.example.sullo.golfbuddy.Adaptor.MyAdapter;
import com.example.sullo.golfbuddy.Model.ListItems;
import com.example.sullo.golfbuddy.R;

import java.util.ArrayList;
import java.util.List;

public class MainMenuScreen extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adaptor;
    private List<ListItems> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_screen);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 0; i< 10; i ++){
            ListItems item = new ListItems (
                "Item " + (i+1),"image"
            );
            listItems.add(item);
        }

        adaptor = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adaptor);

    }
}
