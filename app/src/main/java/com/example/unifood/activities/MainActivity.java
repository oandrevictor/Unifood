package com.example.unifood.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.example.unifood.R;
import com.example.unifood.adapters.UniversityListAdapter;
import com.example.unifood.models.University;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static android.R.attr.type;
import static com.example.unifood.R.drawable.fullbg;

public class MainActivity extends AppCompatActivity {
    private UniversityListAdapter mAdapter;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    private DatabaseReference mDatabase;
    private ArrayList<University> dataSet = new ArrayList<>();
    DatabaseReference ref;
    String userType;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);


        setContentView(R.layout.activity_main);
        ImageView mImageView = (ImageView) findViewById(R.id.backg);
        mImageView.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.drawable.fullbg, 100, 100));
        setUpFirebase();

        getSupportActionBar().hide();


        if (mFirebaseUser == null) {
            // Not logged in, launch the Log In activity
            startLogInActivity();
        }
        else{
            String uid = mFirebaseUser.getUid();
            ref= mDatabase.child("users").child(uid).child("userInfo").child("type");
            userType = "";
            ref.addValueEventListener (new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    Log.e("h", snapshot.getKey());
                    userType = snapshot.getValue(String.class);
                    if (userType.equals("student")){
                        startStudentHome();
                    } else if (userType.equals("owner")) {
                        startRestaurntHome();
                    }
                }
                @Override
                public void onCancelled(DatabaseError firebaseError) {
                    Log.e("The read failed: " ,firebaseError.getMessage());
                }
            });

        }



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Gets a reference from the database at Firebase server as well the Auth system and the current user.
     */
    private void setUpFirebase(){
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    /**
     * Starts the LogInActivity
     */
    private void startLogInActivity() {
        Class loginActivity = LoginActivity.class;
        Intent goToLogin = new Intent(this, loginActivity);
        startActivity(goToLogin);
    }

    private void startAdmActivity() {
        Class admActivity = AdminUniversityActivity.class;
        Intent goToAdm = new Intent(this, admActivity);
        startActivity(goToAdm);
    }

    private void startStudentHome(){
        Class studentHome = StudentHomeActivity.class;
        Intent goToSHome = new Intent(this, studentHome);
        startActivity(goToSHome);
    }

    private void startRestaurntHome() {
        Class restaurantHome = RestaurantHomeActivity.class;
        Intent goToRHome = new Intent(this, restaurantHome);
        System.out.println("Vou startar owner ein");
        startActivity(goToRHome);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName(getString(R.string.main_page)) // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse(getString(R.string.enter_your_url)))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }


    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize) > reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }


}
