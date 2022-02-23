package com.rahulsapplication.app.modules.iphone11prox16.`data`.model

import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX16Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
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
  public var txtWelcomeFriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_friend)
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
  public var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateAnAccou1: String? =
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
  public var etConfirmPassworValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etSigninWithGoValue: String? = null
)
