package com.anhttvn.customrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.anhttvn.customrecyclerview.adapter.ListAdapter;
import com.anhttvn.customrecyclerview.model.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleview;
    private List<ItemAdapter> mList = new ArrayList<>();
    private ListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addList();
        adapter();
    }
    private void init(){
        mRecycleview = findViewById(R.id.listView);
    }
    private void addList(){
        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.cachua);
        itemAdapter.setText("Tomato");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.bo);
        itemAdapter.setText("butter");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.cam);
        itemAdapter.setText("oranges");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.quaxoai);
        itemAdapter.setText("mango");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.dau);
        itemAdapter.setText("strawberry");

        mList.add(itemAdapter);
        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.tao);
        itemAdapter.setText("Apple");
        mList.add(itemAdapter);

        mList.add(itemAdapter);
        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.oi);
        itemAdapter.setText("guava fruit");
        mList.add(itemAdapter);
    }

    private void adapter(){
        Log.d("anhtt","mlist : " +mList.size());
        mAdapter = new ListAdapter(mList, this);
        mRecycleview.setAdapter(mAdapter);
        mRecycleview.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.notifyDataSetChanged();

    }
}
