package com.labawsrh.aws.introscreen;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginRegisterActivity extends AppCompatActivity {

    Button btnRegistrerLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        btnRegistrerLogin = (Button) findViewById(R.id.btnRegisterLogin);

        btnRegistrerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(LoginRegisterActivity.this, RegisterActivity.class);
                startActivity(mainActivity);
            }
        });

    }
}
