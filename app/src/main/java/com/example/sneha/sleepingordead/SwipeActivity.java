package com.example.sneha.sleepingordead;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.andtinder.model.CardModel;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;

public class SwipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CardContainer mCardContainer = (CardContainer) findViewById(R.id.layoutview);
        CardModel card = new CardModel("Title1", "Description goes here", getResources().getDrawable(R.drawable.cat));

        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this);
        adapter.add(new CardModel("Cat", "Description goes here", getResources().getDrawable(R.drawable.cat)));
        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.h1)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.h2)));
//        adapter.add(new CardModel("Heh", "Description goes here", getResources().getDrawable(R.drawable.h3)));
//        adapter.add(new CardModel("Hm", "Description goes here", getResources().getDrawable(R.drawable.h4)));
        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p1)));
        adapter.add(new CardModel("Hmmm", "Potatos gon' potate", getResources().getDrawable(R.drawable.potato)));
        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.friendlyu)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p2)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p3)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p4)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p5)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p6)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p7)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p8)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p9)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p10)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p11)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p12)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p13)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p14)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p15)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p16)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p17)));
//        adapter.add(new CardModel("Hmmm", "Description goes here", getResources().getDrawable(R.drawable.p18)));
        mCardContainer.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_swipe, menu);
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
}
