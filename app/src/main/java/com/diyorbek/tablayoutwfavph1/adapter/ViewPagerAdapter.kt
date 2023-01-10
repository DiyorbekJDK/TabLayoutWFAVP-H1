package com.diyorbek.tablayoutwfavph1.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.diyorbek.tablayoutwfavph1.fragments.FirtFragment
import com.diyorbek.tablayoutwfavph1.fragments.SecondFragment

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirtFragment()
            1 -> SecondFragment()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Sing In"
            1 -> "Sing Up"
            else -> ""
        }
    }
}