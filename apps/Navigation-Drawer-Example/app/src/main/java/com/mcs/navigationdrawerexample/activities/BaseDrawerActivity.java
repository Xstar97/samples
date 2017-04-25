package com.mcs.navigationdrawerexample.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.mcs.navigationdrawerexample.R;

@SuppressWarnings("unused")
public class BaseDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    private String TAG = "BaseDrawerActivity";

    public void initOnCreate(Toolbar toolbar, DrawerLayout drawer, NavigationView navigationView){
        try {
            setSupportActionBar(toolbar);

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            navigationView.setNavigationItemSelectedListener(this);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }
    public void initOnCreate(int toolbarID, int drawerID, int navigationViewID){
        try{
            Toolbar toolbar = (Toolbar) findViewById(toolbarID);
            DrawerLayout drawer = (DrawerLayout) findViewById(drawerID);
            NavigationView navigationView = (NavigationView) findViewById(navigationViewID);

            setSupportActionBar(toolbar);

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            navigationView.setNavigationItemSelectedListener(this);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }

    public void closerDrawer(DrawerLayout drawer){
        try{
            drawer.closeDrawer(GravityCompat.START);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }
    public void closerDrawer(int drawerID){
        try{
            DrawerLayout drawer = (DrawerLayout) findViewById(drawerID);
            drawer.closeDrawer(GravityCompat.START);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }

    public void openDrawer(DrawerLayout drawer){
        try {
            drawer.openDrawer(GravityCompat.START);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }
    public void openDrawer(int drawerID){
        try{
            DrawerLayout drawer = (DrawerLayout) findViewById(drawerID);
            drawer.openDrawer(GravityCompat.START);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
        }
    }

    public boolean isDrawerOpen(int drawerID){
        try{
            DrawerLayout drawer = (DrawerLayout) findViewById(drawerID);
            return drawer.isDrawerOpen(GravityCompat.START);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
            return false;
        }
    }
    public boolean isDrawerOpen(DrawerLayout drawer){
        try{
            return drawer.isDrawerOpen(GravityCompat.START);
        }catch (Exception e){
            Log.e(TAG,e.getMessage());
            return false;
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}