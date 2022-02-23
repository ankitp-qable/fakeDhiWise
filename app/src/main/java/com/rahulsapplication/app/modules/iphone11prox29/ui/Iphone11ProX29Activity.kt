package com.rahulsapplication.app.modules.iphone11prox29.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX29Binding
import com.rahulsapplication.app.modules.iphone11prox28.ui.Iphone11ProX28Activity
import com.rahulsapplication.app.modules.iphone11prox29.`data`.viewmodel.Iphone11ProX29VM
import com.rahulsapplication.app.modules.iphone11prox30.ui.Iphone11ProX30Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX29Activity :
    BaseActivity<ActivityIphone11ProX29Binding>(R.layout.activity_iphone_11_pro_x_29) {
  private val viewModel: Iphone11ProX29VM by viewModels<Iphone11ProX29VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX29VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageVector36.setOnClickListener {
      val destIntent = Iphone11ProX28Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX30Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X29ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX29Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
