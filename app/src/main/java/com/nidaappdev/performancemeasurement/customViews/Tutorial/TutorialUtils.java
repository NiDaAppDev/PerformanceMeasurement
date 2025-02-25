package com.nidaappdev.performancemeasurement.customViews.Tutorial;

import android.content.res.Resources;

public class TutorialUtils {

    public static int pxToDp(int px){
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int dpToPx(int dp){
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}