package com.example.profiledesign.epoxy.base;

import android.view.View;

import androidx.annotation.CallSuper;

import com.airbnb.epoxy.EpoxyHolder;

import butterknife.ButterKnife;

public abstract class BaseEpoxyHolder extends EpoxyHolder {
    @CallSuper
    @Override
    protected void bindView(View itemView) {
        ButterKnife.bind(this, itemView);
    }
}
