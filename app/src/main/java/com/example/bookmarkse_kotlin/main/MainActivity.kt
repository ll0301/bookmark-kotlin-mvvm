package com.example.bookmarkse_kotlin.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.bookmarkse_kotlin.R
import com.google.android.material.navigation.NavigationView
import com.example.bookmarkse_kotlin.util.setupActionBar

class MainActivity : AppCompatActivity(), MainHomeNavigator {

    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mNavigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_act)

        setupActionBar(R.id.toolbar) {
            setHomeAsUpIndicator(R.drawable.ic_menu)
            setDisplayHomeAsUpEnabled(true)
        }

        setupNavigationDrawer()

    }

    private fun setupNavigationDrawer() {
        mDrawerLayout = (findViewById<DrawerLayout>(R.id.drawer_layout)).apply {
            setStatusBarBackground(R.color.colorPrimaryDark)
        }
        setupDrawerContent(findViewById(R.id.navigation_view))
    }

    private fun setupDrawerContent(navigationView: NavigationView) {
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.list_navigation_menu_item -> {
                    // Do nothing
                }
                R.id.temp_menu_item -> {
                    error("d")
                }
            }
            menuItem.isChecked = true
            mDrawerLayout.closeDrawers()
            true
        }
    }

    override fun setToolbarTitle(title: String) {
        TODO("Not yet implemented")
    }

}