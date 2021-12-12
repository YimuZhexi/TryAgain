package com.example.tryagain.recycler;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tryagain.R;
import com.example.tryagain.adapter.adapter;
import com.example.tryagain.data.outText;

import java.util.ArrayList;
import java.util.Objects;

public class Recycler extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_recycler, container, false);
        dataAdd();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void dataAdd() {
        ArrayList<outText> data = new ArrayList<>();
        outText text = new outText();
        text.setHead("我太难了");
        text.setBody("为什么上一个App被我写废了:(");
        data.add(text);
        text = new outText();
        text.setHead("之前认为的分包：");
        text.setBody("就算不分包\n我也一定能知道啥是啥的喵\n分包对我来说毫无作用");
        data.add(text);
        text = new outText();
        text.setHead("现在看分包：");
        text.setBody("我为什么之前没分包:(\n谁来告诉我我之前写了写啥嘛");
        data.add(text);
        text = new outText();
        text.setHead("我保证：");
        text.setBody("我以后一定分包:(\n一定写注释:(");
        data.add(text);
        StringBuilder a = new StringBuilder(":(");
        for (int i = 0; i < 10; i++) {
            text = new outText();
            text.setHead(":(");
            text.setBody(":(" + a);
            data.add(text);
            a.append(":(");
        }
        text = new outText();
        text.setHead("但是：");
        text.setBody("我这次还是没有写注释:(");
        data.add(text);
        text = new outText();
        text.setHead("满脸敷衍：");
        text.setBody(":(");
        data.add(text);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new DividerItemDecoration(Objects.requireNonNull(getActivity()), DividerItemDecoration.VERTICAL));
        adapter myAdapter = new adapter(data);
        recyclerView.setAdapter(myAdapter);
    }
}