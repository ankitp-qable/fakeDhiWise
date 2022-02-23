package com.rahulsapplication.app.modules.iphone11prox18.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX18Binding
import com.rahulsapplication.app.modules.iphone11prox18.`data`.viewmodel.Iphone11ProX18VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX18Activity :
    BaseActivity<ActivityIphone11ProX18Binding>(R.layout.activity_iphone_11_pro_x_18) {
  private val viewModel: Iphone11ProX18VM by viewModels<Iphone11ProX18VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX18VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X18ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX18Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
