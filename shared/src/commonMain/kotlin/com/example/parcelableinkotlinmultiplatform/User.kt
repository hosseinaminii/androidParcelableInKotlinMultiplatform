package com.example.parcelableinkotlinmultiplatform

/**
 * Created by hosseinAmini.
 * Email: hosseinamiinii@gmail.com
 */
@CommonParcelize
data class User(
    val id: Int,
    val firstname: String
): CommonParcelable
