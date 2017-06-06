package com.example.longinusl33t.blive;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

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

        initView();
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), DTitle, DFragment);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabsFromPagerAdapter(adapter);


        //toolbar实例添加
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //使得TOOLBAR像actionbar一样运行
        setSupportActionBar(toolbar);
        //设置返回按钮显示
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        long phoneTotalSize = CommonUtil.getPhoneTotalSize();
        long phoneAvailableSize = CommonUtil.getPhoneAvailableSize();
        //转换为G的显示单位
        String totalSizeStr = Formatter.formatFileSize(this, phoneTotalSize);
        String availabSizeStr = Formatter.formatFileSize(this, phoneAvailableSize);
        //计算占用空间的百分比
        int progress = countProgress(phoneTotalSize, phoneAvailableSize);

        NumberProgressBar mProgressBar = (NumberProgressBar) findViewById(R.id.progress_bar);
        TextView mCacheSize =(TextView) findViewById(R.id.cache_size_text);

        mProgressBar.setProgress(progress);
        mCacheSize.setText("主存储:" + totalSizeStr + "/" + "可用:" + availabSizeStr);

        CustomEmptyView mEmptyLayout = (CustomEmptyView) findViewById(R.id.empty_layout);

        assert mEmptyLayout != null;
        mEmptyLayout.setEmptyImage(R.drawable.img_tips_error_no_downloads);
        mEmptyLayout.setEmptyText("没有找到你的缓存哟");
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


    //初始化V
    private void initView() {

        tabs = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        DTitle.add("已缓存");
        DTitle.add("缓存中");

        DFragment.add(new Download_Ok());
        DFragment.add(new Download_Loading());


    }



    private int countProgress(long phoneTotalSize, long phoneAvailableSize) {

        double totalSize = phoneTotalSize / (1024 * 3);
        double availabSize = phoneAvailableSize / (1024 * 3);
        //取整相减
        int size = (int) (Math.floor(totalSize) - Math.floor(availabSize));
        double v = (size / Math.floor(totalSize)) * 100;
        return (int) Math.floor(v);
    }


}
