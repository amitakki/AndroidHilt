package com.codewithamit.hilt


interface UserRepository {
    fun saveUser(email: String, password: String)
}