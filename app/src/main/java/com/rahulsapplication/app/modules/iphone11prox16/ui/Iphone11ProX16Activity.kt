package com.rahulsapplication.app.modules.iphone11prox16.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX16Binding
import com.rahulsapplication.app.modules.iphone11prox16.`data`.viewmodel.Iphone11ProX16VM
import com.rahulsapplication.app.modules.iphone11prox17.ui.Iphone11ProX17Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX16Activity :
    BaseActivity<ActivityIphone11ProX16Binding>(R.layout.activity_iphone_11_pro_x_16) {
  private val viewModel: Iphone11ProX16VM by viewModels<Iphone11ProX16VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX16VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton1.setOnClickListener {
      val destIntent = Iphone11ProX17Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX17Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X16ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX16Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
