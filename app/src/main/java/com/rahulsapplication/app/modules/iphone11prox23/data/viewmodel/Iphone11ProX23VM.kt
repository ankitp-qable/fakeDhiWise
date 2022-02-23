package com.rahulsapplication.app.modules.iphone11prox23.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox23.`data`.model.Iphone11ProX23Model

public class Iphone11ProX23VM : ViewModel() {
  public val iphone11ProX23Model: MutableLiveData<Iphone11ProX23Model> =
      MutableLiveData(Iphone11ProX23Model())

  public var navArguments: Bundle? = null
}
