package com.mosajon.u930control;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by root on 16-5-22.
 */
public class BootBroadcastReceiver extends BroadcastReceiver {
    static final String action_boot="android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(action_boot)){
            String[] commands2 = new String[] { "echo 0 > /sys/class/timed_output/keybd_led/enable" };
            ShellUtils.CommandResult result2 = ShellUtils.execCommand(commands2, true);

            //Intent mainIntent=new Intent(context,MainActivity.class);
            //mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            //context.startActivity(mainIntent);
        }

    }

}