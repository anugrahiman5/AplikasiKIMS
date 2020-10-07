package com.rplm.aplikasikims;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rplm.aplikasikims.final_process.FinalProcessActivity;
import com.rplm.aplikasikims.post_drying.PostDryingActivity;
import com.rplm.aplikasikims.post_extraction.PostExtractionActivity;
import com.rplm.aplikasikims.pre_extraction.PreExtractionActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_post_drying)
    CardView btnPostDrying;
    @BindView(R.id.btn_pre_extraction)
    CardView btnPreExtraction;
    @BindView(R.id.btn_post_extraction)
    CardView btnPostExtraction;
    @BindView(R.id.btn_final_process)
    CardView btnFinalProcess;
    @BindView(R.id.btn_setting)
    CardView btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnPostDrying.setOnClickListener(this);
        btnPreExtraction.setOnClickListener(this);
        btnPostExtraction.setOnClickListener(this);
        btnFinalProcess.setOnClickListener(this);
        btnSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_post_drying:
                Intent intentPostDrying = new Intent(this, PostDryingActivity.class);
                startActivity(intentPostDrying);
                break;
            case R.id.btn_pre_extraction:
                Intent intentPreExtraction = new Intent(this, PreExtractionActivity.class);
                startActivity(intentPreExtraction);
                break;
            case R.id.btn_post_extraction:
                Intent intentPostExtraction = new Intent(this, PostExtractionActivity.class);
                startActivity(intentPostExtraction);
                break;
            case R.id.btn_final_process:
                Intent intentFinalProcess = new Intent(this, FinalProcessActivity.class);
                startActivity(intentFinalProcess);
                break;
            case R.id.btn_setting:
                Intent intentSettings = new Intent(this, SettingActivity.class);
                startActivity(intentSettings);
                break;
        }
    }
}