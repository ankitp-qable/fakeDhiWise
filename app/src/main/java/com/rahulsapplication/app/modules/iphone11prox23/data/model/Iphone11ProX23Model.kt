package com.rahulsapplication.app.modules.iphone11prox23.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX23Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAResetCodeHa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_reset_code_ha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterCode: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtResetPassword1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)

)
