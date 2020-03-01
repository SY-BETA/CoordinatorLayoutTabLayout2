package com.example.coordinatorlayouttablayout2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class ViewPagerAdapter (fm: FragmentManager, private val fragmentList: List<Fragment>) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT ) {

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "TAB01"
            1 -> "TAB02"
            2 -> "TAB03"
            3 -> "TAB04"
            else ->""
        }

    }
}