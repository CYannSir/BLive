package com.example.longinusl33t.blive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class VipActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vip);

        //toolbar实例添加
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //使得TOOLBAR像actionbar一样运行
        setSupportActionBar(toolbar);
        //设置返回按钮显示
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = new WebView(this);
        webView = (WebView) findViewById(R.id.vip_webView);
        //设置WebView属性，能够执行Javascript脚本
        webView.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        webView.loadUrl("http://vip.bilibili.com/site/vip-faq-h5.html#yv1");

    }


    //调用toolbar布局
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.vip_toolbar,menu);
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
