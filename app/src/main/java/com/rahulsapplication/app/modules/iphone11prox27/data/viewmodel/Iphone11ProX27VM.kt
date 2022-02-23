package com.rahulsapplication.app.modules.iphone11prox27.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox27.`data`.model.Iphone11ProX27Model

public class Iphone11ProX27VM : ViewModel() {
  public val iphone11ProX27Model: MutableLiveData<Iphone11ProX27Model> =
      MutableLiveData(Iphone11ProX27Model())

  public var navArguments: Bundle? = null
}
