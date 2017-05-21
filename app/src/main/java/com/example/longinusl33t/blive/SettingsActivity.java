package com.example.longinusl33t.blive;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //toolbar实例添加
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //使得TOOLBAR像actionbar一样运行
        setSupportActionBar(toolbar);
        //设置返回按钮显示
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //DrawerLayout
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //DrawerLayout
    }

    //调用toolbar布局
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.settings_toolbar,menu);
        return true;
    }
    //toolbar按钮点击事件
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            //导航按钮点击事件，位于toolbar左端
            case android.R.id.home:
                finish();
                break;

            default:
                break;
        }
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.item_home) {
            // Handle the camera action
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(intent);

        } else if (id == R.id.item_vip) {
            Intent intent = new Intent(SettingsActivity.this, VipActivity.class);
            startActivity(intent);

        } else if (id == R.id.item_integration) {
            Intent intent = new Intent(SettingsActivity.this, IntegrationActivity.class);
            startActivity(intent);

        } else if (id == R.id.item_download) {
            Intent intent = new Intent(SettingsActivity.this, DownloadActivity.class);
            startActivity(intent);

        }

        else if (id == R.id.item_history) {
            Intent intent = new Intent(SettingsActivity.this, HistoryActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.item_concern) {
            Intent intent = new Intent(SettingsActivity.this, ConcernActivity.class);
            startActivity(intent);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}


