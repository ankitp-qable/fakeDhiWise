package com.rahulsapplication.app.modules.iphone11prox17.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox17.`data`.model.Iphone11ProX17Model

public class Iphone11ProX17VM : ViewModel() {
  public val iphone11ProX17Model: MutableLiveData<Iphone11ProX17Model> =
      MutableLiveData(Iphone11ProX17Model())

  public var navArguments: Bundle? = null
}
