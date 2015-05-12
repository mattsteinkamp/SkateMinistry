package com.example.matts.Skateministry.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
public class MainActivity extends ActionBarActivity implements View.OnClickListener
{

    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        button1 = (ImageButton)findViewById(R.id.imageButton1);
        button1.setOnClickListener(this);
        button2 = (ImageButton)findViewById(R.id.imageButton2);
        button2.setOnClickListener(this);
        button3 = (ImageButton)findViewById(R.id.imageButton3);
        button3.setOnClickListener(this);
        button4 = (ImageButton)findViewById(R.id.imageButton4);
        button4.setOnClickListener(this);
        button5 = (ImageButton)findViewById(R.id.imageButton5);
        button5.setOnClickListener(this);
        button6 = (ImageButton)findViewById(R.id.imageButton6);
        button6.setOnClickListener(this);
        button7 = (ImageButton)findViewById(R.id.imageButton7);
        button7.setOnClickListener(this);
        button8 = (ImageButton)findViewById(R.id.imageButton8);
        button8.setOnClickListener(this);
        button9 = (ImageButton)findViewById(R.id.imageButton9);
        button9.setOnClickListener(this);
        button10 = (ImageButton)findViewById(R.id.imageButton10);
        button10.setOnClickListener(this);
        button11 = (ImageButton)findViewById(R.id.imageButton11);
        button11.setOnClickListener(this);
        button12 = (ImageButton)findViewById(R.id.imageButton12);
        button12.setOnClickListener(this);
        button13 = (ImageButton)findViewById(R.id.imageButton13);
        button13.setOnClickListener(this);
        button14 = (ImageButton)findViewById(R.id.imageButton14);
        button14.setOnClickListener(this);

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
    private void button1click(){
        //Intent intent = new Intent(this, activity1.class);
        //startActivity(intent);
        startActivity(new Intent("com.example.matts.Skateministry.activity1"));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton1:
                button1click();
                break;
            case R.id.imageButton2:
                button2click();
                break;
            case R.id.imageButton3:
                button3click();
                break;
            case R.id.imageButton4:
                button4click();
                break;
            case R.id.imageButton5:
                button5click();
                break;
            case R.id.imageButton6:
                button6click();
                break;
            case R.id.imageButton7:
                button7click();
                break;
            case R.id.imageButton8:
                button8click();
                break;
            case R.id.imageButton9:
                button9click();
                break;
            case R.id.imageButton10:
                button10click();
                break;
            case R.id.imageButton11:
                button11click();
                break;
            case R.id.imageButton12:
                button12click();
                break;
            case R.id.imageButton13:
                button13click();
                break;
            case R.id.imageButton14:
                button14click();
                break;

        }
    }
    private void button2click(){

        startActivity(new Intent("com.example.matts.Skateministry.activity2"));
        }

    private void button3click(){

        startActivity(new Intent("com.example.matts.Skateministry.activity3"));
    }

    private void button4click(){
        startActivity(new Intent("com.example.matts.Skateministry.activity4"));
            }

    private void button5click(){
        startActivity(new Intent("com.example.matts.Skateministry.activity5"));
            }

    private void button6click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity6"));
            }

    private void button7click(){
        startActivity(new Intent("com.example.matts.Skateministry.activity7"));
            }

    private void button8click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity8"));
            }

    private void button9click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity9"));
            }

    private void button10click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity10"));
            }

    private void button11click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity11"));
            }

    private void button12click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity12"));
            }

    private void button13click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity13"));
            }

    private void button14click(){
            startActivity(new Intent("com.example.matts.Skateministry.activity14"));
            }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
