package com.monstertechno.musicplayerappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class prueba extends AppCompatActivity {

    Button boton;
    private SlidingUpPanelLayout mLayout;
    LinearLayout layoutGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        boton = findViewById(R.id.button4);
        layoutGeneral = findViewById(R.id.linearLayoutPrueba);
        //boton.setVisibility(View.INVISIBLE);
        mLayout = (SlidingUpPanelLayout) findViewById(R.id.activity_main2);
        mLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset)
            {

            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState)
            {
                if(mLayout.getPanelState()== SlidingUpPanelLayout.PanelState.DRAGGING)
                {
                    layoutGeneral.setVisibility(View.INVISIBLE);
                }
                /*else if(mLayout.getPanelState() == SlidingUpPanelLayout.PanelState.)
                {

                }
                */
                if(mLayout.getPanelState()== SlidingUpPanelLayout.PanelState.COLLAPSED)
                {
                    layoutGeneral.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
