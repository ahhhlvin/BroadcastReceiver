package ahhhlvin.c4q.nyc.broadcastrecievers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        callMe();

        Button callButton = (Button) findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callMe();
            }
        });
    }


    public void callMe () {
        // .parse() parses a String into a Uri
        Uri number = Uri.parse("tel://5107895851");

        Intent callIntent = new Intent(Intent.ACTION_VIEW, number);
        startActivity(callIntent);
    }

    public void startNewActivity(View buttonView) {
        // getPackageName() will take "ahhhlvin.c4q.nyc" if you aren't creating a public final String for the intent
        Intent intent = new Intent(Constants.SUPER_ACTION);
        sendBroadcast(intent);
    }
}
