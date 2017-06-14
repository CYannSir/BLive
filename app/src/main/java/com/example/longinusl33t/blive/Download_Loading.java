package com.example.longinusl33t.blive;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by wcy62 on 2017-05-31.
 */

public class Download_Loading extends Fragment implements OnProgressBarListener {

    private Button button;
    private NumberProgressBar mProgressBar;
    private Timer timer;
    private CardView cardView;
    private CardView cardView_ok;
    private CustomEmptyView customEmptyView;
    private CustomEmptyView customEmptyView_ok;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_download_loading, null);
        button = (Button) view.findViewById(R.id.xiangqing_download_loding_example);
        cardView= (CardView) view.findViewById(R.id.Cardview_download_loading_example);
        cardView_ok = (CardView) getActivity().findViewById(R.id.Cardview_download_ok_example);


        customEmptyView = (CustomEmptyView) view.findViewById(R.id.empty_loading_layout);
        customEmptyView_ok = (CustomEmptyView) getActivity().findViewById(R.id.empty_ok_layout);

        mProgressBar = (NumberProgressBar) view.findViewById(R.id.progress_bar_download);
        mProgressBar.setOnProgressBarListener(this);
        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button.setBackgroundResource(R.drawable.ic_pause_grey600_24dp);

                        timer = new Timer();
                        timer.schedule(new TimerTask() {

                            @Override
                            public void run() {
                                if (getActivity() == null)
                                    return;
                                getActivity().runOnUiThread(new Runnable() {

                                    @Override
                                    public void run() {
                                        //递增progress数值
                                        mProgressBar.incrementProgressBy(5);
                                    }
                                });
                            }
                        }, 1000, 100);

                    }
                });
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



 @Override
    public void onProgressChange(int current, int max) {
        if (current == max) {
            mProgressBar.setProgress(100);
            cardView.setVisibility(View.INVISIBLE);
            customEmptyView.setVisibility(View.VISIBLE);
            assert customEmptyView != null;
            customEmptyView.setEmptyImage(R.drawable.img_tips_error_no_downloads);
            customEmptyView.setEmptyText("没有找到你的缓存哟");

            cardView_ok.setVisibility(View.VISIBLE);
            customEmptyView_ok.setVisibility(View.INVISIBLE);

        }

    }

}
