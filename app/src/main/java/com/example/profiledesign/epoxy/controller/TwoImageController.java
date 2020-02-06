package com.example.profiledesign.epoxy.controller;

import androidx.annotation.NonNull;

import com.airbnb.epoxy.Typed2EpoxyController;
import com.example.profiledesign.BuildConfig;
import com.example.profiledesign.epoxy.model.ItemModel_;
import com.example.profiledesign.epoxy.model.TwoItemsModel_;
import com.example.profiledesign.models.Photo;
import com.example.profiledesign.models.TwoPhotos;

import java.util.List;

public class TwoImageController extends Typed2EpoxyController<List<TwoPhotos>, Photo> {

    @Override
    protected void buildModels(List<TwoPhotos> photos, Photo singlePhoto) {
        int counter=0;
        for (TwoPhotos photo:photos){
            new TwoItemsModel_()
                    .id(counter)
                    .firstImageSource(photo.getFirstImage())
                    .secondImageSource(photo.getSecondImage())
                    .addTo(this);
            counter++;
        }
        new ItemModel_()
                .id(10)
                .imageSource(singlePhoto.getImage())
                .addTo(this);
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
