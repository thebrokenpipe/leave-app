package com.meterohead.leave.mainactivity;

import android.databinding.Bindable;

import com.meterohead.leave.ViewModel;

/**
 * Created by Lenovo on 2016-09-09.
 */

public class ActivityViewModel extends ViewModel{
    private String title;

    @Bindable
    public String getTitle() {
        return title;
    }

    @Bindable
    public void setTitle(String title) {
        this.title = title;
    }
}