package com.rahulsapplication.app.modules.iphone11prox31.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseFragment
import com.rahulsapplication.app.databinding.FragmentIphone11ProX31Binding
import com.rahulsapplication.app.modules.iphone11prox31.`data`.model.Iphone11ProX32RowModel
import com.rahulsapplication.app.modules.iphone11prox31.`data`.viewmodel.Iphone11ProX31VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Iphone11ProX31Fragment :
    BaseFragment<FragmentIphone11ProX31Binding>(R.layout.fragment_iphone_11_pro_x_31) {
  private val viewModel: Iphone11ProX31VM by viewModels<Iphone11ProX31VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerGroup171Adapter =
    RecyclerGroup171Adapter(viewModel.recyclerGroup171List.value?:mutableListOf())
    binding.recyclerGroup171.adapter = recyclerGroup171Adapter
    recyclerGroup171Adapter.setOnItemClickListener(
    object : RecyclerGroup171Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Iphone11ProX32RowModel) {
        onClickRecyclerGroup171(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup171List.observe(requireActivity()) {
      recyclerGroup171Adapter.updateData(it)
    }
    binding.iphone11ProX31VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup171(
    view: View,
    position: Int,
    item: Iphone11ProX32RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X31FRAGMENT"
  }
}
