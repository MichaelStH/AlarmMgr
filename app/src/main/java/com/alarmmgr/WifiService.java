package com.alarmmgr;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by michael on 21/03/2017.
 */

public class WifiService extends Service {

    public static int SERVICE_ID = 1247;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("OHOH", "AAAAAAAAAAAHHHHHHHHHHHHHAAHAAAHAHAHAHAHAAHAHAHAAHAHAHAHAHAHAHAHAHAHAHHAAHAHAHAHA service launched");
        return null;
    }
}
