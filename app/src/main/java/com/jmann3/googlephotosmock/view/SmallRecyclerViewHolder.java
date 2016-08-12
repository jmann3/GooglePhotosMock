package com.jmann3.googlephotosmock.view;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

public class SmallRecyclerViewHolder extends RecyclerView.ViewHolder{
    private final ImageView imageView;

    public SmallRecyclerViewHolder(ImageView imageView) {
        super(imageView);
        this.imageView = imageView;
    }

    public void setImageResource(@DrawableRes int id) {
        imageView.setImageResource(id);
    }
}
