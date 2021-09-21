package com.ravi.firebaseone.Activities.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.annotations.NotNull;
import com.ravi.firebaseone.Activities.dashboard.adapter.MainAdapter;
import com.ravi.firebaseone.Activities.dashboard.model.Main_Recycle_list;
import com.ravi.firebaseone.Bmicalculator;
import com.ravi.firebaseone.R;
import com.ravi.firebaseone.Rating;
import com.ravi.firebaseone.personfragment;

public class DashboardActivity extends AppCompatActivity {
     BottomNavigationView bottomNavigationView;
     FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);




        RecyclerView recyclerView =  findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Main_Recycle_list[] myDietData = new Main_Recycle_list[]{
                new Main_Recycle_list("Diet Plans",R.drawable.diet_plan),
                new Main_Recycle_list("Diabetic Plans",R.drawable.diabetic),
                new Main_Recycle_list("Paleo Plans",R.drawable.paleo),
                new Main_Recycle_list("Vegan Plans",R.drawable.vegan),



        };



        MainAdapter mainadapter = new MainAdapter(myDietData,DashboardActivity.this);
        recyclerView.setAdapter(mainadapter);


        bottomNavigationView = findViewById(R.id.bottomnav);
        frameLayout = findViewById(R.id.framlayout);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NotNull MenuItem item) {



                switch (item.getItemId()){

                    case R.id.home_dash:
                        Intent home_dash = new Intent(DashboardActivity.this,DashboardActivity.class);
                        startActivity(home_dash);
                        break;



                        //setFragment(new DashboardActivity);

//                        return true;




//                    case R.id.person:
//                        setFragment(new personfragment());
//                        return true;

                    case R.id.bmi_cal:
                        Intent bmi_int = new Intent(DashboardActivity.this, Bmicalculator.class);
                        startActivity(bmi_int);
//                        //setFragment();
                        break;




                    case R.id.rating:
                        Intent person = new Intent(DashboardActivity.this, Rating.class);
                        startActivity(person);
//                        //setFragment();
                        break;



                    default:
                        return false;
                }


                return false;
            }
        });
    }








    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framlayout,fragment);
        fragmentTransaction.commit();

    }




}