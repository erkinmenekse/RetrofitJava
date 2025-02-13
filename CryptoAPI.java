package com.eugurerkinmenekse.retrofitjava2.service;

import com.eugurerkinmenekse.retrofitjava2.model.CryptoModel;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI
{
    //GET, POST, UPDATE, DELETE

    //URL BASE -> www.website.com -- Retrofitin kendi objesini oluştururken kullanıyoruz
    // GET -> price?key=xxx

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json


    @GET("atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json")
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();
}
