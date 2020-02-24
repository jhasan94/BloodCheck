package com.example.bloodcheck;

import java.util.Observable;

import javax.xml.transform.Result;

import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitClient {
    @Multipart
    @POST("predict_multiple")
    //Observable<ResponseBody> UploadImage(@Part("file")RequestBody image);
    @FormUrlEncoded
    Call<ResultClass> UploadImage(@Field("file")String image);

    /*@Multipart
    @POST("user/updateprofile")
    Observable<Response> updateProfile(@Part MultipartBody.Part image);

    //pass it like this
            File file = new File("/storage/emulated/0/Download/Corrections 6.jpg");
            RequestBody requestFile =
            RequestBody.create(MediaType.parse("multipart/form-data"), file);

    // MultipartBody.Part is used to send also the actual file name
            MultipartBody.Part body =
            MultipartBody.Part.createFormData("image", file.getName(), requestFile);

    // add another part within the multipart request
            RequestBody fullName =
            RequestBody.create(MediaType.parse("multipart/form-data"), "Your Name");

            service.updateProfile(id, fullName, body, other);*/

}
