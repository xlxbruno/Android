package com.example.cookbook.model

import androidx.annotation.DrawableRes
data class Recipe(
    val title : String,
    val ingredients : List<String>,
    @DrawableRes val imageResource : Int
)