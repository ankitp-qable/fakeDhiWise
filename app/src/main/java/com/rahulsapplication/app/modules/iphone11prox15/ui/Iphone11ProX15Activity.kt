package com.rahulsapplication.app.modules.iphone11prox15.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX15Binding
import com.rahulsapplication.app.modules.iphone11prox15.`data`.viewmodel.Iphone11ProX15VM
import com.rahulsapplication.app.modules.iphone11prox16.ui.Iphone11ProX16Activity
import com.rahulsapplication.app.modules.iphone11prox17.ui.Iphone11ProX17Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX15Activity :
    BaseActivity<ActivityIphone11ProX15Binding>(R.layout.activity_iphone_11_pro_x_15) {
  private val viewModel: Iphone11ProX15VM by viewModels<Iphone11ProX15VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX15VM = viewModel
  }

  public override fun setUpClicks(): Unit {
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
    public const val TAG: String = "IPHONE11PRO_X15ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX15Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
