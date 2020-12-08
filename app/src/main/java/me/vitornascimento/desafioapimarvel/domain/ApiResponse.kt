package me.vitornascimento.desafioapimarvel.domain

import com.google.gson.annotations.SerializedName

data class ApiResponse<T> (
    @SerializedName("data") val data: ApiData<T>
)