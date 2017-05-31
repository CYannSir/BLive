package com.example.longinusl33t.blive;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class DownloadActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager viewPager ;
    private List<String> DTitle = new ArrayList<String>();
    private List<Fragment> DFragment = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        /*
        initView();
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), DTitle, DFragment);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabsFromPagerAdapter(adapter);
        */

        //toolbar实例添加
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //使得TOOLBAR像actionbar一样运行
        setSupportActionBar(toolbar);
        //设置返回按钮显示
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //调用toolbar布局
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.download_toolbar,menu);
        return true;
    }
    //toolbar按钮点击事件
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            //导航按钮点击事件，位于toolbar左端
            case android.R.id.home:
                finish();
                break;
            case R.id.id_action_download:
                Snackbar.make(findViewById(android.R.id.content), "离线下载", Snackbar.LENGTH_SHORT)
                .show();
                break;
            default:
                break;
        }
        return true;
    }

/*
    //初始化V
    private void initView() {

        tabs = (TabLayout) findViewById(R.id.tabs_download);
        viewPager = (ViewPager) findViewById(R.id.viewpager_download);


        DFragment.add(new Download_Ok());
        DFragment.add(new Download_Loading());


    }

*/

}
