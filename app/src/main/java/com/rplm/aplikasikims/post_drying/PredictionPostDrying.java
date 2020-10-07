package com.rplm.aplikasikims.post_drying;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rplm.aplikasikims.MainActivity;
import com.rplm.aplikasikims.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PredictionPostDrying extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_monitoring)
    CardView btnMonitoring;
    @BindView(R.id.btn_home)
    CardView btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_post_drying);
        ButterKnife.bind(this);

        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}