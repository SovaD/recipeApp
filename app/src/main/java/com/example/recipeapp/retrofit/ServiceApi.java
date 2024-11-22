package com.example.recipeapp.retrofit;

import com.example.recipeapp.entities.Recipe;
import com.example.recipeapp.entities.RecipeList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {
    @GET("recipes")
    Call<RecipeList> getRecipes();
}
