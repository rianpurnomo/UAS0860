package com.github0860.api.api

import com.github0860.api.data.model.DetailUserResponse
import com.github0860.api.data.model.User
import com.github0860.api.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 04538977d0b31d3280be88c81f5fdf17cf36a561")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 04538977d0b31d3280be88c81f5fdf17cf36a561")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 04538977d0b31d3280be88c81f5fdf17cf36a561")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 04538977d0b31d3280be88c81f5fdf17cf36a561")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}