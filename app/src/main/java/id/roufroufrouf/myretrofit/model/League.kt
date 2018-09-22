package com.roufroufrouf.kursuskotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class League(
//        var idLeague: String? = null,
//        var strLeague: String? = null,
//        var strSport: String? = null,
//        var strLeagueAlternate: String? = null
        var idLeague: Int? = null,
        var strLeague: String? = null,
        var strSport: String? = null,
        var strLeagueAlternate: String? = null
) : Parcelable