package com.rahulsapplication.app.modules.iphone11prox29.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX29Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCardDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExpDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_exp_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCVV: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_pay_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterCardDetaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etDDMMValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterCVVValue: String? = null
)
