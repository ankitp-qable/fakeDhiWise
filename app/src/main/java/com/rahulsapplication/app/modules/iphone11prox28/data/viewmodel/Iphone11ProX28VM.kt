package com.rahulsapplication.app.modules.iphone11prox28.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox28.`data`.model.Iphone11ProX28Model

public class Iphone11ProX28VM : ViewModel() {
  public val iphone11ProX28Model: MutableLiveData<Iphone11ProX28Model> =
      MutableLiveData(Iphone11ProX28Model())

  public var navArguments: Bundle? = null
}
