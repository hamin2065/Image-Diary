package com.example.imagediary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    private ItemRecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private TextView buttonRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        //xml에서의 recyclerView 를 Activity와 연결
        recyclerView = findViewById(R.id.recycler);
        buttonRecycler = findViewById(R.id.button);

        //recyclerView 에게 layoutManager 할당
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //선언했던 adapter을 초기화
        adapter = new ItemRecyclerAdapter();

        //recyclerView 에 adapter할당
        recyclerView.setAdapter(adapter);
        getData();
        buttonRecycler.setOnClickListener(view ->{
            adapter.addItem(new ItemData("","new name","new desc"));
            adapter.notifyDataSetChanged();
        });
    }

    private void getData(){
        //adapter에 item(데이터)추가
        for(int i = 0;i<=9;i++)adapter.addItem(new ItemData("image","이름"+i,"소개"+i));
        //adapter 재시동
        adapter.notifyDataSetChanged();
    }


}}