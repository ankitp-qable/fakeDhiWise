package com.rahulsapplication.app.modules.iphone11prox31.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox31.`data`.model.Iphone11ProX31Model
import com.rahulsapplication.app.modules.iphone11prox31.`data`.model.Iphone11ProX32RowModel
import kotlin.collections.MutableList

public class Iphone11ProX31VM : ViewModel() {
  public val iphone11ProX31Model: MutableLiveData<Iphone11ProX31Model> =
      MutableLiveData(Iphone11ProX31Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup171List: MutableLiveData<MutableList<Iphone11ProX32RowModel>> =
      MutableLiveData(mutableListOf())
}
