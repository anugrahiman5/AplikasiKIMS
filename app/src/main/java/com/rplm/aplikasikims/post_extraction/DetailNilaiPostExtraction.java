package com.rplm.aplikasikims.post_extraction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rplm.aplikasikims.R;
import com.rplm.aplikasikims.post_drying.PredictionPostDrying;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailNilaiPostExtraction extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_monitoring)
    CardView btnMonitoring;
    @BindView(R.id.btn_prediction_viscosity_content)
    CardView btnFenolFlavonoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_nilai_post_extraction);
        ButterKnife.bind(this);

        btnFenolFlavonoid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_prediction_viscosity_content:
                Intent intent = new Intent(this, PredictionPostExtraction.class);
                startActivity(intent);
                break;
        }
    }
}