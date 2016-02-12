package com.example.testandroidapp;

import com.main.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void buttonClicked(View view){
		//get objects from UI
		EditText username = (EditText) this.findViewById(R.id.txtUsername);
		EditText password = (EditText) this.findViewById(R.id.txtPassword);
		
		//get the text
		String usernameText = username.getText().toString();
		String passwordText = password.getText().toString();
		
		Login login = new Login();
		boolean proceed = login.authorise(usernameText, passwordText);
		
		if(proceed){
			Intent i = new Intent(this.getApplicationContext(), SecondScreen.class);
			i.putExtra("theMessage", usernameText);
			this.startActivity(i);
		}else{
			TextView error = (TextView)this.findViewById(R.id.txtError);
			error.setText("Error: invalid username or password");
		}
	}
}
