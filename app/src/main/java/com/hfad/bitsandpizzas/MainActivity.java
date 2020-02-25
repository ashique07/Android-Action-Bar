package com.hfad.bitsandpizzas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Adding the action item (items in Menu Resource File) to the action bar
    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
        //menu object represents the Action Bar
        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_create_order:
                //
                return true;

            case R.id.action_settings:
                //
                return true;

                default:
                    return super.onOptionsItemSelected(item);

        }
    }
}
