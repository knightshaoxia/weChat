package android.shaoxia.com.wechat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;


/**
 * Created by root on 19-1-18.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);


        ImageButton back = (ImageButton) findViewById(R.id.back);

        Log.i(TAG, "ON onCreate");
        back.setOnClickListener(LoginActivity.this);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "ON stop");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "ON onPause");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                finish();
                break;
            default:
                break;
        }

    }
}
