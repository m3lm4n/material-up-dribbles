package com.lastowski.material.screens;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

/**
 * Created by adamlastowski on 29.01.15.
 */
public class DetailsView extends CardView {

    public DetailsView(Context context) {
        super(context);
    }

    public DetailsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DetailsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }


}
