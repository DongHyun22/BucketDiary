package com.example.bucketdiary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.food.*


class FoodActivity : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.food, container, false)
        return view
    }

    override fun onStart() {

        val profileList = arrayListOf(
            Profiles("고기"),
            Profiles("생선"),
            Profiles("달걀"),
            Profiles("동드로이드"),
            Profiles("이프 온리"),
            Profiles("비포선라이즈"),
            Profiles("동드로이드"),
            Profiles("동드로이드")
        )

        rv_food.layoutManager = LinearLayoutManager(requireView().context, LinearLayoutManager.VERTICAL, false)
        rv_food.setHasFixedSize(true)

        rv_food.adapter = ProfileAdapter(profileList)
        super.onStart()
    }
}