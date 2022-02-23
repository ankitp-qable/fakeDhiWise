package com.rahulsapplication.app.modules.iphone11prox25.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIphone11ProX26Binding
import com.rahulsapplication.app.modules.iphone11prox25.`data`.model.Iphone11ProX26RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup136Adapter(
  public var list: List<Iphone11ProX26RowModel>
) : RecyclerView.Adapter<RecyclerGroup136Adapter.RowIphone11ProX26VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone11ProX26VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_11_pro_x_26,parent,false)
    return RowIphone11ProX26VH(view)
  }

  public override fun onBindViewHolder(holder: RowIphone11ProX26VH, position: Int): Unit {
    val iphone11ProX26RowModel = Iphone11ProX26RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone11ProX26RowModel = list[position]
    holder.binding.iphone11ProX26RowModel = iphone11ProX26RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone11ProX26RowModel>): Unit {
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
      item: Iphone11ProX26RowModel
    ): Unit {
    }
  }

  public inner class RowIphone11ProX26VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIphone11ProX26Binding = RowIphone11ProX26Binding.bind(itemView)
  }
}
