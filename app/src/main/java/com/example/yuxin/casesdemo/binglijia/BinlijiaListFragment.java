package com.example.yuxin.casesdemo.binglijia;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuxin.casesdemo.BaseFragmentV4;
import com.example.yuxin.casesdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuXin on 2018/5/22.
 */

public class BinlijiaListFragment extends BaseFragmentV4{

    private RecyclerView contentView;
    private List<Object> data = new ArrayList<>();
    private BinlijiaAdapter binlijiaAdapter;


    @Override
    protected void initData() {
        for (int i=0; i < 30;i++){
            data.add(new Object());
        }
        binlijiaAdapter = new BinlijiaAdapter(data);
        contentView.setAdapter(binlijiaAdapter);
    }

    @Override
    protected void initView() {
        contentView = (RecyclerView) findViewById(R.id.vp_content);
        GridLayoutManager manager = new GridLayoutManager(getActivity(),1);
        contentView.setLayoutManager(manager);
    }

    @Override
    protected int loadLayout() {
        return R.layout.fragment_binlijia_list;
    }

}


class BinlijiaAdapter extends RecyclerView.Adapter {

    private List<Object> data;

    private static final int TYPE_IMAGE = 0x001;
    private static final int TYP_NO_IMAGE = 0x0012;

    public BinlijiaAdapter(List<Object> data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        if(position % 2 == 0){
            return TYPE_IMAGE;
        }
        if(position % 3 == 1){
            return TYP_NO_IMAGE;
        }
        return TYPE_IMAGE;
    } // end m

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = new View(parent.getContext());
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if(viewType == TYPE_IMAGE){
            itemView = inflater.inflate(R.layout.item_binlijia_image,null);
        }
        if(viewType == TYP_NO_IMAGE){
            itemView = inflater.inflate(R.layout.item_binlijia_no_image,null);
        }
        BinlijiaViewHolder holder = new BinlijiaViewHolder(itemView);
        return holder;
    } // end m

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof BinlijiaViewHolder){
            BinlijiaViewHolder binlijiaViewHolder = (BinlijiaViewHolder) holder;
            binlijiaViewHolder.setData(position);
        }
    } // end m

    @Override
    public int getItemCount() {
        return data.size();
    } // end m

}

class BinlijiaViewHolder extends RecyclerView.ViewHolder {

    private View itemView;

    public BinlijiaViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
    }


    public void setData(int position){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}