package com.example.user.drawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class EmergencyLines extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_line);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Emergency Line");

        String[] title = {"Police", "Ambulance", "Fire Figthers/ Rescue Team"};
        String[] telNumbers = {"Tel: 10111", "Tel: 10177", "Tel: 012 310 6300/ 012 310 6400"};
        int imageResources[] = {R.drawable.police, R.drawable.redcross, R.drawable.fire_fighters};

        ListView list = (ListView) findViewById(R.id.listview);

        ListViewAdapter adapter = new ListViewAdapter(this, title, telNumbers, imageResources);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    callPolice();
                }else if(position==1){
                    callAmbulance();
                }

            }
        });
    }
    private void callPolice() {
        Intent in=new Intent(Intent.ACTION_CALL, Uri.parse("10111"));
        try{
            startActivity(in);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }
    private void callAmbulance() {
        Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("10177"));
        try{
            startActivity(in);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }

    private void callFireFighters() {
        Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("10177"));
        try{
            startActivity(in);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }
}
