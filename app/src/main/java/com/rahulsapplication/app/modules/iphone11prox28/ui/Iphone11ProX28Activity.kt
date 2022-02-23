package com.rahulsapplication.app.modules.iphone11prox28.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX28Binding
import com.rahulsapplication.app.modules.iphone11prox25.ui.Iphone11ProX25Activity
import com.rahulsapplication.app.modules.iphone11prox28.`data`.viewmodel.Iphone11ProX28VM
import com.rahulsapplication.app.modules.iphone11prox29.ui.Iphone11ProX29Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX28Activity :
    BaseActivity<ActivityIphone11ProX28Binding>(R.layout.activity_iphone_11_pro_x_28) {
  private val viewModel: Iphone11ProX28VM by viewModels<Iphone11ProX28VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX28VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageVector36.setOnClickListener {
      val destIntent = Iphone11ProX25Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX29Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X28ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX28Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
