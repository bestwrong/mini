package com.example.a99474.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegActivity extends FragmentActivity {

    private TextView loginTo = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_reg);
        uiInit();
    }

    /**
     * 界面初始化
     */
    public void uiInit(){
        loginTo = findViewById(R.id.login_to);

        loginTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}
