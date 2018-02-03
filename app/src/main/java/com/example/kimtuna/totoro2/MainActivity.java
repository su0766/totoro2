package com.example.kimtuna.totoro2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    public void onBackPressed() {
        Log.d("lkj","poi");
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Log.d("abv","qwe");
        Intent intent = new Intent(this,CountryList.class);
        startActivity(intent);
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.d("Nav", "" + item.getItemId());

        switch (item.getItemId()) {
            case R.id.nav_board:
                Intent intent1 = new Intent(this, Board.class);
                startActivity(intent1);
                break;
            case R.id.nav_before_search:
                Intent intent2 = new Intent(this, ChoicePage.class);
                startActivity(intent2);
                break;
            case R.id.nav_bookmark:
                Intent intent3 = new Intent(this, BookMark.class);
                startActivity(intent3);
                break;
            case R.id.nav_setting:
                Intent intent4 = new Intent(this, Setting.class);
                startActivity(intent4);
                break;

        }
        return false;
    }
}

