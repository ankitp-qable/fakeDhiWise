package com.rahulsapplication.app.modules.iphone11prox19.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX21RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBigCheeseBurg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_big_cheese_burg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNo10OppLekki: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_10_opp_lekki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)

)
