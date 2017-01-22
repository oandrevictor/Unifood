package com.example.unifood.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.unifood.R;
import com.example.unifood.models.Campus;
import com.example.unifood.models.University;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class AdminUniversityActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    String universityName;
    String campusName;

    @InjectView(R.id.name_text_field) EditText name;
    @InjectView(R.id.new_campus_field) EditText campusname;
    @InjectView(R.id.create_button)    Button createButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_university);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        ButterKnife.inject(this);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                universityName = name.getText().toString();
                campusName = campusname.getText().toString();

                Campus campus = new Campus(campusName);

                University university = new University(universityName);
                university.addCampus(campus);
                mDatabase.child("universities").push().setValue(university);

                Class mainA = MainActivity.class;
                Intent goHome = new Intent(AdminUniversityActivity.this, mainA);
                startActivity(goHome);

            }
        });






    }
}
