package com.tms.fragmenttestan12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.tms.fragmenttestan12.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initViews()
    }

    private fun initViews() {
        btn.setOnClickListener {
            if (counter % 2 == 0) {
                val fragment = FirstFragment.newInstance(user = User(name = "Ivan", age = 12))
                openFragment(fragment, FirstFragment.TAG, R.id.container)
            } else {
                openFragment(SecondFragment.newInstance(), SecondFragment.TAG, R.id.container)
            }
            counter++
        }
    }
}