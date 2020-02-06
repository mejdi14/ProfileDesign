package com.example.profiledesign.epoxy.model;

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
    public
    int imageSource;

    @Override
    public void bind(Holder holder) {
        holder.fullImage.setImageResource(imageSource);

    }

    static class Holder extends BaseEpoxyHolder {
        @BindView(R.id.full_image)
        ImageView fullImage;

    }
}