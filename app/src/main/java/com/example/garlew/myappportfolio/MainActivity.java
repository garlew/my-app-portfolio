package com.example.garlew.myappportfolio;

//import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showToast(CharSequence toastText)
    {
        Context context = getApplicationContext();
        if (!(toast == null))
        {
            toast.cancel();
        }
        toast = new Toast(context);
        int duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(context, "This will launch " + toastText, duration);
        toast.show();
    }

    public void onButtonClick(View view)
    {
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        showToast(buttonText);
    }


}
