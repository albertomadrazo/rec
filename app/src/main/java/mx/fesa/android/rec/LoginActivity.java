package mx.fesa.android.rec;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String EXTRA_LOGIN_IS_TRUE = "mx.fesa.android.rec.extra_login_is_true";

    private Button mLoginButton;
    private EditText mLoginUsername;

    public static Intent newIntent(Context packageContext, boolean loginIsTrue){
        Intent i = new Intent(packageContext, LoginActivity.class);
        i.putExtra(EXTRA_LOGIN_IS_TRUE, loginIsTrue);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginUsername = (EditText) findViewById(R.id.login_username);

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(LoginActivity.this, mLoginUsername.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent data = new Intent();
            }
        });
    }
}
