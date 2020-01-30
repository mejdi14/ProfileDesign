package com.example.profiledesign.epoxy.controller;

import android.util.Log;

import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.example.profiledesign.epoxy.model.ItemModel_;
import com.example.profiledesign.models.Photo;

import java.util.List;

public class ImageController extends Typed2EpoxyController<List<Photo>, Boolean> {
    @AutoModel
    ItemModel_ itemModel;

    @Override
    protected void buildModels(List<Photo> photos, Boolean loadingMore) {
        Log.d("adapter", "buildModels: "+photos);
       for (Photo photo:photos)
           itemModel.imageSource(photo.getImage());
    }
}
