package com.rahulsapplication.app.modules.iphone11prox17.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX17Binding
import com.rahulsapplication.app.modules.iphone11prox17.`data`.viewmodel.Iphone11ProX17VM
import com.rahulsapplication.app.modules.iphone11prox19.ui.Iphone11ProX19Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX17Activity :
    BaseActivity<ActivityIphone11ProX17Binding>(R.layout.activity_iphone_11_pro_x_17) {
  private val viewModel: Iphone11ProX17VM by viewModels<Iphone11ProX17VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX17VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton1.setOnClickListener {
      val destIntent = Iphone11ProX19Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X17ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX17Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
