package rezatrue.com.personalmedicalhistorymanagement;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp_Activity extends AppCompatActivity {
    private EditText enter_name_ET;
    private EditText enter_password_ET;
    private EditText enter_email_ET;
    private TextView t1;
    private  TextView t2;
    private  TextView t3;

    private SharedPreferences userPreference;
    private SharedPreferences.Editor editor;

    private loginUserPreference userPreference1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        enter_name_ET= (EditText) findViewById(R.id.enter_name_ET);
        enter_password_ET= (EditText) findViewById(R.id.enter_password_ET);
        enter_email_ET= (EditText) findViewById(R.id.enter_email_ET);
        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);


        userPreference1 = new loginUserPreference(this);


    }

    public void saveUser(View view) {
        String email =enter_email_ET.getText().toString();
        String pass = enter_password_ET.getText().toString();
        String userName=enter_name_ET.getText().toString();

        userPreference1.saveUser(email,pass,userName);
    }

    public void showUser(View view) {
        t1.setText(userPreference1.showEmail());
        t2.setText(userPreference1.showPassword());
        t3.setText(userPreference1.showUserName());
    }

    public void clearUserData(View view) {
        userPreference1.clearUserData();
    }
}
