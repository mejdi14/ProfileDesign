package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.example.profiledesign.R;
import com.example.profiledesign.epoxy.controller.TwoImageController;
import com.example.profiledesign.models.Photo;
import com.example.profiledesign.models.TwoPhotos;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.imageview.ShapeableImageView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.profile_image)
    ShapeableImageView profileImage;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.job)
    TextView job;

    @BindView(R.id.nb_photos)
    TextView nbPhotos;
    @BindView(R.id.photos)
    TextView photos;
    @BindView(R.id.nb_followers)
    TextView nbFollowers;
    @BindView(R.id.nb_followings)
    TextView nbFollowings;
    @BindView(R.id.followings)
    TextView followings;
    @BindView(R.id.recylerView)
    EpoxyRecyclerView recylerView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.option)
    ImageView option;
    @BindView(R.id.foward)
    ImageView foward;
    @BindView(R.id.followers)
    TextView followers;
    @BindView(R.id.guideline2)
    Guideline guideline2;
    @BindView(R.id.guideline)
    Guideline guideline;
    @BindView(R.id.follow)
    TextView follow;
    @BindView(R.id.main_frame)
    MotionLayout mainFrame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNavigationView.setItemIconTintList(null);
        List<TwoPhotos> photos = new ArrayList<>();
        loadData(photos);
        TwoImageController imageController = initEpoxyAdapter();
        initListAnimation();
        showList(photos, imageController);


    }

    @NotNull
    private TwoImageController initEpoxyAdapter() {
        TwoImageController imageController = new TwoImageController();
        recylerView.setAdapter(imageController.getAdapter());
        recylerView.setHasFixedSize(true);
        return imageController;
    }

    private void loadData(List<TwoPhotos> photos) {
        photos.add(new TwoPhotos(R.drawable.animal, R.drawable.flowers));
        photos.add(new TwoPhotos(R.drawable.owl, R.drawable.beach));
        photos.add(new TwoPhotos(R.drawable.sky, R.drawable.flowers));
    }

    private void initListAnimation() {
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(MainActivity.this, resId);
        recylerView.setLayoutAnimation(animation);
    }

    private void showList(List<TwoPhotos> photos, TwoImageController imageController) {

        imageController.setData(photos, new Photo(R.drawable.flowers, "flowers"));
    }

    @OnClick({R.id.profile_image, R.id.foward})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.profile_image:
                startActivity(new Intent(this, DetailsActivity.class));
                break;
            case R.id.foward:
                break;
        }
    }
}
