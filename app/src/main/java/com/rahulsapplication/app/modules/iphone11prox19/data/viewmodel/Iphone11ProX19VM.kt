package com.rahulsapplication.app.modules.iphone11prox19.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX19Model
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX20RowModel
import com.rahulsapplication.app.modules.iphone11prox19.`data`.model.Iphone11ProX21RowModel
import kotlin.collections.MutableList

public class Iphone11ProX19VM : ViewModel() {
  public val iphone11ProX19Model: MutableLiveData<Iphone11ProX19Model> =
      MutableLiveData(Iphone11ProX19Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup461List: MutableLiveData<MutableList<Iphone11ProX20RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup101List: MutableLiveData<MutableList<Iphone11ProX21RowModel>> =
      MutableLiveData(mutableListOf())
}
