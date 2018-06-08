package com.github.wataanaber.myapplication.ui.userprofile

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.wataanaber.myapplication.R
import com.github.wataanaber.myapplication.domain.model.User

class UserProfileFragment : Fragment() {

    companion object {
        const val UID_KEY = "uid"
        fun newInstance(uid: String) = UserProfileFragment().apply {
            val b = Bundle()
            b.putString(UID_KEY, uid)
            arguments = b
        }
    }

    private lateinit var viewModel: UserProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.user_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val uid = arguments?.getString(UID_KEY)
        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel::class.java)
        uid?.let {
            viewModel.init(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.user?.observe(this, Observer<User> {
            //update ui
        })
    }

}
