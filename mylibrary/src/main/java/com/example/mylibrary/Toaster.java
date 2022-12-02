package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;

public class Toaster {

    public static void s(Context context, String url) {
        Intent myIntent = new Intent(context, MyWebViewMainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        myIntent.putExtra("redirectUrl", url);
        context.startActivity(myIntent);
    }
}
