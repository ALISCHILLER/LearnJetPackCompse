package com.msa.scrollablelist.data

import com.msa.scrollablelist.R
import com.msa.scrollablelist.data.model.Affirmation

class Datasource {
    fun loadAffirmations():List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmationText1, R.drawable.image1),
            Affirmation(R.string.affirmationText2, R.drawable.image2),
        )

    }
}