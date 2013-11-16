package com.fartOmetre.fartometre;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoadingScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_screen);
        
      //Login Button
      		final Button btnlogin = (Button) findViewById(R.id.btnlogin);
      		btnlogin.setOnClickListener(new View.OnClickListener() {
      			
      			@Override
      			public void onClick(View v) {
      				// TODO Auto-generated method stub
      				Toast.makeText(getApplicationContext(), 
                            "Login clicked!", Toast.LENGTH_LONG).show();
    				
      				Intent btnlogin = new Intent(getApplicationContext(), LoginActivity.class);
    				startActivity(btnlogin);
      				
      				/** Fading Transition Effect */
      				LoadingScreen.this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
      			}
      		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.loading_screen, menu);
        return true;
    }
    
}
