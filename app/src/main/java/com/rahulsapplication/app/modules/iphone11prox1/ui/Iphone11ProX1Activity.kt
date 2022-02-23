package com.rahulsapplication.app.modules.iphone11prox1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX1Binding
import com.rahulsapplication.app.modules.iphone11prox1.`data`.viewmodel.Iphone11ProX1VM
import com.rahulsapplication.app.modules.iphone11prox14.ui.Iphone11ProX14Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX1Activity :
    BaseActivity<ActivityIphone11ProX1Binding>(R.layout.activity_iphone_11_pro_x_1) {
  private val viewModel: Iphone11ProX1VM by viewModels<Iphone11ProX1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageIcon.setOnClickListener {
      val destIntent = Iphone11ProX14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
