package com.nguyen.viewpager2a

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.nguyen.viewpager2a.cards.CardViewAdapter

/**
 * Shows how to use [ViewPager2.setAdapter] with Views.
 *
 * @see CardFragmentActivity for an example of using {@link ViewPager2} with Fragments.
 */
open class CardViewActivity : BaseCardActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewPager.adapter = CardViewAdapter()
    }
}
