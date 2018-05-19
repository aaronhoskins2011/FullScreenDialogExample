package com.aaronhoskins.fullscreendialogexample;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFullScreenDialog();
    }

    public void showFullScreenDialog() {


        Dialog dialog=new Dialog(this,android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.setContentView(R.layout.container_dialog);
        dialog.show();
    }



}
