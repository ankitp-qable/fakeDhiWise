package com.rahulsapplication.app.modules.iphone11prox22.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox22.`data`.model.Iphone11ProX22Model
import com.rahulsapplication.app.modules.iphone11prox22.`data`.model.Iphone11ProX24RowModel
import kotlin.collections.MutableList

public class Iphone11ProX22VM : ViewModel() {
  public val iphone11ProX22Model: MutableLiveData<Iphone11ProX22Model> =
      MutableLiveData(Iphone11ProX22Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup115List: MutableLiveData<MutableList<Iphone11ProX24RowModel>> =
      MutableLiveData(mutableListOf())
}
