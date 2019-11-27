package com.abhiandroid.ecommercestorein.Retrofit;

//import retrofit.RestAdapter;
import retrofit.Retrofit;

/**
 * Created by AbhiAndroid
 */
public class Api {

    public static ApiInterface getClient() {

        // change your base URL
        Retrofit adapter = new Retrofit.Builder()
                .baseUrl("http://abhidemo.com") //Set the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        ApiInterface api = adapter.create(ApiInterface.class);
        return api;
    }
}
