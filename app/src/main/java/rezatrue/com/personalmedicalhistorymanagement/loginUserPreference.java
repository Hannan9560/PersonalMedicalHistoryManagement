package rezatrue.com.personalmedicalhistorymanagement;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Mobile App Develop on 4/5/2017.
 */

public class loginUserPreference {
    public static final String USER_AUTHENTICATION = "user_authentication";
    public static final String USER_EMAIL = "user_email";
    public static final String USER_PASS = "user_pass";
    public static final String USER_NAME = "user_name";
    private SharedPreferences userPreference;
    private SharedPreferences.Editor editor;
    private Context context;


    public loginUserPreference(Context context) {
        this.context = context;
        userPreference = context.getSharedPreferences(USER_AUTHENTICATION,Context.MODE_PRIVATE);
        editor = userPreference.edit();
    }

    public void saveUser(String email, String pass,String userName){
        editor.putString(USER_EMAIL,email);
        editor.putString(USER_PASS,pass);

        editor.putString(USER_NAME,userName);
        editor.commit();
    }

    public String showEmail(){
        return userPreference.getString(USER_EMAIL,"no  email found");
    }
    public String showPassword(){
        return userPreference.getString(USER_PASS,"no password found");
    }
    public String showUserName(){
        return userPreference.getString(USER_NAME,"no name found");
    }
    public void clearUserData(){
        editor.clear();
        editor.commit();
    }
}
