package com.example.testapp.presentation.authorization.check_confirmcode

import androidx.fragment.app.Fragment
import com.example.testapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthConfirmCodeFragment : Fragment(R.layout.fragment_auth_confirm_code) {

    companion object {
        fun newInstance() = AuthConfirmCodeFragment()
    }
}