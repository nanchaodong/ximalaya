package com.wolf.ximalaya.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;
import com.wolf.ximalaya.R;
import com.wolf.ximalaya.bean.TabBtn;
import com.wolf.ximalaya.databinding.TabBtnItemBinding;

/**
 * Created by nanchaodong on 2017/4/28.
 */

public class TabView extends RelativeLayout {
    private TabBtnItemBinding bindView;
    private LayoutInflater mInflater;
    private Context context;
    private TabBtn tabBtn;

    public TabView(Context context) {
        this(context, null);
    }

    public TabView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        bindView = DataBindingUtil.inflate(mInflater, R.layout.tab_btn_item, this, true);
        this.context = context;
    }

    public void setUp(TabBtn tabBtn) {
        this.tabBtn = tabBtn;
        if (tabBtn != null){
            Picasso.with(context).load(tabBtn.isSelected() ? tabBtn.getImageSelected() : tabBtn.getImageNomal()).into(bindView.image);
            bindView.text.setText(tabBtn.getTabName());
            bindView.text.setTextColor(tabBtn.isSelected() ? context.getResources().getColor(R.color.tab_selected_ff573d) : context.getResources().getColor(R.color.tab_nomal_bccbd1));
        }

    }

    public void showSelect(boolean flag) {
        if (tabBtn != null){
            Picasso.with(context).load(tabBtn.isSelected() ? tabBtn.getImageSelected() : tabBtn.getImageNomal()).into(bindView.image);
            bindView.text.setText(tabBtn.getTabName());
            bindView.text.setTextColor(tabBtn.isSelected() ? context.getResources().getColor(R.color.tab_selected_ff573d) : context.getResources().getColor(R.color.tab_nomal_bccbd1));
        }
    }
}
