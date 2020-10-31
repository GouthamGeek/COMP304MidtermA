package goutham.moorthy.s300948360;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GouthamActivity extends AppCompatActivity {

    EditText GouthamUsername,GouthamPassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       GouthamUsername = findViewById(R.id.GouthamUsername);
        GouthamPassword = findViewById(R.id.GouthamPassword);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GouthamUsername.getText().toString().equals("Goutham Moorthy") &&
                GouthamPassword.getText().toString().equals("300948360")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            GouthamActivity.this
                    );
                    builder.setIcon(R.drawable.check_circle);
                    builder.setTitle("Login Successful!");

                    builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }else{
                    Toast.makeText(getApplicationContext(),"Incorrect Username & Password", Toast.LENGTH_SHORT).show();

                }
            }
        });


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
