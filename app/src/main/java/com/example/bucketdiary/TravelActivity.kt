package com.example.bucketdiary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.travel.*


class TravelActivity : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.travel, container, false)
        return view
    }

    override fun onStart() {

        val profileList = arrayListOf(
            Profiles("호주"),
            Profiles("싱가폴"),
            Profiles("홍콩"),
            Profiles("미국"),
            Profiles("캐나다"),
            Profiles("파리"),
            Profiles("런던"),
            Profiles("프랑스"),
            Profiles("호주"),
            Profiles("싱가폴"),
            Profiles("홍콩"),
            Profiles("미국"),
            Profiles("캐나다"),
            Profiles("파리"),
            Profiles("런던"),
            Profiles("프랑스"),
            Profiles("호주"),
            Profiles("싱가폴"),
            Profiles("홍콩"),
            Profiles("미국"),
            Profiles("캐나다"),
            Profiles("파리"),
            Profiles("런던"),
            Profiles("프랑스")
        )

        rv_travel.layoutManager = LinearLayoutManager(requireView().context, LinearLayoutManager.VERTICAL, false)
        rv_travel.setHasFixedSize(true)

        rv_travel.adapter = ProfileAdapter(profileList)
        super.onStart()
    }
}