package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin, btnForget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.inputUsername);
        password = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.buttonLogin);
        btnForget = findViewById(R.id.buttonForget);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonLogin:
                        Intent sendData1 = new Intent(MainActivity.this, MainActivity3.class);
                        sendData1.putExtra("Username", username.getText());
                        startActivity(sendData1);
                        break;

                    case R.id.buttonForget:
                        Bundle setData = new Bundle();
                        Intent sendData2 = new Intent(MainActivity.this, MainActivity3.class);
                        setData.putString("Password", password.getText().toString());
                        sendData2.putExtras(setData);
                        startActivity(sendData2);
                        break;
                }
            }
        });

    }


}