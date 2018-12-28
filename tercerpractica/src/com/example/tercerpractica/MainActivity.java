package com.example.tercerpractica;

import com.example.tercerpractica.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText valor1;
	private EditText valor2;
	private TextView valor3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=(EditText)findViewById(R.id.editText1);
        valor2=(EditText)findViewById(R.id.editText2);
        valor3=(TextView)findViewById(R.id.textView2);
        
    }
    public void concadenar(View view){
    	String campo_espera1= valor1.getText().toString();
    	String campo_espera2= valor2.getText().toString();
    	valor3.setText(campo_espera1+","+campo_espera2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
