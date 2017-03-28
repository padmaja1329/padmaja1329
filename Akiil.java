package akiil.com.rentacar;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;


public class Akiil extends AppCompatActivity {

    
@Override
    protected void onCreate(Bundle savedInstanceState) {
        
super.onCreate(savedInstanceState);
        
setContentView(R.layout.activity_akiil);
        
Button button1 =(Button)findViewById(R.id.lbutton);
        
button1.setOnClickListener(new View.OnClickListener() {
            
@Override
            public void onClick(View view) {
                
Intent i1 =new Intent(getApplicationContext(),Temp.class);
                
startActivity(i1);
           
}
       
}   
}

}
