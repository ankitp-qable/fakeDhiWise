package com.rahulsapplication.app.modules.iphone11prox29.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox29.`data`.model.Iphone11ProX29Model

public class Iphone11ProX29VM : ViewModel() {
  public val iphone11ProX29Model: MutableLiveData<Iphone11ProX29Model> =
      MutableLiveData(Iphone11ProX29Model())

  public var navArguments: Bundle? = null
}
