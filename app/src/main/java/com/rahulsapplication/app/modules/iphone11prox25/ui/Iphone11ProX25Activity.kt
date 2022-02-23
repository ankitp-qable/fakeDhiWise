package com.rahulsapplication.app.modules.iphone11prox25.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX25Binding
import com.rahulsapplication.app.modules.iphone11prox25.`data`.model.Iphone11ProX26RowModel
import com.rahulsapplication.app.modules.iphone11prox25.`data`.viewmodel.Iphone11ProX25VM
import com.rahulsapplication.app.modules.iphone11prox28.ui.Iphone11ProX28Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Iphone11ProX25Activity :
    BaseActivity<ActivityIphone11ProX25Binding>(R.layout.activity_iphone_11_pro_x_25) {
  private val viewModel: Iphone11ProX25VM by viewModels<Iphone11ProX25VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup136Adapter =
    RecyclerGroup136Adapter(viewModel.recyclerGroup136List.value?:mutableListOf())
    binding.recyclerGroup136.adapter = recyclerGroup136Adapter
    recyclerGroup136Adapter.setOnItemClickListener(
    object : RecyclerGroup136Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone11ProX26RowModel) {
        onClickRecyclerGroup136(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup136List.observe(this) {
      recyclerGroup136Adapter.updateData(it)
    }
    binding.iphone11ProX25VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX28Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup136(
    view: View,
    position: Int,
    item: Iphone11ProX26RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X25ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX25Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
