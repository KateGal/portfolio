package com.example.systemarket.portfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void openApplication(View v){
        CharSequence message = "This button will launch my ";
        switch (v.getId()){
            case (R.id.spotify_button): message = message +"Spotify Streamer"; break;
            case (R.id.scores_button): message = message +"Scores App"; break;
            case (R.id.library_button): message = message +"Library App"; break;
            case (R.id.build_button): message = message +"Built it Bigger"; break;
            case (R.id.xyz_button): message = message +"XYZ Reader"; break;
            case (R.id.capstone_button): message = message +"Capstone: My Own App"; break;
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
