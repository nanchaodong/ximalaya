package com.wolf.ximalaya.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.wolf.ximalaya.R;
import com.wolf.ximalaya.databinding.PlayButtonItemBinding;
import com.wolf.ximalaya.presenter.PresentClick;

/**
 * Created by nanchaodong on 2017/4/29.
 */

public class PlayButton extends RelativeLayout {
    private PlayButtonItemBinding bindView;
    private LayoutInflater inflate;
    private Animation operatingAnim;
    private Context context;

    public PlayButton(Context context) {
        this(context, null);
    }

    public PlayButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PlayButton(final Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        bindView = DataBindingUtil.inflate(inflate, R.layout.play_button_item, this, true);
        operatingAnim = AnimationUtils.loadAnimation(context, R.anim.play_botton_rotate);
        operatingAnim.setInterpolator(new LinearInterpolator());
        bindView.setPresenter(click);
        this.context = context;
    }

    public void start() {
        if (operatingAnim != null) {
            bindView.profileImage.startAnimation(operatingAnim);
        }
    }

    public void stop() {
        bindView.profileImage.clearAnimation();
    }

    private PresentClick click = new PresentClick() {
        @Override
        public void click() {
            Toast.makeText(context, "点击", Toast.LENGTH_SHORT).show();
        }
    };
}
