package com.pandev.academy.explicitwithparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_move_pac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move_pac = (Button)findViewById(R.id.btn_parcelable);
        btn_move_pac.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_parcelable:
                itemOrang orang = new itemOrang();
                orang.setNama("Panji Patria");
                orang.setAlamat("Bandung");
                orang.setEmail("panjinohnah@gmail.com");

                Intent i = new Intent(MainActivity.this, Activity2.class);
                i.putExtra(Activity2._INFO_, orang);
                startActivity(i);
                break;
        }
    }
}
