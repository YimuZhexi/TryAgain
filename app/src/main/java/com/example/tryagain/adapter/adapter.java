package com.example.tryagain.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tryagain.R;
import com.example.tryagain.data.outText;

import java.util.ArrayList;

/**
 * recyclerView界面的adapter
 */

public class adapter extends RecyclerView.Adapter<adapter.InnerHolder> {

    //创建ArrayList储存数据
    private final ArrayList<outText>arrayList;

    public adapter(ArrayList<outText>data){
        this.arrayList=data;
    }

    @NonNull
    @Override
    public adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false));
    }

    //设置recyclerView数据
    @Override
    public void onBindViewHolder(@NonNull adapter.InnerHolder holder, int position) {
        holder.tvHead.setText(arrayList.get(position).getHead());
        holder.tvBody.setText(arrayList.get(position).getBody());
    }

    //获得recyclerView长度
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //绑定控件和item页面
    public static class InnerHolder extends RecyclerView.ViewHolder{
        TextView tvHead;
        TextView tvBody;
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            tvHead = (TextView) itemView.findViewById(R.id.tv_item_head);
            tvBody = (TextView) itemView.findViewById(R.id.tv_item_body);
        }
    }
}
