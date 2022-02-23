package com.rahulsapplication.app.modules.iphone11prox22.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIphone11ProX24Binding
import com.rahulsapplication.app.modules.iphone11prox22.`data`.model.Iphone11ProX24RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup115Adapter(
  public var list: List<Iphone11ProX24RowModel>
) : RecyclerView.Adapter<RecyclerGroup115Adapter.RowIphone11ProX24VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone11ProX24VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_11_pro_x_24,parent,false)
    return RowIphone11ProX24VH(view)
  }

  public override fun onBindViewHolder(holder: RowIphone11ProX24VH, position: Int): Unit {
    val iphone11ProX24RowModel = Iphone11ProX24RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone11ProX24RowModel = list[position]
    holder.binding.iphone11ProX24RowModel = iphone11ProX24RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone11ProX24RowModel>): Unit {
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
      item: Iphone11ProX24RowModel
    ): Unit {
    }
  }

  public inner class RowIphone11ProX24VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIphone11ProX24Binding = RowIphone11ProX24Binding.bind(itemView)
  }
}
