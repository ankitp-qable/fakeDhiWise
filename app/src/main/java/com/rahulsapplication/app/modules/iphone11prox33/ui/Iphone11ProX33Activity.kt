package com.rahulsapplication.app.modules.iphone11prox33.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX33Binding
import com.rahulsapplication.app.modules.iphone11prox33.`data`.viewmodel.Iphone11ProX33VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX33Activity :
    BaseActivity<ActivityIphone11ProX33Binding>(R.layout.activity_iphone_11_pro_x_33) {
  private val viewModel: Iphone11ProX33VM by viewModels<Iphone11ProX33VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX33VM = viewModel
    val adapter = Iphone11ProX33ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup173.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup64,binding.viewPagerGroup173) { tab, position ->
      tab.text = Iphone11ProX33ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "IPHONE11PRO_X33ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone11ProX33Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
