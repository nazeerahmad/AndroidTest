package com.example.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {
    var email: String? = null;
    var password : String? = null;

    fun onLoginButtonClick(view : View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){

            //display error msg
            return
        }
        //success
    }
}