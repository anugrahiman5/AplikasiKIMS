package com.rplm.aplikasikims.final_process;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rplm.aplikasikims.R;
import com.rplm.aplikasikims.post_drying.DetailNilaiPostDrying;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FinalProcessActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_detail_nilai)
    CardView btnDetailNilai;
    @BindView(R.id.btn_refresh)
    CardView btnRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_process);
        ButterKnife.bind(this);

        btnDetailNilai.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_detail_nilai:
                Intent intent = new Intent(this, DetailNilaiFinalProcess.class);
                startActivity(intent);
                break;
        }
    }
}