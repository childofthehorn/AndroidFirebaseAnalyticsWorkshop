package com.google.firebase.quickstart.analytics;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by sdevino on 9/13/17.
 */

public class MainApplication extends Application {

    /**
     * The {@code FirebaseAnalytics} used to record screen views.
     */
    // [START declare_analytics]
    private FirebaseAnalytics mFirebaseAnalytics;
    // [END declare_analytics]

    private static MainApplication application;

    ///////////////////////////////////////////////////////////////////////////
    // Application Lifecycle
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void onCreate() {
        super.onCreate();
        //We want the Firebase Analytics initialized right at startup
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

            application = this;
    }

    public static MainApplication getInstance() {
        if (application == null) Log.e("ANALYTICS", "APP IS NULL - FATAL");
        return application;
    }

    /*
    public void addSpecial(){
        mFirebaseAnalytics.setSessionTimeoutDuration(1000000); //in milliseconds
        mFirebaseAnalytics.setMinimumSessionDuration(5000); //in milliseconds
        mFirebaseAnalytics.setAnalyticsCollectionEnabled(true);
    }
    */
}
