package com.rahulsapplication.app.modules.iphone11prox18.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox18.`data`.model.Iphone11ProX18Model

public class Iphone11ProX18VM : ViewModel() {
  public val iphone11ProX18Model: MutableLiveData<Iphone11ProX18Model> =
      MutableLiveData(Iphone11ProX18Model())

  public var navArguments: Bundle? = null
}
