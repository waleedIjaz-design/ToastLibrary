package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s (Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }


    public static double addition(Context context, double a, double b){

        return a+b;
    }

    public static double subtraction(Context context, double a, double b){

        return a-b;
    }


}