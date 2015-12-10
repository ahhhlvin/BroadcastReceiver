package ahhhlvin.c4q.nyc.broadcastrecievers;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SuperReceiver extends BroadcastReceiver {
    public SuperReceiver() {
    }

    private static final String TAG = SuperReceiver.class.toString();

    @Override
    public void onReceive(Context context, Intent intent) {
        // When logging, TAG is useful for searching through the logs by filtering by TAG
        Log.i(TAG, "I received an intent with action:" + intent.getAction());

        Intent startActivityIntent = new Intent(context, NewActivity.class);
        startActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(startActivityIntent);

    }
}
