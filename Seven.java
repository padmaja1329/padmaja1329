package akiil.com.rentacar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;





public class Seven extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")

    public Seven() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.activity_seven, container, false);

        final Button button19 = (Button)rootView.findViewById(R.id.submitbutton);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Temp.class);
                startActivity(i);
            }
        });

        return rootView;

    }
}


