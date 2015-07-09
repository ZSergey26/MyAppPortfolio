package com.udacity.zsergei.myappportfolio;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static String TAG = "My App Portfolio ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void spotifyStreamerLaunch() {
        showToast("This button will launch my spotify streamer app!");
    }

    public void scoresAppLaunch() {
        showToast("This button will launch my scores app!");
    }

    public void libraryAppLaunch() {
        showToast("This button will launch my library app!");
    }

    public void buildItBiggerLaunch() {
        showToast("This button will launch my 'build it bigger' app!");
    }

    public void xyzReaderLaunch() {
        showToast("This button will launch my xyz reader app!");
    }

    public void capstoneLaunch() {
        showToast("This button will launch my capstone app!");
    }

    private void showToast(String text)
    {
        Context context = MainActivity.this;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onButtonClickListener(View view) {
        switch(view.getId())
        {
            case R.id.spotifyStreamerButton :
                spotifyStreamerLaunch();
                break;

            case R.id.scoresAppButton :
                scoresAppLaunch();
                break;

            case R.id.libraryAppButton :
                libraryAppLaunch();
                break;

            case R.id.buildItBiggerButton :
                buildItBiggerLaunch();
                break;

            case R.id.xyzReaderButton :
                xyzReaderLaunch();
                break;

            case R.id.capstoneButton :
                capstoneLaunch();
                break;

            default:
                Log.e(MainActivity.TAG, "ooops, something wrong!");
                break;

        }
    }
}
