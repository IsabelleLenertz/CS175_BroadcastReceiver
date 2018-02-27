package edu.sjsu.delmas.isabelle.broadcastintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){
        Intent intent = new Intent();
        Toast.makeText(this,"Intent Sent", Toast.LENGTH_SHORT).show();

        intent.setAction("CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
