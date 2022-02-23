package com.rahulsapplication.app.modules.iphone11prox27.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX27Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMarvisIghedosa: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_marvis_ighedosa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDosamarvisgmai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dosamarvis_gmai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)

)
