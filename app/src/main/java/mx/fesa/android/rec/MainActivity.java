package mx.fesa.android.rec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button mMessage;
    private String texto;
    private TextView mMessageField;
    private EditText mMessageDrafter;

    private boolean isLogged = false;

    private static final int REQUEST_CODE_LOGIN = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isLogged== false){
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivityForResult(i, REQUEST_CODE_LOGIN);
        }

        texto = "Chido ONE!";

        mMessageField = (TextView) findViewById(R.id.my_message);
        mMessageDrafter = (EditText) findViewById(R.id.messageDrafter);

        mMessage = (Button) findViewById(R.id.messages_button);
        mMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mMessageField.setText(mMessageDrafter.getText().toString());
            }
        });
    }
}
