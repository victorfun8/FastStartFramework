package net.hs.ito.faststartframework.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import net.hs.ito.faststartframework.R;

import zuo.biao.library.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private Button mBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        mBt = findView(R.id.bt);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
