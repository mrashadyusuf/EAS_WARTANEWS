package com.example.portalBerita.api;

import com.example.portalBerita.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch(

        @Query("q") String keyword,
        @Query("language") String language,
        @Query("sortBy") String sortBy,
        @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearch2(

            @Query("q") String keyword,
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("from") String from,
            @Query("apiKey") String apiKey
    );


    @GET("everything")
    Call<News> getNewsSearch3(
            @Query("q") String keyword,
            @Query("apiKey") String apiKey
    );


    @GET("everything")
    Call<News> getNewsSearch4(
            @Query("q") String keyword,
            @Query("from") String from,
            @Query("to") String to,
            @Query("apiKey") String apiKey

    );


    @GET("everything")
    Call<News> getNewsSearch5(
            @Query("sources") String sources,
            @Query("apiKey") String apiKey

    );


    @GET("top-headlines")
    Call<News> getNewsSearch6(
            @Query("country") String country,
            @Query("apiKey") String apiKey

    );

    @GET("everything")
    Call<News> getNewsSearchAll(
            @Query("q") String keyword,
            @Query("from") String from,
            @Query("to") String to,
            @Query("domains") String sources,
            @Query("apiKey") String apiKey

    );
}
