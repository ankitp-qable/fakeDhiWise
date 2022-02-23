package com.rahulsapplication.app.modules.iphone11prox31.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIphone11ProX32Binding
import com.rahulsapplication.app.modules.iphone11prox31.`data`.model.Iphone11ProX32RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup171Adapter(
  public var list: List<Iphone11ProX32RowModel>
) : RecyclerView.Adapter<RecyclerGroup171Adapter.RowIphone11ProX32VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone11ProX32VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_11_pro_x_32,parent,false)
    return RowIphone11ProX32VH(view)
  }

  public override fun onBindViewHolder(holder: RowIphone11ProX32VH, position: Int): Unit {
    val iphone11ProX32RowModel = Iphone11ProX32RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone11ProX32RowModel = list[position]
    holder.binding.iphone11ProX32RowModel = iphone11ProX32RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone11ProX32RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Iphone11ProX32RowModel
    ): Unit {
    }
  }

  public inner class RowIphone11ProX32VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIphone11ProX32Binding = RowIphone11ProX32Binding.bind(itemView)
  }
}
