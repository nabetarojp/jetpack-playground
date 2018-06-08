package com.github.wataanaber.myapplication.ui.userprofile

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.github.wataanaber.myapplication.domain.model.User

class UserProfileViewModel : ViewModel() {

    private var userId: String? = null
    var user: LiveData<User>? = null

    fun init(userId: String) {
        this.userId = userId
    }

}
