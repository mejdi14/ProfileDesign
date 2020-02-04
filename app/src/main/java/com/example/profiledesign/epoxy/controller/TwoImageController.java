package com.example.profiledesign.epoxy.controller;

import androidx.annotation.NonNull;

import com.airbnb.epoxy.EpoxyController;
import com.example.profiledesign.BuildConfig;
import com.example.profiledesign.epoxy.model.TwoItemsModel_;
import com.example.profiledesign.models.TwoPhotos;

import java.util.ArrayList;
import java.util.List;

public class TwoImageController extends EpoxyController {

    public TwoImageController() {
        setDebugLoggingEnabled(BuildConfig.DEBUG);
    }
    private List<TwoPhotos> photos = new ArrayList<>();
    public void setData(List<TwoPhotos> data, boolean b){
        photos.addAll(data);
    }

    public void clearDataset() {
        photos.clear();
    }

    @Override
    protected void buildModels() {
        int counter=0;
        for (TwoPhotos photo:photos){
            new TwoItemsModel_()
                    .id(counter)
                    .firstImageSource(photo.getFirstImage())
                    .secondImageSource(photo.getSecondImage())
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
