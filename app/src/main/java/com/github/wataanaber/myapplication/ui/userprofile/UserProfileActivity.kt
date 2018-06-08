package com.github.wataanaber.myapplication.ui.userprofile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.wataanaber.myapplication.R
import java.util.*

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, UserProfileFragment.newInstance(UUID.randomUUID().toString()))
                    .commitNow()
        }
    }

}
