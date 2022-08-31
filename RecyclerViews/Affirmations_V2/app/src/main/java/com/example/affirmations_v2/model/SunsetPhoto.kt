package com.example.affirmations_v2.model

import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SunsetPhoto(val url: String) : Parcelable {

    companion object {
        fun getSunsetPhotos(): Array<SunsetPhoto> {
            return arrayOf<SunsetPhoto>(
                SunsetPhoto("https://goo.gl/32YN2B"),
                SunsetPhoto("https://goo.gl/Wqz4Ev"),
                SunsetPhoto("https://goo.gl/U7XXdF"),
                SunsetPhoto("https://goo.gl/ghVPFq"),
                SunsetPhoto("https://goo.gl/qEaCWe"),
                SunsetPhoto("https://goo.gl/vutGmM")
            )
        }
    }
}