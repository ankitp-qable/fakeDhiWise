package com.rahulsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityAppNavigationBinding
import com.rahulsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.rahulsapplication.app.modules.iphone11prox1.ui.Iphone11ProX1Activity
import com.rahulsapplication.app.modules.iphone11prox13.ui.Iphone11ProX13Activity
import com.rahulsapplication.app.modules.iphone11prox14.ui.Iphone11ProX14Activity
import com.rahulsapplication.app.modules.iphone11prox15.ui.Iphone11ProX15Activity
import com.rahulsapplication.app.modules.iphone11prox16.ui.Iphone11ProX16Activity
import com.rahulsapplication.app.modules.iphone11prox17.ui.Iphone11ProX17Activity
import com.rahulsapplication.app.modules.iphone11prox18.ui.Iphone11ProX18Activity
import com.rahulsapplication.app.modules.iphone11prox19.ui.Iphone11ProX19Activity
import com.rahulsapplication.app.modules.iphone11prox22.ui.Iphone11ProX22Activity
import com.rahulsapplication.app.modules.iphone11prox23.ui.Iphone11ProX23Activity
import com.rahulsapplication.app.modules.iphone11prox25.ui.Iphone11ProX25Activity
import com.rahulsapplication.app.modules.iphone11prox27.ui.Iphone11ProX27Activity
import com.rahulsapplication.app.modules.iphone11prox28.ui.Iphone11ProX28Activity
import com.rahulsapplication.app.modules.iphone11prox29.ui.Iphone11ProX29Activity
import com.rahulsapplication.app.modules.iphone11prox30.ui.Iphone11ProX30Activity
import com.rahulsapplication.app.modules.iphone11prox33.ui.Iphone11ProX33Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearIPhone11ProX20.setOnClickListener {
      val destIntent = Iphone11ProX22Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX26.setOnClickListener {
      val destIntent = Iphone11ProX29Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX17.setOnClickListener {
      val destIntent = Iphone11ProX17Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX13.setOnClickListener {
      val destIntent = Iphone11ProX13Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX23.setOnClickListener {
      val destIntent = Iphone11ProX23Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX25.setOnClickListener {
      val destIntent = Iphone11ProX33Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX15.setOnClickListener {
      val destIntent = Iphone11ProX15Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX22.setOnClickListener {
      val destIntent = Iphone11ProX27Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX24.setOnClickListener {
      val destIntent = Iphone11ProX28Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX27.setOnClickListener {
      val destIntent = Iphone11ProX30Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX21.setOnClickListener {
      val destIntent = Iphone11ProX25Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX14.setOnClickListener {
      val destIntent = Iphone11ProX14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX18.setOnClickListener {
      val destIntent = Iphone11ProX18Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX16.setOnClickListener {
      val destIntent = Iphone11ProX16Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX19.setOnClickListener {
      val destIntent = Iphone11ProX19Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProX1.setOnClickListener {
      val destIntent = Iphone11ProX1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
