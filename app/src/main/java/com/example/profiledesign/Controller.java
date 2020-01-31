package com.example.profiledesign;

import androidx.annotation.NonNull;

import com.airbnb.epoxy.EpoxyController;

import java.util.ArrayList;
import java.util.List;

public class Controller extends EpoxyController {

    public interface ControllerI {
        void visible(String id);
    }

    private List<Data> dataset = new ArrayList<>();
    private ControllerI callback;

    public Controller() {
        setDebugLoggingEnabled(BuildConfig.DEBUG);
        this.callback = callback;
    }

    public void setDataset(List<Data> data){
        dataset.addAll(data);
    }

    public void clearDataset() {
        dataset.clear();
    }

    @Override
    protected void buildModels() {
        for (Data d : dataset) {
            new Model_()
                    .id(d.getId())
                    .text(d.getData())

                    .addTo(this);
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
