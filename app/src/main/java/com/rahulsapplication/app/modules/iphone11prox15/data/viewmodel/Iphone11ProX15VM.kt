package com.rahulsapplication.app.modules.iphone11prox15.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox15.`data`.model.Iphone11ProX15Model

public class Iphone11ProX15VM : ViewModel() {
  public val iphone11ProX15Model: MutableLiveData<Iphone11ProX15Model> =
      MutableLiveData(Iphone11ProX15Model())

  public var navArguments: Bundle? = null
}
