package com.example.user.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WaterMapClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.water_map);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.google.co.za/maps/place/rivers+and+dams/@-25.5961739,28.2525053,16.25z/data=!4m2!3m1!1s0x1e9562049aded393:0x1f8e32daeee2c468!5m1!1e4");

        /*Uri gmmIntentUri = Uri.parse("google.terrain:cbll=46.414382,10.013988");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);*/
    }
}
