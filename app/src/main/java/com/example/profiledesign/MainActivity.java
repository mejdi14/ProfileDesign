package com.example.profiledesign;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profiledesign.epoxy.controller.ImageController;
import com.example.profiledesign.models.Photo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
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
    RecyclerView recylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
        List<Photo> photos=new ArrayList<>();
        photos.add(new Photo(R.drawable.image_profile,"hello"));
        photos.add(new Photo(R.drawable.arrow,"hello"));
        photos.add(new Photo(R.drawable.image_profile,"hello"));
        photos.add(new Photo(R.drawable.image_profile,"hello"));
        ImageController imageController=new ImageController();
        recylerView.setAdapter(imageController.getAdapter());
        imageController.setData(photos,true);
    }
}
