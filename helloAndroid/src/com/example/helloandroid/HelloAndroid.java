package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final EditText et_Text = (EditText) findViewById(R.id.eText); 
        final TextView tv_View = (TextView) findViewById(R.id.tvView);//new TextView(this);
        et_Text.setOnKeyListener(new OnKeyListener()
        {
            //function to invoke when a key is pressed
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                //check if there is 
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    //add the text to the textview
                    tv_View.setText(tv_View.getText() + ", " + et_Text.getText());
                    
                    et_Text.setText("");
                    return true;
                }
              //and clear the EditText control
                
                return false;
            }
        });
               
    }
}