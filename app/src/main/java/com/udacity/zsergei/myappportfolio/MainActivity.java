package com.udacity.zsergei.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void spotifyStreamerLaunch(View view) {
        showToast("This button will launch my spotify streamer app!");
    }

    public void scoresAppLaunch(View view) {
        showToast("This button will launch my scores app!");
    }

    public void libraryAppLaunch(View view) {
        showToast("This button will launch my library app!");
    }

    public void buildItBiggerLaunch(View view) {
        showToast("This button will launch my 'build it bigger' app!");
    }

    public void xyzReaderLaunch(View view) {
        showToast("This button will launch my xyz reader app!");
    }

    public void capstoneLaunch(View view) {
        showToast("This button will launch my capstone app!");
    }

    private void showToast(String text)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
