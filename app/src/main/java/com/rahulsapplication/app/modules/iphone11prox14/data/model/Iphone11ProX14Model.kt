package com.rahulsapplication.app.modules.iphone11prox14.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX14Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrderFromYour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_from_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateAnAccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)

)
