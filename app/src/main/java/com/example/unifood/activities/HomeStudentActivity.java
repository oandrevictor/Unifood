package com.example.unifood.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.example.unifood.R;

public class HomeStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_student);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        // Favorites Restaurants
        TabHost.TabSpec spec = host.newTabSpec("Fav Restaurants");
        spec.setContent(R.id.home_student_fav_rests);
        spec.setIndicator("Fav Restaurants");
        host.addTab(spec);

        //All Restaurants
        spec = host.newTabSpec("All Restaurants");
        spec.setContent(R.id.home_student_all_rest);
        spec.setIndicator("All Restaurants");
        host.addTab(spec);

        //My profile
        spec = host.newTabSpec("My Profile");
        spec.setContent(R.id.home_student_my_profile);
        spec.setIndicator("My Profile");
        host.addTab(spec);

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

}
