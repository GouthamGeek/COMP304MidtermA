package goutham.moorthy.s300948360;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GouthamActivity extends AppCompatActivity {

    EditText Gusername;
    EditText Gpassword;
    Button SubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.Goutham_Username);
        Password = findViewById(R.id.Goutham_Password);


        SubmitButton = (Button) findViewById(R.id.button);
        SubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                login();
            }
        });

    }

    public void login(){
        if(Gusername.getText().toString().equals("goutham.moorthy") && Gpassword.getText().toString().equals("300948360")) {
            Intent intent = new Intent(this, GouthamActivity.class
            );
            startActivity(intent);
        }

        else {
            //wrong password
        }

    }
}
