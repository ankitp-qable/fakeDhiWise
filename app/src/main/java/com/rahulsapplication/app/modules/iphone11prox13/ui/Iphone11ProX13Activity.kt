package com.rahulsapplication.app.modules.iphone11prox13.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX13Binding
import com.rahulsapplication.app.modules.iphone11prox13.`data`.viewmodel.Iphone11ProX13VM
import com.rahulsapplication.app.modules.iphone11prox15.ui.Iphone11ProX15Activity
import com.rahulsapplication.app.modules.iphone11prox16.ui.Iphone11ProX16Activity
import com.rahulsapplication.app.modules.iphone11prox17.ui.Iphone11ProX17Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX13Activity :
    BaseActivity<ActivityIphone11ProX13Binding>(R.layout.activity_iphone_11_pro_x_13) {
  private val viewModel: Iphone11ProX13VM by viewModels<Iphone11ProX13VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX13VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameGroup69.setOnClickListener {
      val destIntent = Iphone11ProX15Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX16Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton1.setOnClickListener {
      val destIntent = Iphone11ProX17Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X13ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX13Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
