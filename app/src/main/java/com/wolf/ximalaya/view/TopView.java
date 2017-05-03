package com.wolf.ximalaya.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.databinding.TopBarItemBinding;
import com.wolf.ximalaya.presenter.PresentClick;
import com.wolf.ximalaya.presenter.TopClickListener;
import com.wolf.ximalaya.viewmodel.TopBarViewModel;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class TopView extends RelativeLayout {
    private TopBarItemBinding bindView;
    private LayoutInflater mInflater;
    private Context mCtx;
    private TopClickListener listener;

    public void setListener(TopClickListener listener) {
        this.listener = listener;
    }

    public TopView(Context context) {
        this(context, null);
    }

    public TopView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TopView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mCtx = context;
        bindView = DataBindingUtil.inflate(mInflater, R.layout.top_bar_item, this, true);
        bindView.setPresenter(click);
    }


    public void setTopbar(TopBarViewModel topbar) {
        bindView.setTopViewModel(topbar);
        bindView.root.setBackgroundResource(topbar.isNomal() ? R.drawable.top_bg : R.drawable.top_bg_nomal);
    }

    private PresentClick click = new PresentClick() {
        @Override
        public void click(int position) {
            if (listener != null) {
                switch (position) {
                    case LEFT_TYPE:
                        listener.clickLeft();
                        break;
                    case RIGHT_TYPE:
                        listener.clickRight();
                        break;
                    case RIGHT_TWO_TYPE:
                        listener.clickRightTwo();
                        break;
                    case TOP_INPUT_TYPE:
                        listener.clickInput();
                        break;
                }
            }


        }
    };
    public static final int LEFT_TYPE = 0;
    public static final int RIGHT_TYPE = 2;
    public static final int RIGHT_TWO_TYPE = 1;
    public static final int TOP_INPUT_TYPE = 3;

}
