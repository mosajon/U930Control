package com.mosajon.u930control;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://weibo.com/mosajon");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent2=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent2);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Btn_Click(View view)
    {
        String[] commands1 = new String[] { "echo 1 > /sys/class/timed_output/keybd_led/enable" };
        ShellUtils.CommandResult result1 = ShellUtils.execCommand(commands1, true);
    }

    public void Btn2_Click(View view)
    {
        String[] commands2 = new String[] { "echo 0 > /sys/class/timed_output/keybd_led/enable" };
        ShellUtils.CommandResult result2 = ShellUtils.execCommand(commands2, true);
    }

    public void Btn3_Click(View view)
    {
        String[] commands3 = new String[] { "echo -1 > /sys/class/timed_output/led_green_zte/enable" };
        ShellUtils.CommandResult result1 = ShellUtils.execCommand(commands3, true);
    }

    public void Btn4_Click(View view)
    {
        String[] commands4 = new String[] { "echo 0 > /sys/class/timed_output/led_green_zte/enable" };
        ShellUtils.CommandResult result1 = ShellUtils.execCommand(commands4, true);
    }

    public void Btn5_Click(View view)
    {
        String[] commands5 = new String[] { "echo -1 > /sys/class/timed_output/led_red_zte/enable" };
        ShellUtils.CommandResult result2 = ShellUtils.execCommand(commands5, true);
    }

    public void Btn6_Click(View view)
    {
        String[] commands6 = new String[] { "echo 0 > /sys/class/timed_output/led_red_zte/enable" };
        ShellUtils.CommandResult result2 = ShellUtils.execCommand(commands6, true);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
