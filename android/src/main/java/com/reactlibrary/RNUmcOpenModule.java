
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import cm.pass.sdk.UMCSDK;
import cm.pass.sdk.auth.AuthnHelper;
import cm.pass.sdk.auth.TokenListener;
import org.json.JSONObject;

public class RNUmcOpenModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  private AuthnHelper authHelper;

  public RNUmcOpenModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;

    authHelper = AuthHelper.getInstance(reactContext);
  }

  @Override
  public String getName() {
    return "RNUmcOpen";
  }

  @ReactMethod
  public void login(String appId, String appKey, Callback callback) {
    TokenListener listener = new TokenListener() {
      @Override
      public void onGetTokenComplete(JSONObject json) {
        callback.invoke(json.toString());
      }
    };
    authnHelper.umcLoginByType(
        appId, appKey,
        AuthnHelper.UMC_LOGIN_DISPLAY, listener);
  }
}
