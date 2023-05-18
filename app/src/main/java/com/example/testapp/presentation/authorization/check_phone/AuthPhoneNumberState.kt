package com.example.testapp.presentation.authorization.check_phone

sealed class AuthPhoneNumberState {

    object Success: AuthPhoneNumberState()
    object Error: AuthPhoneNumberState()
}
