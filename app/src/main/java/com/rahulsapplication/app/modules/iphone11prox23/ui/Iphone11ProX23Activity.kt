package com.rahulsapplication.app.modules.iphone11prox23.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.rahulsapplication.app.R
import com.rahulsapplication.app.appcomponents.base.BaseActivity
import com.rahulsapplication.app.databinding.ActivityIphone11ProX23Binding
import com.rahulsapplication.app.modules.iphone11prox23.`data`.viewmodel.Iphone11ProX23VM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.String
import kotlin.Unit

public class Iphone11ProX23Activity :
    BaseActivity<ActivityIphone11ProX23Binding>(R.layout.activity_iphone_11_pro_x_23) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null

  public val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
                         ActivityResultCallback{ 
                         val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE) 
                         getOtpFromMessage(message!!) 
                         })

  private val viewModel: Iphone11ProX23VM by viewModels<Iphone11ProX23VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    startSmartUserConsent()
    binding.iphone11ProX23VM = viewModel
  }

  public override fun onStop(): Unit {
    super.onStop()
    unregisterReceiver(otpViewOtpviewBroadcastReceiver)
  }

  public override fun onStart(): Unit {
    super.onStart()
    registerBroadcastReceiver()
  }

  public override fun setUpClicks(): Unit {
  }

  private fun startSmartUserConsent(): Unit {
    val client = SmsRetriever.getClient(this)
    client.startSmsUserConsent(null)
  }

  private fun registerBroadcastReceiver(): Unit {
    otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
    otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
    object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
      override fun onSuccess(intent: Intent?) {
        getActivityResult.launch(intent)
      }
      override fun onFailure() {

      }
    }
    val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
    registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
  }

  private fun getOtpFromMessage(message: String): Unit {
    val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
    val matcher: Matcher = otpPattern.matcher(message)
    if (matcher.find()) {
      binding.otpViewOtpview?.setText(matcher.group(0))
    }
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X23ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX23Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
