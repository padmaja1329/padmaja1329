package akiil.com.rentacar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Temp extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ActionBarDrawerToggle actionBarDrawerToggle;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private DrawerLayout drawerLayout;
    private ListView navList;

    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);

        navList = (ListView) findViewById(R.id.navlist);
        ArrayList<String> navArray = new ArrayList<String>();
        navArray.add("About Us");
        navArray.add("Reserve A Car");
        navArray.add("Find Location");
        navArray.add("Terms And Conditions");
        navArray.add("Rate Your Drive");
        navArray.add("Contact us");


        //navList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,navArray);
        navList.setAdapter(adapter);
        navList.setOnItemClickListener(this);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.opendrawer, R.string.closedrawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        fragmentManager = getSupportFragmentManager();
    }

    private void loadSelection(int i){
        navList.setItemChecked(i,true);
        switch (i){
            case 0:
                Three_One i30 = new Three_One();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,i30);
                fragmentTransaction.commit();
                break;
            case 1:
                Reddy i31 = new Reddy();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,i31);
                fragmentTransaction.commit();

                break;
            case 2:
                Three_Two i32 = new Three_Two();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,i32);
                fragmentTransaction.commit();

                break;
            case 3:
                Three_Four i33 = new Three_Four();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,i33);
                fragmentTransaction.commit();

                break;
            case 4:
                Seven i34 = new Seven();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,i34);
                fragmentTransaction.commit();

                break;
            case 5:
                Contactus i35 = new Contactus();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,i35);
                fragmentTransaction.commit();

                break;


        }


    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(navList)){
                drawerLayout.closeDrawer(navList);
            }else{
                drawerLayout.openDrawer(navList);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        loadSelection(position);

        drawerLayout.closeDrawer(navList);
    }
}




