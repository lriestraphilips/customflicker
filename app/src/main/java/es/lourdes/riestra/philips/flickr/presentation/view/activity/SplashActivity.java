package es.lourdes.riestra.philips.flickr.presentation.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import es.lourdes.riestra.philips.flickr.R;

/**
 * Start Class in Manifest
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
