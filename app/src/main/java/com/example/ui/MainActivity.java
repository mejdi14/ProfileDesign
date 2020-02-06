package com.example.ui;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.profile_image)
    ShapeableImageView profileImage;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.job)
    TextView job;
    @BindView(R.id.follow)
    TextView follow;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNavigationView.setItemIconTintList(null);
        List<TwoPhotos> photos=new ArrayList<>();
        loadData(photos);
        TwoImageController imageController = initEpoxyAdapter();
        initListAnimation();
        showList(photos, imageController);




    }

    @NotNull
    private TwoImageController initEpoxyAdapter() {
        TwoImageController imageController=new TwoImageController();
        recylerView.setAdapter(imageController.getAdapter());
        recylerView.setHasFixedSize(true);
        return imageController;
    }

    private void loadData(List<TwoPhotos> photos) {
        photos.add(new TwoPhotos(R.drawable.animal,R.drawable.flowers));
        photos.add(new TwoPhotos(R.drawable.owl,R.drawable.beach));
        photos.add(new TwoPhotos(R.drawable.sky,R.drawable.flowers));
    }

    private void initListAnimation() {
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(MainActivity.this, resId);
        recylerView.setLayoutAnimation(animation);
    }

    private void showList(List<TwoPhotos> photos, TwoImageController imageController) {

        imageController.setData(photos,new Photo(R.drawable.flowers,"flowers"));
    }

}
