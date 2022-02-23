package com.rahulsapplication.app.modules.iphone11prox25.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX25Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDeliveryTo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delivery_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLekkiPhase1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lekki_phase_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheMacdonalds: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_macdonalds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClassicCheesbu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_classic_cheesbu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2399: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt345: String? = MyApp.getInstance().resources.getString(R.string.lbl_345)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProcessToPaym: String? =
      MyApp.getInstance().resources.getString(R.string.msg_process_to_paym)

)
