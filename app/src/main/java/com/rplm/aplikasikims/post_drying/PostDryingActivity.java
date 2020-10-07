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

public class PostDryingActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_detail_nilai)
    CardView btnDetailNilai;
    @BindView(R.id.btn_refresh)
    CardView btnRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_drying);
        ButterKnife.bind(this);

        btnDetailNilai.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_detail_nilai:
                Intent intent = new Intent(this, DetailNilaiPostDrying.class);
                startActivity(intent);
                break;
        }
    }
}