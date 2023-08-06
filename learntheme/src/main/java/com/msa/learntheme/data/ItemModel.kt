package com.msa.learntheme.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.msa.learntheme.R

data class ItemModel(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int

)

val itemsModel = listOf(
    ItemModel(R.drawable.image1, R.string.dog_name_1, 2, R.string.dog_description_1),
    ItemModel(R.drawable.image1, R.string.dog_name_2, 16, R.string.dog_description_2),

)