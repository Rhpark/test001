package me.aflak.dagger.model;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * Created by Omar on 04/06/2016.
 */
public class ImageDownloader {
    private Context context;

    public ImageDownloader(Context context) {
        Log.d("RhPark","ImageDownloader");
        this.context = context;
    }

    public void toImageView(ImageView imageView, String url){
        Log.d("RhPark","ImageDownloader toImageView");
        Glide.with(context).load(url).into(imageView);
        // (one of the) advantage of Dagger: you can now simply switch between two libraries
        // Picasso.with(context).load(url).into(imageView);
    }
}
