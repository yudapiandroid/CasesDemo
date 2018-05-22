package com.example.yuxin.casesdemo.jingpinbingli;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuxin.casesdemo.BaseActivity;
import com.example.yuxin.casesdemo.BaseFragmentV4;
import com.example.yuxin.casesdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuXin on 2018/5/22.
 */
public class CasesListFragment extends BaseFragmentV4 {

    private RecyclerView contentView;
    private List<Object> data = new ArrayList<>();
    private CasesAdapter casesAdapter;

    @Override
    protected void initData() {
        for (int i=0; i < 30;i++){
            data.add(new Object());
        }
        casesAdapter = new CasesAdapter(data);
        contentView.setAdapter(casesAdapter);
    } // end initData

    @Override
    protected void initView() {
        contentView = (RecyclerView) findViewById(R.id.vp_content);
        GridLayoutManager manager = new GridLayoutManager(getActivity(),1);
        contentView.setLayoutManager(manager);
    }

    @Override
    protected int loadLayout() {
        return R.layout.fragment_cases_list;
    }

}

class CasesAdapter extends RecyclerView.Adapter {

    private List<Object> data;

    private static final int TYPE_1_BANNER = 0x0011;
    private static final int TYPE_3_IMAGES = 0x0012;
    private static final int TYPE_1_IMAGES = 0x0013;

    public CasesAdapter(List<Object> data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        if(position % 3 == 0){
            return TYPE_1_BANNER;
        }
        if(position % 3 == 1){
            return TYPE_1_IMAGES;
        }
        if(position % 3 == 2){
            return TYPE_3_IMAGES;
        }
        return TYPE_3_IMAGES;
    } // end m

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = new View(parent.getContext());
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if(viewType == TYPE_1_BANNER){
            itemView = inflater.inflate(R.layout.item_cases_1_banner,null);
        }
        if(viewType == TYPE_1_IMAGES){
            itemView = inflater.inflate(R.layout.item_cases_1_image,null);
        }
        if(viewType == TYPE_3_IMAGES){
            itemView = inflater.inflate(R.layout.item_cases_3_image,null);
        }
        CasesViewHolder holder = new CasesViewHolder(itemView);
        return holder;
    } // end m

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CasesViewHolder viewHolder = (CasesViewHolder) holder;
        viewHolder.setData(position);
    } // end m

    @Override
    public int getItemCount() {
        return data.size();
    } // end m

}

class CasesViewHolder extends RecyclerView.ViewHolder {

    private View itemView;

    public CasesViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
    }


    public void setData(int position){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseActivity.startActivity(CasesDetailActivity.class,v.getContext());
            }
        });
    }

}