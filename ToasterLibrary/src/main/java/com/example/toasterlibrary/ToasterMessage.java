package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s (Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

    public static int addition(Context context, int a, int b){

        return a+b;
    }

    public static int subtraction(Context context, int a, int b){

        return a-b;
    }


}