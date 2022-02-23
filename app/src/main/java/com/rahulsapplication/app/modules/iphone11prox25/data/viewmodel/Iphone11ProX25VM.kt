package com.rahulsapplication.app.modules.iphone11prox25.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox25.`data`.model.Iphone11ProX25Model
import com.rahulsapplication.app.modules.iphone11prox25.`data`.model.Iphone11ProX26RowModel
import kotlin.collections.MutableList

public class Iphone11ProX25VM : ViewModel() {
  public val iphone11ProX25Model: MutableLiveData<Iphone11ProX25Model> =
      MutableLiveData(Iphone11ProX25Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup136List: MutableLiveData<MutableList<Iphone11ProX26RowModel>> =
      MutableLiveData(mutableListOf())
}
