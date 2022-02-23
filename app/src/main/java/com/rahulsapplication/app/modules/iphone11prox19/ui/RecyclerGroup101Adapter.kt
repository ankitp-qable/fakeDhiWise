package com.rahulsapplication.app.modules.iphone11prox19.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowIphone11ProX21Binding
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX21RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup101Adapter(
  public var list: List<Iphone11ProX21RowModel>
) : RecyclerView.Adapter<RecyclerGroup101Adapter.RowIphone11ProX21VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIphone11ProX21VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_iphone_11_pro_x_21,parent,false)
    return RowIphone11ProX21VH(view)
  }

  public override fun onBindViewHolder(holder: RowIphone11ProX21VH, position: Int): Unit {
    val iphone11ProX21RowModel = Iphone11ProX21RowModel()
    // TODO uncomment following line after integration with data source
    // val iphone11ProX21RowModel = list[position]
    holder.binding.iphone11ProX21RowModel = iphone11ProX21RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Iphone11ProX21RowModel>): Unit {
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
      item: Iphone11ProX21RowModel
    ): Unit {
    }
  }

  public inner class RowIphone11ProX21VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIphone11ProX21Binding = RowIphone11ProX21Binding.bind(itemView)
    init {
      binding.linearGroup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Iphone11ProX21RowModel())
      }
    }
  }
}
