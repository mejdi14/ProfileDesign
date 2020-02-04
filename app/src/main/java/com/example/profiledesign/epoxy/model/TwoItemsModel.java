package com.example.profiledesign.epoxy.model;

import android.annotation.SuppressLint;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.example.profiledesign.R;
import com.example.profiledesign.epoxy.base.BaseEpoxyHolder;
import com.google.android.material.imageview.ShapeableImageView;

import butterknife.BindView;

@EpoxyModelClass(layout = R.layout.two_images_item)
public abstract class TwoItemsModel extends EpoxyModelWithHolder<TwoItemsModel.Holder> {
    @EpoxyAttribute
    public
    int firstImageSource;
    @EpoxyAttribute
    public
    int secondImageSource;



    @SuppressLint("UnsafeExperimentalUsageError")
    @Override
    public void bind(Holder holder) {
        holder.firstImage.setImageResource(firstImageSource);
        holder.secondImage.setImageResource(secondImageSource);

    }

    static class Holder extends BaseEpoxyHolder {
        @BindView(R.id.first_image)
        ShapeableImageView firstImage;
        @BindView(R.id.second_image)
        ShapeableImageView secondImage;
    }
}
