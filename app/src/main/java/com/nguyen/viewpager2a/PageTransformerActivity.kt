package com.nguyen.viewpager2a

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.nguyen.viewpager2a.cards.CardViewAdapter

/**
 * Shows examples of [ViewPager2.PageTransformer], e.g. [MarginPageTransformer].
 */
class PageTransformerActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_transformer)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = CardViewAdapter()

        OrientationController(viewPager, findViewById(R.id.orientation_spinner)).setUp()
        PageTransformerController(viewPager, findViewById(R.id.transformer_spinner)).setUp()
    }
}
