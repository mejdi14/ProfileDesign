package com.example.profiledesign.epoxy.model;

import android.view.View;
import android.widget.ImageView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.example.profiledesign.R;
import com.example.profiledesign.epoxy.base.BaseEpoxyHolder;

import butterknife.BindView;

@EpoxyModelClass(layout = R.layout.single_image_item)
public abstract class ItemModel extends EpoxyModelWithHolder<ItemModel.Holder> {
    @EpoxyAttribute
    int imageSource;
    @EpoxyAttribute
    View.OnClickListener clickListener;

    @Override
    public void bind(Holder holder) {
        holder.image.setImageResource(imageSource);
        holder.image.setOnClickListener(clickListener);
    }

    static class Holder extends BaseEpoxyHolder {
        @BindView(R.id.image)
        ImageView image;
    }
}