package com.example.user.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Communicate extends AppCompatActivity {

    private Toolbar toolbar;
    String messageIssue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_layout);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Alert Pastoralist");
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("First Tab");
        tabSpec.setContent(R.id.sendLayout);
        tabSpec.setIndicator("Report issues");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Second Tab");
        tabSpec.setContent(R.id.recieveLayout);
        tabSpec.setIndicator("Check issues");
        tabHost.addTab(tabSpec);

        final TextView currentIssues = (TextView) findViewById(R.id.tvCurrentIssues);
        Button sendBtn = (Button) findViewById(R.id.btnSubmit);
        final EditText message = (EditText) findViewById(R.id.edtMessage);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(message != null){
                    messageIssue = message.getText().toString();
                    Toast.makeText(getApplicationContext(), "Your message have been sent!", Toast.LENGTH_SHORT).show();
                    message.setText("");
                    currentIssues.setText(currentIssues.getText()+"\nYou: "+messageIssue);
                }
            }
        });





    }
}
