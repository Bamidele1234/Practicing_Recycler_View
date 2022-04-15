package com.example.scrollview.data

import com.example.scrollview.R
import com.example.scrollview.model.Values

class Datasource {
    fun loadValues(): List<Values>{

        return listOf(
            /**
             * This is where the values all go in
             *
             * The name of the item goes first
             * Followed by a bit of description about the product
             * Then the price of the product
             *
             */
            Values(R.string.name1, R.string.nike_sec, R.string.nike_price, R.drawable.airforce1),
            Values(R.string.name2, R.string.iphone_sec, R.string.iphone_price, R.drawable.iphone13),
            Values(R.string.name3, R.string.ps5_sec, R.string.ps5_price, R.drawable.ps5_all_consoles),
            Values(R.string.name4, R.string.air_sec, R.string.air_price, R.drawable.airpods),
            // TODO: If the airpods image does not fit the screen resolution just replace it with the other one
            Values(R.string.name5, R.string.rolex_sec, R.string.rolex_price, R.drawable.rolex),
            Values(R.string.name6, R.string.laptop_Sec, R.string.laptop_price, R.drawable.gaminglaptop),
            Values(R.string.name7, R.string.perfumeSec, R.string.perfume_price, R.drawable.perfume),
            Values(R.string.name8, R.string.wireless_Sec, R.string.wireless_Price, R.drawable.wireless),
            Values(R.string.name9, R.string.iron_sec, R.string.iron_Price, R.drawable.iron),
            Values(R.string.name10, R.string.air_Sec, R.string.acPrice, R.drawable.conditioner)
        )
    }
}