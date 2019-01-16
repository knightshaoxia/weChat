package android.shaoxia.com.wechat;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private final static String TAG = "LoginActivity";

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.hide();
        actionBar.setDisplayShowTitleEnabled(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        restoreActionBar();
        setContentView(R.layout.activity_login);
    }
}
