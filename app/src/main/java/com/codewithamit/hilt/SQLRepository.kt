package com.codewithamit.hilt

import android.util.Log
import javax.inject.Inject

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in DB: $email")
    }
}