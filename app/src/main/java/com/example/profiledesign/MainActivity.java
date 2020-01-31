package com.example.profiledesign;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.example.profiledesign.epoxy.controller.ImageController;
import com.example.profiledesign.models.Photo;
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
    private List<Data> dataset1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        //recylerView.setLayoutManager(new LinearLayoutManager(this));
        List<Photo> photos=new ArrayList<>();
        photos.add(new Photo(R.drawable.image_profile,"hello"));
        photos.add(new Photo(R.drawable.arrow,"hello"));
        photos.add(new Photo(R.drawable.image_profile,"hello"));
        photos.add(new Photo(R.drawable.image_profile,"hello"));

        dataset1.add(new Data("9c1ZnXN", "data with id 9c1ZnXN"));
        dataset1.add(new Data("12cxEGT", "data with id 12cxEGT"));
        dataset1.add(new Data("85e8L1b", "data with id 85e8L1b"));
        dataset1.add(new Data("e5cEI6T", "data with id e5cEI6T"));
        dataset1.add(new Data("c27QurT", "data with id c27QurT"));
        ImageController imageController=new ImageController();
        recylerView.setAdapter(imageController.getAdapter());
        /*imageController.setData(photos,true);
        imageController.requestModelBuild();*/

        /*controller = new Controller();
        recylerView.setAdapter(controller.getAdapter());*/
        EpoxyVisibilityTracker visibilityTracker = new EpoxyVisibilityTracker();
        visibilityTracker.attach(recylerView);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("here", "onClick: ");
                photos.add(new Photo(R.drawable.image_profile,"hello"));
                photos.add(new Photo(R.drawable.arrow,"hello"));
                photos.add(new Photo(R.drawable.image_profile,"hello"));
                photos.add(new Photo(R.drawable.image_profile,"hello"));
            /*    dataset1.add(new Data("9c1ZnXN", "data with id 9c1ZnXN"));
                dataset1.add(new Data("12cxEGT", "data with id 12cxEGT"));
                dataset1.add(new Data("85e8L1b", "data with id 85e8L1b"));
                dataset1.add(new Data("e5cEI6T", "data with id e5cEI6T"));
                dataset1.add(new Data("c27QurT", "data with id c27QurT"));
                controller.setDataset(dataset1);
                controller.requestModelBuild();*/
                    imageController.setData(photos,true);
        imageController.requestModelBuild();
            }
        });


    }

    @Override
    public void visible(String id) {

    }
}
