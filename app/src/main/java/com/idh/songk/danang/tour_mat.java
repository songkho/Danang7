package com.idh.songk.danang;

import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class tour_mat extends AppCompatActivity {

    private AdView mAdView;

    LinearLayout li1, li2, li3, li4, li5, li6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_mat);


        //-------------- START ---------------- 하단광고

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2821664824480291/2184494920");

        //--------------- END --------------- 하단광고
        li5 = (LinearLayout) findViewById(R.id.libtn5);



        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/place/%EC%98%A4%ED%96%89%EC%82%B0/@16.0045181,108.2595842,17z/data=!3m1!4b1!4m5!3m4!1s0x31420dd4e14b2edb:0xbc6e1faf738be4c5!8m2!3d16.004513!4d108.2617782"));

                startActivity(intent);

            }
        });






    }
}
