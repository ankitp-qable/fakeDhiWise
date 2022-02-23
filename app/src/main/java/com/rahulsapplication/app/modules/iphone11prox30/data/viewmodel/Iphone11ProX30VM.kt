package com.rahulsapplication.app.modules.iphone11prox30.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox30.`data`.model.Iphone11ProX30Model

public class Iphone11ProX30VM : ViewModel() {
  public val iphone11ProX30Model: MutableLiveData<Iphone11ProX30Model> =
      MutableLiveData(Iphone11ProX30Model())

  public var navArguments: Bundle? = null
}
