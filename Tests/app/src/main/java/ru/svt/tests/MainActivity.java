package ru.svt.tests;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements GestureDetector.OnGestureListener , GestureDetector.OnDoubleTapListener
{

    private static final String TAG = "svtLOG";

    private  TextView MyTextView;
    private  GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyTextView = (TextView)findViewById(R.id.MyMessage);

        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    // Start gestures
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e)
    {
        Log.i(TAG,"onSingleTapConfirmed");
        MyTextView.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e)
    {
        MyTextView.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e)
    {
        MyTextView.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e)
    {
        MyTextView.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e)
    {
        MyTextView.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e)
    {
        MyTextView.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)
    {
        MyTextView.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e)
    {
        MyTextView.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
    {
        MyTextView.setText("onFling");
        return true;
    }

    // END gestures


    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
