package com.example.profiledesign.epoxy.controller;

import androidx.annotation.NonNull;

import com.airbnb.epoxy.EpoxyController;
import com.example.profiledesign.BuildConfig;
import com.example.profiledesign.epoxy.model.ItemModel_;
import com.example.profiledesign.models.Photo;

import java.util.ArrayList;
import java.util.List;

public class ImageController extends EpoxyController {

    public ImageController() {
        setDebugLoggingEnabled(BuildConfig.DEBUG);
    }
    private List<Photo> photos = new ArrayList<>();
    public void setData(List<Photo> data,boolean b){
        photos.addAll(data);
    }

    public void clearDataset() {
        photos.clear();
    }

    @Override
    protected void buildModels() {
        int counter=0;
        for (Photo photo:photos){
            new ItemModel_()
                    .id(counter)
                    .text("hello")
                    .imageSource(photo.getImage())
            .addTo(this);
            counter++;
        }
    }
    @Override
    protected void onExceptionSwallowed(@NonNull RuntimeException exception) {
        if(BuildConfig.DEBUG) {
            throw exception;
        } else {
            super.onExceptionSwallowed(exception);
        }
    }
}
