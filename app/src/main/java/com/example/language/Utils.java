package com.example.language;

import android.app.Activity;
import android.content.Intent;

public class Utils {
    private static int sTheme;

    public final static int MARGIN_BIG = 0;
    public final static int MARGIN_AVERAGE = 1;
    public final static int MARGIN_SMALL = 2;


    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case MARGIN_BIG:
                activity.setTheme(R.style.MarginBig);
                break;
            case MARGIN_AVERAGE:
                activity.setTheme(R.style.MarginAverage);
                break;
            case MARGIN_SMALL:
                activity.setTheme(R.style.MarginSmall);
                break;
        }
    }
}