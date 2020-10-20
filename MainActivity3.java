package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView GetUsername = findViewById(R.id.getDataUsername);
        TextView GetPassword = findViewById(R.id.getDataPassword);

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            GetUsername.setText("Username : "+bundle.getString("DataUsername"));
        }else {
            GetPassword.setText("Password : "+getIntent().getStringExtra("DataPassword"));
        }

        Button back = findViewById(R.id.buttonBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}