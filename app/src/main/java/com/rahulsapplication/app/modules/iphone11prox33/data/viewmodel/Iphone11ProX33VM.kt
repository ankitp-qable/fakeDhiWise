package com.rahulsapplication.app.modules.iphone11prox33.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rahulsapplication.app.modules.iphone11prox33.`data`.model.Iphone11ProX33Model

public class Iphone11ProX33VM : ViewModel() {
  public val iphone11ProX33Model: MutableLiveData<Iphone11ProX33Model> =
      MutableLiveData(Iphone11ProX33Model())

  public var navArguments: Bundle? = null
}
