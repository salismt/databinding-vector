package com.bloonerd.vectordatabinding;

import android.content.Context;
import android.content.res.Resources;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.DrawableRes;
import android.text.Editable;
import android.text.TextWatcher;

import com.bloonerd.vectordatabinding.BR;

public class ExampleViewModel extends BaseObservable {

    private String text;
    private String inputText;
    private int image = R.drawable.ic_android;;

    public ExampleViewModel(String text) {
        this.text = text;
    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

    @Bindable
    public String getInputText() {
        return inputText;
    }

    public TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            inputText = s.toString();
            notifyChange();
        }
    };

    @Bindable
    public int getImage() {
        return image;
    }

    public void setImage(@DrawableRes int image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

}
