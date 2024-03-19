package com.example.movieapp.service;

import com.example.movieapp.models.Result;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
    @GET("movie/popular")
    Call<Result> getResult(@Query("api_key") String apiKey);
}
