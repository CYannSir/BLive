package com.example.longinusl33t.blive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class DownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

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

            default:
                break;
        }
        return true;
    }
}
