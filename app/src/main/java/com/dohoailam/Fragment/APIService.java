package com.dohoailam.Fragment;

import com.dohoailam.Notifications.MyResponse;
import com.dohoailam.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA_Jv-chI:APA91bE_8LBcFn_wvEcDJTl0r5v364g2yPP2CWvKUqG61xBSHKCMulpbuViXOsOqjCbTwWju8BWmNjI0QrRbEqSKwmM3Lt90uIyA19N6uRC34p381l-RYRlX54RABEtKJssB_nQugn8X"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
