package com.rahulsapplication.app.modules.iphone11prox13.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox13.`data`.model.Iphone11ProX13Model

public class Iphone11ProX13VM : ViewModel() {
  public val iphone11ProX13Model: MutableLiveData<Iphone11ProX13Model> =
      MutableLiveData(Iphone11ProX13Model())

  public var navArguments: Bundle? = null
}
