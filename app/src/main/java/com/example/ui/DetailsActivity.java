package com.example.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.profiledesign.R;
import com.google.android.material.imageview.ExperimentalImageView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.image)
    ShapeableImageView image;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.options)
    ImageView options;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.location_icon)
    ImageView locationIcon;
    @BindView(R.id.location_name)
    TextView locationName;
    @BindView(R.id.purple_background)
    ImageView purpleBackground;
    @BindView(R.id.download)
    ImageView download;
    @BindView(R.id.heart)
    ImageView heart;
    @BindView(R.id.message)
    ImageView message;
    @BindView(R.id.bookmark)
    ImageView bookmark;
    @BindView(R.id.large_text)
    TextView largeText;
    @BindView(R.id.hashtag1)
    TextView hashtag1;
    @BindView(R.id.hashtag2)
    TextView hashtag2;
    @BindView(R.id.main_frame)
    ConstraintLayout mainFrame;

    @SuppressLint("UnsafeExperimentalUsageError")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        setUpImageView();
        setUpItemsAnimations();
    }

    private void setUpItemsAnimations() {
        animateName();
        animateLocation();
        animateLargeText();
        animateIcons();
        animateHashtags();
        animateDownloadButton();
    }

    private void animateDownloadButton() {
        purpleBackground.animate()
                .translationX(0f)
                .alpha(1f)
                .setDuration(800)
                .start();
        download.animate()
                .translationX(0f)
                .alpha(1f)
                .setDuration(800)
                .start();
    }

    private void animateIcons() {
        heart.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(600)
                .start();
        message.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(600)
                .start();
        bookmark.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(600)
                .start();
    }

    private void animateHashtags() {
        hashtag1.animate()
                .translationY(0f)
                .alpha(0.64f)
                .setDuration(800)
                .start();
        hashtag2.animate()
                .translationY(0f)
                .alpha(0.64f)
                .setDuration(800)
                .start();
    }

    private void animateLargeText() {
        largeText.animate()
                .translationY(0f)
                .alpha(0.4f)
                .setDuration(700)
                .start();

    }

    private void animateLocation() {
        locationIcon.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(500)
                .start();
        locationName.animate()
                .translationY(0f)
                .alpha(0.4f)
                .setDuration(500)
                .start();
    }

    private void animateName() {
        name.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(400)
                .start();
    }


    @ExperimentalImageView
    private void setUpImageView() {
        float roundRaduis = 400f;
        float cutRaduis = 450f;

        image.setShapeAppearanceModel(image.getShapeAppearanceModel()
                .toBuilder()
                .setBottomLeftCorner(CornerFamily.ROUNDED, roundRaduis)
                .build());
    }





    @OnClick({R.id.back, R.id.download})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                startActivity(new Intent(this,MainActivity.class));
                break;
            case R.id.download:
                break;
        }
    }
}
