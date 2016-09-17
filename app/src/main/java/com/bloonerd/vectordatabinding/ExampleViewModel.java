package com.bloonerd.vectordatabinding;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.bloonerd.vectordatabinding.BR;

public class ExampleViewModel extends BaseObservable {

    private String text;

    public ExampleViewModel(String text) {
        this.text = text;
    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyChange();
    }
}
