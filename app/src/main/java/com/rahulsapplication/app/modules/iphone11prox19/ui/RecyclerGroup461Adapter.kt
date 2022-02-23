package com.rahulsapplication.app.modules.iphone11prox19.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIphone11ProX20Binding
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX20RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup461Adapter(
  public var list: List<Iphone11ProX20RowModel>
) : RecyclerView.Adapter<RecyclerGroup461Adapter.RowIphone11ProX20VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone11ProX20VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_11_pro_x_20,parent,false)
    return RowIphone11ProX20VH(view)
  }

  public override fun onBindViewHolder(holder: RowIphone11ProX20VH, position: Int): Unit {
    val iphone11ProX20RowModel = Iphone11ProX20RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone11ProX20RowModel = list[position]
    holder.binding.iphone11ProX20RowModel = iphone11ProX20RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone11ProX20RowModel>): Unit {
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
      item: Iphone11ProX20RowModel
    ): Unit {
    }
  }

  public inner class RowIphone11ProX20VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIphone11ProX20Binding = RowIphone11ProX20Binding.bind(itemView)
  }
}
