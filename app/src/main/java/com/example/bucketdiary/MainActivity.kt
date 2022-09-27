package com.example.bucketdiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

//    private var mBinding : ActivityMainBinding? = null
//    private  val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_navi!!.setOnClickListener {
            layout_drawer!!.openDrawer(GravityCompat.START)
        }

        naviView!!.setNavigationItemSelectedListener(this)



    }

//    override fun onDestroy() {
//        mBinding = null
//        super.onDestroy()
//    }
//    private fun viewBinding() {
//        mBinding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum)
        {
            0->{
                ft.replace(R.id.main_frame, FoodActivity()).commit()
            }
            1->{
                ft.replace(R.id.main_frame, MovieActivity()).commit()
            }
            2->{
                ft.replace(R.id.main_frame, TravelActivity()).commit()
            }
        }
    }


    override fun onBackPressed() {
        if(layout_drawer?.isDrawerOpen(GravityCompat.START) == true)
        {
            layout_drawer!!.closeDrawers()
        }
        else
        {
            super.onBackPressed()
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 네비게이션 메뉴 아이템 클릭시 수행
        when (item.itemId)
        {
            R.id.food -> setFrag(0)
            R.id.movie -> setFrag(1)
            R.id.travel -> setFrag(2)
        }
        layout_drawer.closeDrawers()
        return false
    }
}