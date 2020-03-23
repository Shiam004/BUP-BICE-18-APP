package com.shabiruzzaman_shiam.bice_18;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class DashBoard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_dash_board);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        textView = findViewById(R.id.textView);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

    }


    public void web(View view) {

        Intent intent = new Intent(DashBoard.this, bup_web.class);
        startActivity(intent);
    }

    public void ucam(View view) {
        Intent intent = new Intent(DashBoard.this, ucam.class);
        startActivity(intent);
    }

    public void bice18(View view) {
        Intent intent = new Intent(DashBoard.this, Bice18.class);
        startActivity(intent);
    }

    public void routin(View view) {
        Intent intent = new Intent(DashBoard.this, routine.class);
        startActivity(intent);
    }

    public void clsroom(View view) {
        Intent intent = new Intent(DashBoard.this, class_room.class);
        startActivity(intent);
    }

    public void blood(View view) {
        Intent intent = new Intent(DashBoard.this, Blood_Group.class);
        startActivity(intent);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                Intent intent = new Intent(DashBoard.this, DashBoard.class);
                startActivity(intent);
                break;
            case R.id.nav_bice:

                intent = new Intent(DashBoard.this, Bice18.class);

                startActivity(intent);
                break;
            case R.id.nav_web:

                intent = new Intent(DashBoard.this, bup_web.class);

                startActivity(intent);
                break;
            case R.id.nav_ucam:

                intent = new Intent(DashBoard.this, ucam.class);

                startActivity(intent);
                break;
            case R.id.nav_routine:

                intent = new Intent(DashBoard.this, routine.class);

                startActivity(intent);
                break;
            case R.id.nav_classroom:

                intent = new Intent(DashBoard.this, class_room.class);

                startActivity(intent);
                break;
            case R.id.nav_blood:

                intent = new Intent(DashBoard.this, Blood_Group.class);

                startActivity(intent);
                break;
            case R.id.nav_fb:

                intent = new Intent(DashBoard.this, fbgroup.class);

                startActivity(intent);
                break;
            case R.id.nav_noti:

                intent = new Intent(DashBoard.this, FireNotice.class);

                startActivity(intent);
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }

}