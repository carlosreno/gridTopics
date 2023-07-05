package com.example.gridtopics.ui.gridTopic.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val amount: Int,
    @DrawableRes val image: Int
)
