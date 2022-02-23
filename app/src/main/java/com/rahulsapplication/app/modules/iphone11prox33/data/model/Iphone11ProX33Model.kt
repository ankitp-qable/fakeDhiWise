package com.rahulsapplication.app.modules.iphone11prox33.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX33Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourOrders: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_orders)

)
