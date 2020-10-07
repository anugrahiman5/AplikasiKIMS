package com.rplm.aplikasikims.post_drying;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rplm.aplikasikims.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailNilaiPostDrying extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_monitoring)
    CardView btnMonitoring;
    @BindView(R.id.btn_prediction_fenol_flavonoid)
    CardView btnFenolFlavonoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_nilai_post_drying);
        ButterKnife.bind(this);

        btnFenolFlavonoid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_prediction_fenol_flavonoid:
                Intent intent = new Intent(this, PredictionPostDrying.class);
                startActivity(intent);
                break;
        }
    }
}