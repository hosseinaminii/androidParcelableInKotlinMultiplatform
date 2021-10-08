package com.example.parcelableinkotlinmultiplatform

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual typealias CommonParcelize = Parcelize

actual typealias CommonParcelable = Parcelable