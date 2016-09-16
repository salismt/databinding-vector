package com.bloonerd.vectordatabinding;

import android.content.Context;

public class ExampleViewModel {

    private String text;

    public ExampleViewModel(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
