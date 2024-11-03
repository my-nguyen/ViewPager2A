package com.nguyen.viewpager2a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nguyen.viewpager2a.cards.Card
import com.nguyen.viewpager2a.cards.CardView

/**
 * Shows how to use a [androidx.viewpager2.widget.ViewPager2] with Fragments, via a
 * [androidx.viewpager2.adapter.FragmentStateAdapter]
 *
 * @see CardViewActivity for an example of using {@link androidx.viewpager2.widget.ViewPager2} with
 * Views.
 */
class CardFragmentActivity : BaseCardActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewPager.adapter = object : FragmentStateAdapter(this) {
            override fun createFragment(position: Int): Fragment {
                return CardFragment.create(Card.DECK[position])
            }

            override fun getItemCount(): Int {
                return Card.DECK.size
            }
        }
    }

    class CardFragment : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val cardView = CardView(layoutInflater, container)
            cardView.bind(Card.fromBundle(requireArguments()))
            return cardView.view
        }

        companion object {

            /** Creates a Fragment for a given [Card]  */
            fun create(card: Card): CardFragment {
                val fragment = CardFragment()
                fragment.arguments = card.toBundle()
                return fragment
            }
        }
    }
}
