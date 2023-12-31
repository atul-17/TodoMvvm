package com.example.currencymvvm.data

import com.example.currencymvvm.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Currency {
    @GET("/latest")
    suspend fun getRates(
        @Query("base")base : String
    ) : Response<CurrencyResponse>

}