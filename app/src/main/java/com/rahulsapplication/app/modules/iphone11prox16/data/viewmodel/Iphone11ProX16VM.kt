package com.rahulsapplication.app.modules.iphone11prox16.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox16.`data`.model.Iphone11ProX16Model

public class Iphone11ProX16VM : ViewModel() {
  public val iphone11ProX16Model: MutableLiveData<Iphone11ProX16Model> =
      MutableLiveData(Iphone11ProX16Model())

  public var navArguments: Bundle? = null
}
