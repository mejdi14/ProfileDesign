package com.example.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.profiledesign.R;
import com.google.android.material.imageview.ExperimentalImageView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.image)
    ShapeableImageView image;

    @SuppressLint("UnsafeExperimentalUsageError")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        setUpImageView();
    }
    @ExperimentalImageView
    private void setUpImageView() {
        float roundRaduis = 400f;
        float cutRaduis = 450f;

        image.setShapeAppearanceModel(image.getShapeAppearanceModel()
                .toBuilder()
                .setBottomLeftCorner(CornerFamily.ROUNDED,roundRaduis)
                .build());
    }
}
