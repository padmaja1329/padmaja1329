package akiil.com.rentacar;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class One extends AppCompatActivity {

   
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   
     setContentView(R.layout.activity_one);
     
   Button button1 =(Button)findViewById(R.id.hlbutton);
    
    button1.setOnClickListener(new View.OnClickListener() {
          
  @Override
            public void onClick(View view) {
              
   Intent i1 =new Intent(getApplicationContext(),Akiil.class);
               
 startActivity(i1);
         
   }
     
   }
);
      
  Button button2 =(Button)findViewById(R.id.hrbutton);
       
 button2.setOnClickListener(new View.OnClickListener() {
           
 @Override
            public void onClick(View view) {
               
 Intent i2 =new Intent(getApplicationContext(),Two_Two.class);
              
  startActivity(i2);
            }
        });
   
 }


}
