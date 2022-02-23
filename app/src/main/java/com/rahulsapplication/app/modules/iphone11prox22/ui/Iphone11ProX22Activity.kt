package com.rahulsapplication.app.modules.iphone11prox22.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX22Binding
import com.rahulsapplication.app.modules.iphone11prox22.`data`.model.Iphone11ProX24RowModel
import com.rahulsapplication.app.modules.iphone11prox22.`data`.viewmodel.Iphone11ProX22VM
import com.rahulsapplication.app.modules.iphone11prox25.ui.Iphone11ProX25Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Iphone11ProX22Activity :
    BaseActivity<ActivityIphone11ProX22Binding>(R.layout.activity_iphone_11_pro_x_22) {
  private val viewModel: Iphone11ProX22VM by viewModels<Iphone11ProX22VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup115Adapter =
    RecyclerGroup115Adapter(viewModel.recyclerGroup115List.value?:mutableListOf())
    binding.recyclerGroup115.adapter = recyclerGroup115Adapter
    recyclerGroup115Adapter.setOnItemClickListener(
    object : RecyclerGroup115Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone11ProX24RowModel) {
        onClickRecyclerGroup115(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup115List.observe(this) {
      recyclerGroup115Adapter.updateData(it)
    }
    binding.iphone11ProX22VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = Iphone11ProX25Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup115(
    view: View,
    position: Int,
    item: Iphone11ProX24RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X22ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX22Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
