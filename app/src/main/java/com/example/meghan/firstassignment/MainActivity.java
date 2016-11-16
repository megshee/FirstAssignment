package com.example.meghan.firstassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    //Create objects
    private Button buttonLogin;
    private EditText editTextLogin;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Link Java Objects to Widgets in the UI

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Event Handler
        if (editTextLogin.getText().toString().equals("User")
                & editTextPassword.getText().toString().equals("1234")) {
            //Do if true
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            //Do if false
            Toast.makeText(this, "Login Denied", Toast.LENGTH_SHORT).show();
        }
    }
}
