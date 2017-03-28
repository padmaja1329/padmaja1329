package akiil.com.rentacar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Five_One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five__one);
        Button button17 =(Button)findViewById(R.id.confirmbutton);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i17 =new Intent(getApplicationContext(),Six.class);
                startActivity(i17);
            }
        });
    }
}
