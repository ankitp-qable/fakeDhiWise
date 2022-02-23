package com.rahulsapplication.app.modules.iphone11prox19.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX19Model(
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
  public var txtEnjoyDelicious: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_delicious)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPopularRestaur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_restaur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtViewAll29: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_all_29)

)
