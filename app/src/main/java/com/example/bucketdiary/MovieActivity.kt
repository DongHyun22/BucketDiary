package com.example.bucketdiary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.movie.*


class MovieActivity : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.movie, container, false)
        return view
    }

    override fun onStart() {

        val profileList = arrayListOf(
            Profiles("이프 온리"),
            Profiles("비포선라이즈"),
            Profiles("동드로이드"),
            Profiles("동드로이드"),
            Profiles("이프 온리"),
            Profiles("비포선라이즈"),
            Profiles("동드로이드"),
            Profiles("동드로이드")
        )

        rv_movie.layoutManager = LinearLayoutManager(requireView().context, LinearLayoutManager.VERTICAL, false)
        rv_movie.setHasFixedSize(true)

        rv_movie.adapter = ProfileAdapter(profileList)
        super.onStart()
    }
}