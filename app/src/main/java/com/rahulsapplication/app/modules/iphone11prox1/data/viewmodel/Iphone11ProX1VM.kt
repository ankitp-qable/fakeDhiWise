package com.rahulsapplication.app.modules.iphone11prox1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox1.`data`.model.Iphone11ProX1Model

public class Iphone11ProX1VM : ViewModel() {
  public val iphone11ProX1Model: MutableLiveData<Iphone11ProX1Model> =
      MutableLiveData(Iphone11ProX1Model())

  public var navArguments: Bundle? = null
}
