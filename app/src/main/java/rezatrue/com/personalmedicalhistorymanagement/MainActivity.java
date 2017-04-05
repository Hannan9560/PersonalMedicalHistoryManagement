package rezatrue.com.personalmedicalhistorymanagement;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText user_name_ET;
    private  EditText password_ET;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        password_ET= (EditText) findViewById(R.id.password_ET);




    }

    public void signup(View view) {
        Intent intent= new Intent(MainActivity.this,SignUp_Activity.class);
        startActivity(intent);
    }

}
