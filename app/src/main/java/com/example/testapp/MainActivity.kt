package com.example.testapp

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.testapp.presentation.authorization.check_phone.AuthPhoneFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, AuthPhoneFragment.newInstance())
            .commit()
    }
}