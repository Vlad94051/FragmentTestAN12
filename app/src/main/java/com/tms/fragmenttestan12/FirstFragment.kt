package com.tms.fragmenttestan12

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tms.fragmenttestan12.models.User
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    companion object {
        const val TAG = "FirstFragment"

        private const val USER_KEY = "user_key"

        fun newInstance(user: User) = FirstFragment()
            .apply {
                arguments = Bundle().apply { putParcelable(USER_KEY, user) }
            }
    }

    private val user: User? by lazy { arguments?.getParcelable(USER_KEY) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = user?.toString()
    }
}