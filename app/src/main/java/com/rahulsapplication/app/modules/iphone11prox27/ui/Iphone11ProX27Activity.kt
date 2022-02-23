package com.rahulsapplication.app.modules.iphone11prox27.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX27Binding
import com.rahulsapplication.app.modules.iphone11prox17.ui.Iphone11ProX17Activity
import com.rahulsapplication.app.modules.iphone11prox19.ui.Iphone11ProX19Activity
import com.rahulsapplication.app.modules.iphone11prox27.`data`.viewmodel.Iphone11ProX27VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX27Activity :
    BaseActivity<ActivityIphone11ProX27Binding>(R.layout.activity_iphone_11_pro_x_27) {
  private val viewModel: Iphone11ProX27VM by viewModels<Iphone11ProX27VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.iphone11ProX27VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageVector4.setOnClickListener {
      val destIntent = Iphone11ProX19Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogOut.setOnClickListener {
      val destIntent = Iphone11ProX17Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X27ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX27Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
