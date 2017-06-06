package com.example.longinusl33t.blive;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by wcy62 on 2017-05-31.
 */

public class Download_Loading extends Fragment implements OnProgressBarListener {

    private Button button;
    private NumberProgressBar mProgressBar;
    private Timer timer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_download_loading, null);
        button = (Button) view.findViewById(R.id.xiangqing_download_loding_example);
        mProgressBar = (NumberProgressBar) view.findViewById(R.id.progress_bar_download);
        mProgressBar.setOnProgressBarListener(this);
        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        timer = new Timer();
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
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
            mProgressBar.setProgress(0);
        }
    }

}
