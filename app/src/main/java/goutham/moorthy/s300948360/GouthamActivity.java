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
    int counter = 5;

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
                if (GouthamUsername.getText().toString().equals("goutham.moorthy") &&
                        GouthamPassword.getText().toString().equals("300948360")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            GouthamActivity.this
                    );
                    builder.setIcon(R.drawable.check_circle);
                    builder.setTitle("Login Successful!");

                    Verify(GouthamUsername.getText().toString(),GouthamPassword.getText().toString());

                    builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect Username & Password", Toast.LENGTH_SHORT).show();

                }


            }
        });



    }


    private void Verify(String username, String password)
    {
        if((username.equals("goutham.moorthy")) && (password.equals("300948360")))
        {
            Intent intent = new Intent(GouthamActivity.this, MoorthyActivity.class);
            startActivity(intent);
        }else
        {
            counter--;
            if(counter == 0 )
            {
                button.setEnabled(false);
            }
        }
    }

}
