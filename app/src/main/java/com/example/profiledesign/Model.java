package com.example.profiledesign;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;

@EpoxyModelClass(layout = R.layout.model_layout)
public abstract class Model extends EpoxyModelWithHolder<Model.Holder> {

    @EpoxyAttribute String text;

    @Override
    public void bind(@NonNull Holder holder) {
        holder.textView.setText(text);
        holder.image.setBackgroundColor(Color.BLUE);
    }


    public static class Holder extends EpoxyHolder {
        private TextView textView;
        private ImageView image;

        @Override
        protected void bindView(@NonNull View itemView) {
            textView = itemView.findViewById(R.id.textView);
            image = itemView.findViewById(R.id.imageView);
        }
    }
}
