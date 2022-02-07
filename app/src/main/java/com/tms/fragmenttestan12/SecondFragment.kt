package com.tms.fragmenttestan12

import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {
    companion object {
        const val TAG = "SecondFragment"

        fun newInstance() = SecondFragment()
    }
}