
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

  public RNUmcOpenModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "UmcOpen";
  }

  @ReactMethod
  public void login(String appId, String appKey, final Callback callback) {
    AuthnHelper.getInstance(getReactApplicationContext())
        .umcLoginByType(appId, appKey, AuthnHelper.UMC_LOGIN_DISPLAY, new TokenListener() {
          @Override
          public void onGetTokenComplete(JSONObject jsonObject) {
            callback.invoke(jsonObject.toString());
          }
        });
  }
}
