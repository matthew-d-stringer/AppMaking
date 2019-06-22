package com.matthew.messingaround;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ansYes, ansNo;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ansYes = (Button) findViewById(R.id.yesBut);
        ansNo = (Button) findViewById(R.id.noBut);

        usersNameEditText = (EditText) findViewById(R.id.users_name_et);
    }

    public void onYesButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());

        String yourYesResponse = "That is great " + usersName;

        Toast.makeText(this, yourYesResponse, Toast.LENGTH_SHORT).show();

    }

    public void onNoButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());

        String yourNoResponse = "To bad " + usersName;

        Toast.makeText(this, yourNoResponse, Toast.LENGTH_SHORT).show();

    }
}
