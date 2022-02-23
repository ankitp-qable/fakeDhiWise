package com.rahulsapplication.app.modules.iphone11prox17.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX17Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginToYourA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoodToSeeYou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_good_to_see_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmailAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
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
  public var txtLoginToMyAcc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_my_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etSigninWithGoValue: String? = null
)
