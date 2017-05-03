package com.wolf.ximalaya.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.wolf.ximalaya.presenter.multiple.PresentImpl;
import com.wolf.ximalaya.presenter.multiple.TypeFactoryList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class BaseRecyclerAdapter extends RecyclerView.Adapter<BaseRecyclerHolder> {
    private Context context;
    private List<PresentImpl> datas;
    private TypeFactoryList factoryList;

    public BaseRecyclerAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();
        factoryList = new TypeFactoryList();
    }

    public <T extends PresentImpl> void add(List<T> list) {
        this.datas.clear();
        this.datas.addAll(list);
//        notifyDataSetChanged();
    }

    public <T extends PresentImpl> void addBean(T t) {
        this.datas.add(t);
        notifyItemInserted(this.datas.size() -1);
    }
    public <T extends PresentImpl> void addRefreshBean(T t) {
        this.datas.clear();
        this.datas.add(t);
        notifyItemInserted(this.datas.size() -1);
    }
    public <T extends PresentImpl> void addLoadData(List<T> list) {
        this.datas.addAll(list);
        notifyDataSetChanged();
    }
    public void clear(){
        this.datas.clear();
    }


    @Override
    public BaseRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = View.inflate(context, viewType, null);
        return factoryList.createHolder(viewType, item, this);
    }

    @Override
    public void onBindViewHolder(BaseRecyclerHolder holder, int position) {
        holder.setUp(datas.get(position), position);


    }

    @Override
    public int getItemCount() {
        return datas != null && datas.size() > 0 ? datas.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return datas.get(position).type(factoryList);
    }
}
