package com.rahulsapplication.app.modules.iphone11prox30.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX30Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourOrderHas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_order_has)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSitAndRelaxW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sit_and_relax_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoBackToYour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_go_back_to_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoBackToHome: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_go_back_to_home)

)
