package com.example.will.timernotificationapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Counting");
        progressDialog.setMessage("Please wait...");
        progressDialog.setCancelable(true);
    }

    public void startCounter(View v){
        progressDialog.show();

        //execute Timer object
        Thread thread = new Thread(new Timer());
        thread.start();
    }

    public class Timer implements Runnable{

        @Override
        public void run(){
            for(int i = 5; i >= 0; i--){
                try {
                    Thread.sleep(1000);
                }catch(Exceptiong e){

                }
            }

            //close progress dialog
            progressDialog.dismiss();
        }
    }
}
