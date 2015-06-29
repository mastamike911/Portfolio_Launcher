package com.example.michael.portfoliolauncher;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Portfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Launch_Spotify_Streamer(View view) {
        Show_Toast("This button will launch my Spotify app!");
    }

    public void Launch_Scores_App(View view) {
        Show_Toast("This button will launch my Scores app!");
    }

    public void Launch_Library_App(View view) {
        Show_Toast("This button will launch my Library app!");
    }

    public void Launch_Build_It_Bigger(View view) {
        Show_Toast("This button will launch my \"Build it Bigger\" app!");
    }

    public void Launch_XYZ_Reader(View view) {
        Show_Toast("This button will launch my XYZ Reader app!");
    }

    public void Launch_Capstone_App(View view) {
        Show_Toast("This button will launch my Capstone app!");
    }

    private void Show_Toast(String s) {
        Context context =  getApplicationContext();
        CharSequence text = s;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
