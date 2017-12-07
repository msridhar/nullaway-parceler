package com.test.nullaway.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.test.nullaway.R;
import com.test.nullaway.models.User;

import org.parceler.Parcels;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);
        final RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);

        final User in = new User();
        in.setName("Test test");
        Parcelable userParceled = Parcels.wrap(in);
        final User out = Parcels.unwrap(userParceled);

        Log.d(TAG, out.getName());
    }
}
