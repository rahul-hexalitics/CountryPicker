package com.hexalitics.countrypicker.model

data class CountryItem(
    val codeName: String? = null,

    val phoneCode: String? = null,

    val countryName: String? = null,

    val flagImage: Int? = null,

    var selected: Boolean = false,

    )