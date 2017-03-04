package com.example.unifood.activities;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.example.unifood.R;
import com.example.unifood.adapters.RestaurantListAdapter;
import com.example.unifood.controllers.FirebaseHelper;
import com.example.unifood.firebase.utils.LoadRestaurants;
import com.example.unifood.firebase.utils.Utilities;
import com.example.unifood.fragments.RestaurantListFragment;
import com.example.unifood.models.Restaurant;
import com.example.unifood.models.University;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import butterknife.ButterKnife;

import static android.R.attr.process;
import static com.google.android.gms.common.stats.zzc.Ar;

public class StudentHomeActivity extends AppCompatActivity  {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<University> dataSet = new ArrayList<>();
    private ArrayList<Restaurant> restaurantSet = new ArrayList<>();
    private ArrayList<Restaurant> faveRestaurantSet = new ArrayList<>();

    private ArrayList<String> faveReferences = new ArrayList<>();
    RestaurantListAdapter restAdapter;
    RestaurantListAdapter faveAdapter;


    private Utilities util;

    private TabHost tabHost;
    private TabSpec spec1,spec2,spec3;

    DatabaseReference ref;
    //DatabaseReference auxRef;
    DatabaseReference restRef;
    ValueEventListener getFaveListener;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        ButterKnife.inject(this);
        progressDialog = new ProgressDialog(this, R.style.AppTheme_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("");
        progressDialog.show();



        setUpFirebase();

        setUpHostBar();

        loadAllRestaurants();

        loadSavedRestaurants();
        progressDialog.dismiss();


       restAdapter = new RestaurantListAdapter(this, restaurantSet);
        RestaurantListFragment fragment = (RestaurantListFragment) getFragmentManager().findFragmentById(R.id.all_restaurants);
        fragment.updateRecycler(restAdapter);

        RestaurantListFragment fragment2 = (RestaurantListFragment) getFragmentManager().findFragmentById(R.id.saved_restaurants);
        faveAdapter = new RestaurantListAdapter(this, faveRestaurantSet);
        fragment2.updateRecycler(faveAdapter);



        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            View v = tabHost.getTabWidget().getChildAt(i);
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(getResources().getColor(R.color.white));
            v.setBackgroundResource(R.drawable.tab_selector);

        }

    }

    @Override
    public void onBackPressed() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /* needs to be uncommented in order to not go back to future loading screen.
    @Override
    public void onBackPressed() {
    }*/
    private void loadAllRestaurants(){
        restRef = mDatabase.child("restaurants");
        restRef.addChildEventListener (new ChildEventListener() {
            @Override
            public void onChildRemoved(DataSnapshot snapshot){}

            @Override
            public void onChildChanged(DataSnapshot snapshot, String string){
                Restaurant restaurant = snapshot.getValue(Restaurant.class);
                int index  = restaurantSet.indexOf(restaurant);
                restaurantSet.get(index).update(restaurant);
                restAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(DataSnapshot snapshot, String string){}

            @Override
            public void onChildAdded(DataSnapshot snapshot, String string){
                progressDialog.show();
                Restaurant restaurant = snapshot.getValue(Restaurant.class);
                restaurantSet.add(restaurant);
                restAdapter.notifyDataSetChanged();
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });

    }

    private void loadSavedRestaurants() {

        String uid = mFirebaseUser.getUid();
        ref = mDatabase.child("users").child(uid).child("studentInfo").child("favRestaurants");

        ref.addChildEventListener (new ChildEventListener() {
            @Override
            public void onChildRemoved(DataSnapshot snapshot){
                Log.e("The: " ,"m");
                String restRemoved = snapshot.getValue(String.class);
                DatabaseReference removedRef = mDatabase.child("restaurants").child(restRemoved);
                removedRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot snapshoty) {
                        Restaurant rest = snapshoty.getValue(Restaurant.class);
                        boolean result = faveRestaurantSet.remove(rest);
                        if (result){
                            Log.e("DELETE","YAS");}
                        else{
                            Log.e("DELETE","ONO");}
                        faveAdapter.notifyDataSetChanged();

                    }


                    @Override
                    public void onCancelled(DatabaseError firebaseError) {
                        Log.e("The read failed: " ,firebaseError.getMessage());
                    }
                });

            }

            @Override
            public void onChildChanged(DataSnapshot snapshot, String string){

            }

            @Override
            public void onChildMoved(DataSnapshot snapshot, String string){}

            @Override
            public void onChildAdded(DataSnapshot snapshot, String string){
                progressDialog.show();
                String restId = snapshot.getValue(String.class);
                DatabaseReference auxRef = mDatabase.child("restaurants").child(restId);


                auxRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot snapshoty) {
                        Restaurant rest = snapshoty.getValue(Restaurant.class);
                        faveRestaurantSet.add(rest);
                        faveAdapter.notifyDataSetChanged();

                    }


                    @Override
                    public void onCancelled(DatabaseError firebaseError) {
                        Log.e("The read failed: " ,firebaseError.getMessage());
                    }
                });

                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
                progressDialog.dismiss();
            }


        });



    }

    private void paintRestaurants(){
        RestaurantListFragment fragment = (RestaurantListFragment) getFragmentManager().findFragmentById(R.id.saved_restaurants);
        fragment.updateRecycler(faveAdapter);
    }

    private void setUpHostBar(){

        tabHost =(TabHost)findViewById(R.id.host_bar);
        tabHost.setup();

        spec1 = tabHost.newTabSpec("Favoritas");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Favoritas");

        spec2 = tabHost.newTabSpec("Todas");
        spec2.setIndicator("Todas");
        spec2.setContent(R.id.tab2);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);


    }

    public void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.update_user_info) {
            startEditActivity();
            return true;
        }
        else if(id == R.id.user_sign_off){

            mFirebaseAuth.signOut(); // SignOut of Firebase
            startLogInActivity();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startEditActivity(){
        Class editActivity = StudentEditActivity.class;
        Intent goToEdit = new Intent(this, editActivity);
        startActivity(goToEdit);
    }

    private void startLogInActivity() {
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(this, loginActivity);
        startActivity(goToLogin);
    }

}
