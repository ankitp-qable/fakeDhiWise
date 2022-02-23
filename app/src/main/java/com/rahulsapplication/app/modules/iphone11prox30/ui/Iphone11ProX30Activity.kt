package com.rahulsapplication.app.modules.iphone11prox30.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX30Binding
import com.rahulsapplication.app.modules.iphone11prox19.ui.Iphone11ProX19Activity
import com.rahulsapplication.app.modules.iphone11prox30.`data`.viewmodel.Iphone11ProX30VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX30Activity :
    BaseActivity<ActivityIphone11ProX30Binding>(R.layout.activity_iphone_11_pro_x_30) {
  private val viewModel: Iphone11ProX30VM by viewModels<Iphone11ProX30VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX30VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX19Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X30ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX30Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
