package com.rahulsapplication.app.modules.iphone11prox19.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX19Binding
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX20RowModel
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX21RowModel
import com.rahulsapplication.app.modules.iphone11prox19.`data`.viewmodel.Iphone11ProX19VM
import com.rahulsapplication.app.modules.iphone11prox22.ui.Iphone11ProX22Activity
import com.rahulsapplication.app.modules.iphone11prox27.ui.Iphone11ProX27Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Iphone11ProX19Activity :
    BaseActivity<ActivityIphone11ProX19Binding>(R.layout.activity_iphone_11_pro_x_19) {
  private val viewModel: Iphone11ProX19VM by viewModels<Iphone11ProX19VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup461Adapter =
    RecyclerGroup461Adapter(viewModel.recyclerGroup461List.value?:mutableListOf())
    binding.recyclerGroup461.adapter = recyclerGroup461Adapter
    recyclerGroup461Adapter.setOnItemClickListener(
    object : RecyclerGroup461Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone11ProX20RowModel) {
        onClickRecyclerGroup461(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup461List.observe(this) {
      recyclerGroup461Adapter.updateData(it)
    }
    val recyclerGroup101Adapter =
    RecyclerGroup101Adapter(viewModel.recyclerGroup101List.value?:mutableListOf())
    binding.recyclerGroup101.adapter = recyclerGroup101Adapter
    recyclerGroup101Adapter.setOnItemClickListener(
    object : RecyclerGroup101Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone11ProX21RowModel) {
        onClickRecyclerGroup101(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup101List.observe(this) {
      recyclerGroup101Adapter.updateData(it)
    }
    binding.iphone11ProX19VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearGroup399.setOnClickListener {
      val destIntent = Iphone11ProX27Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup461(
    view: View,
    position: Int,
    item: Iphone11ProX20RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup101(
    view: View,
    position: Int,
    item: Iphone11ProX21RowModel
  ): Unit {
    when(view.id) {
      R.id.linearGroup -> {
        val destIntent = Iphone11ProX22Activity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X19ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX19Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
