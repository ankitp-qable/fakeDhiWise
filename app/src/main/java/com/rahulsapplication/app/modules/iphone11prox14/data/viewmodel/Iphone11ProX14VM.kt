package com.rahulsapplication.app.modules.iphone11prox14.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox14.`data`.model.Iphone11ProX14Model

public class Iphone11ProX14VM : ViewModel() {
  public val iphone11ProX14Model: MutableLiveData<Iphone11ProX14Model> =
      MutableLiveData(Iphone11ProX14Model())

  public var navArguments: Bundle? = null
}
