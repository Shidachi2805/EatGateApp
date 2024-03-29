package com.re.eatgate;

import android.speech.tts.TextToSpeech.OnInitListener;
import android.support.v7.app.ActionBarActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity implements OnClickListener{

	private Button loginBtn;
	private LoginActivity me = this;
	
	private class EGateLoginClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(me, StartActivity.class);
			EditText passwd = (EditText) findViewById(R.id.loginField);
			Toast.makeText(me, passwd.getText().toString(), Toast.LENGTH_SHORT).show();
			startActivity(intent);
		}
	
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);    
        loginBtn = (Button) findViewById(R.id.buttonLogin);
        loginBtn.setOnClickListener(new EGateLoginClickListener());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// Intent intent = new Intent(me, StartActivity.class);
		// Toast.makeText(this, "Na dann", Toast.LENGTH_SHORT).show();
	}
}
