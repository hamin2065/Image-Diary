package com.example.imagediary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ItemRecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private TextView buttonRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_recycler);
        buttonRecycler = findViewById(R.id.button_recycler);



    }

    private void getData(){
        //adapter에 item(데이터)추가
        for(int i = 0;i<=9;i++)adapter.addItem(new ItemData("image","이름"+i,"소개"+i));
        //adapter 재시동
        adapter.notifyDataSetChanged();
    }
}