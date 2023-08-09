package com.codewithamit.hilt

import android.util.Log

class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in firebase store: $email")
    }
}