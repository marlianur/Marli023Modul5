package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng SPBUS_ADAM = new LatLng(-3.298213, 114.604730);
        mMap.addMarker(new MarkerOptions().position(SPBUS_ADAM).title("SPBU Sultan Adam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUS_ADAM));

        LatLng SPBUADY = new LatLng(-3.289571, 114.591140);
        mMap.addMarker(new MarkerOptions().position(SPBUADY).title("SPBU Adhyaksa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUADY));

        LatLng SPBUSPAR = new LatLng(-3.316133, 114.589910);
        mMap.addMarker(new MarkerOptions().position(SPBUSPAR).title("SPBU S. Parman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUSPAR));

        LatLng SPBUSAB = new LatLng(-3.317394, 114.591903);
        mMap.addMarker(new MarkerOptions().position(SPBUSAB).title("SPBU Sabilal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUSAB));

        LatLng SPBUBA = new LatLng(-3.311529, 114.616054);
        mMap.addMarker(new MarkerOptions().position(SPBUBA).title("SPBU Banua Anyar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUBA));

        LatLng SPBUKT = new LatLng(-3.281057, 114.589174);
        mMap.addMarker(new MarkerOptions().position(SPBUKT).title("SPBU Kayu Tangi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBUKT));

        LatLng Rumah = new LatLng(-3.300234, 114.603041);
        mMap.addMarker(new MarkerOptions().position(Rumah).title("Rumah Saya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rumah));

    }
}
