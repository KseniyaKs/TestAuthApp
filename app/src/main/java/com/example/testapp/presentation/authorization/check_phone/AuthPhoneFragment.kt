package com.example.testapp.presentation.authorization.check_phone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testapp.R
import com.example.testapp.databinding.FragmentAuthPhoneBinding
import com.example.testapp.presentation.authorization.check_confirmcode.AuthConfirmCodeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthPhoneFragment : Fragment(R.layout.fragment_auth_phone) {

    companion object {
        fun newInstance() = AuthPhoneFragment()
    }

    private val binding: FragmentAuthPhoneBinding by viewBinding()
    var asdClickListener: (() -> Unit)? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.apply {
            navButton.setOnClickListener{
                requireActivity().supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container, AuthConfirmCodeFragment.newInstance())
                    .commit()
            }
        }
    }

    private fun initNavigation() {

    }

}