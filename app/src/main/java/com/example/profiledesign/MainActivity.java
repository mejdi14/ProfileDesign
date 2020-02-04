package com.example.profiledesign;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.example.profiledesign.epoxy.controller.TwoImageController;
import com.example.profiledesign.models.TwoPhotos;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements Controller.ControllerI{
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.profile_image)
    CircleImageView profileImage;
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
    Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        //recylerView.setLayoutManager(new LinearLayoutManager(this));
        List<TwoPhotos> photos=new ArrayList<>();
        photos.add(new TwoPhotos(R.drawable.car,R.drawable.flowers));
        photos.add(new TwoPhotos(R.drawable.quality_face,R.drawable.buildings));
        photos.add(new TwoPhotos(R.drawable.image_profile,R.drawable.image_profile));
        photos.add(new TwoPhotos(R.drawable.image_profile,R.drawable.image_profile));
        TwoImageController imageController=new TwoImageController();
        recylerView.setAdapter(imageController.getAdapter());

        EpoxyVisibilityTracker visibilityTracker = new EpoxyVisibilityTracker();
        visibilityTracker.attach(recylerView);
        showList(photos, imageController);



    }

    private void showList(List<TwoPhotos> photos, TwoImageController imageController) {

        imageController.setData(photos,true);
        imageController.requestModelBuild();
    }

    @Override
    public void visible(String id) {

    }
}
