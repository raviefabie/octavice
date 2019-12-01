package com.example.octavice.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:keyAAAAOrSgnZo:APA91bHt3GbL6ZqBtD6Q8XWTfFMgng86FpaOFE-lfWGBVF8TmIRYwWAspBUf-p1hS0BxWUAooYab0ULwkfqSCgrQRgS-wF2jAkkB6T5lLuGhtPllr1FEXt_WmPpZjN2U0RTyExLXBLTh"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
