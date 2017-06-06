package com.example.longinusl33t.blive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wcy62 on 2017-05-31.
 */

public class Download_Ok extends Fragment{
    private CustomEmptyView customEmptyView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_download_ok, null);

        customEmptyView = (CustomEmptyView) view.findViewById(R.id.empty_ok_layout);
        assert customEmptyView != null;
        customEmptyView.setEmptyImage(R.drawable.img_tips_error_no_downloads);
        customEmptyView.setEmptyText("没有找到你的缓存哟");

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
