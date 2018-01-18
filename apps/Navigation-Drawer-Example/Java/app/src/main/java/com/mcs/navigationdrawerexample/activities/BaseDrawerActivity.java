package com.mcs.navigationdrawerexample.activities;

import android.annotation.SuppressLint;
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

@SuppressLint("Registered")
@SuppressWarnings("unused")
public class BaseDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    private String TAG = "BaseDrawerActivity";

    private Toolbar toolBar;
    private DrawerLayout drawerLayout;
    private NavigationView navView;

    public void initOnCreate(Toolbar toolbar, DrawerLayout drawer, NavigationView navigationView){
        try {
            toolBar = toolbar;
            drawerLayout = drawer;
            navView = navigationView;

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
            Toolbar toolbar = findViewById(toolbarID);
            DrawerLayout drawer = findViewById(drawerID);
            NavigationView navigationView = findViewById(navigationViewID);

            toolBar = toolbar;
            drawerLayout = drawer;
            navView = navigationView;

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            navigationView.setNavigationItemSelectedListener(this);
        }catch (Exception e){
            DEBUG(e.getMessage());
        }
    }

    public void closeDrawer(){
        try{
            getDrawerLayout().closeDrawer(GravityCompat.START);
        }catch (Exception e){
            DEBUG(e.getMessage());
        }
    }

    public void openDrawer(){
        try {
            getDrawerLayout().openDrawer(GravityCompat.START);
        }catch (Exception e){
            DEBUG(e.getMessage());
        }
    }

    public boolean isDrawerOpen(){
        try{
            return getDrawerLayout().isDrawerOpen(GravityCompat.START);
        }catch (Exception e){
            DEBUG(e.getMessage());
            return false;
        }
    }

    public void setSelectedMenu(int setMenuID){
        getNavView().getMenu().performIdentifierAction(setMenuID, 0);
    }
    public void unSelectMenuItem(int i){
        getNavView().getMenu().getItem(i).setChecked(false);
    }
    public void unSelectMenuItem(){
        for (int i = 0; i < getMenuSize(); i++) {
            getNavView().getMenu().getItem(i).setChecked(false);
        }
    }

    public int getMenuSize(){
        return getNavView().getMenu().size();
    }

    public Toolbar getToolBar(){
        try{
            return toolBar;
        }catch (Exception e){
            DEBUG(e.getMessage());
            return null;
        }
    }
    public DrawerLayout getDrawerLayout(){
        try{
            return drawerLayout;
        }catch (Exception e){
            DEBUG(e.getMessage());
            return null;
        }
    }
    public NavigationView getNavView(){
        try{
            return navView;
        }catch (Exception e){
            DEBUG(e.getMessage());
            return null;
        }
    }

    private void DEBUG(String e){
        Log.e(TAG, e);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}