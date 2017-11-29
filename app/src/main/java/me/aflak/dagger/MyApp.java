package me.aflak.dagger;

import android.app.Application;
import android.util.Log;

import me.aflak.dagger.component.DaggerImageDownloaderComponent;
import me.aflak.dagger.component.ImageDownloaderComponent;
import me.aflak.dagger.module.ImageDownloaderModule;

/**
 * Created by Omar on 04/06/2016.
 */
public class MyApp extends Application {
    private static MyApp app;
    private ImageDownloaderComponent imageDownloaderComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        Log.d("RhPark","MyApp onCreate");
        imageDownloaderComponent = DaggerImageDownloaderComponent.builder().imageDownloaderModule(new ImageDownloaderModule(this)).build();
    }

    public static MyApp app(){
        return app;
    }

    public ImageDownloaderComponent getImageDownloaderComponent(){
        Log.d("RhPark","MyApp getImageDownloaderComponent");
        return this.imageDownloaderComponent;
    }

}
