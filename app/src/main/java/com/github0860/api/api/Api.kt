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
    @Headers("Authorization: token 0b430bf4257ba0a669035b6a5c6a5519c282b4ac")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 0b430bf4257ba0a669035b6a5c6a5519c282b4ac")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 0b430bf4257ba0a669035b6a5c6a5519c282b4ac")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 0b430bf4257ba0a669035b6a5c6a5519c282b4ac")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}