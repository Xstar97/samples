package com.mcs.navigationdrawerexample.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mcs.navigationdrawerexample.R;
import com.mcs.navigationdrawerexample.fragments.*;

public class MainActivity extends BaseDrawerActivity
{
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        initOnCreate(toolbar, drawer, navigationView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Set the main as default
        newFragment(new MainFragment());
    }
    private void newFragment(Fragment fragment){
        try {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content, fragment)
                    .commit();
        }catch (Exception e){
            Log.d(TAG, e.getMessage());
        }
    }
    private void newDialog(DialogFragment dialogFragment, String tag){
        try {
            dialogFragment.show(MainActivity.this.getSupportFragmentManager(), tag);
        }catch (Exception e){
            Log.d(TAG, e.getMessage());
        }
    }

    @Override
    public void onBackPressed() {
        if (isDrawerOpen()) {
           closerDrawer();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // Create new fragments here!
        switch (id) {
            case R.id.nav_camera:
                newFragment(new CameraFragment());
                break;
            case R.id.nav_gallery:
                newFragment(new GalleryFragment());
                break;
            case R.id.nav_slideshow:
                newFragment(new SlideShowFragment());
                break;
            case R.id.nav_manage:
                newFragment(new ManageFragment());
                break;
            case R.id.nav_share:
                newDialog(new ShareDialogFragment(), "shareDialog");
                break;
            case R.id.nav_send:
                newDialog(new SendDialogFragment(), "sendDialog");
                break;
            default:
                newFragment(new MainFragment());
                break;
        }

        closerDrawer();
        return true;
    }
}