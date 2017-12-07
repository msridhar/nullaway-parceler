package com.test.nullaway.models;

import org.parceler.Parcel;

import io.realm.RealmObject;
import io.realm.UserRealmProxy;

/**
 * Created by thibaud on 07/12/2017.
 */
@Parcel(implementations = { UserRealmProxy.class },
        value = Parcel.Serialization.BEAN,
        analyze = { User.class })
public class User extends RealmObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
