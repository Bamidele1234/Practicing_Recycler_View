package com.example.scrollview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Values(
    @StringRes val stringTitleId: Int,
    @StringRes val stringSecId: Int,
    @StringRes val stringAddId: Int,
    @DrawableRes val imageId: Int) {

}
