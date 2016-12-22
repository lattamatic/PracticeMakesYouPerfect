package com.example.sandeep_chi.practicemakesyouperfect;

import com.squareup.okhttp.ResponseBody;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by sandeep_chi on 12/20/2016.
 */

public interface RetrofitAPI {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
    */
    @GET("api/RetrofitAndroidArrayResponse")
    Call<List<Student>> getStudentDetailsArray();

    @GET("api/RetrofitAndroidObjectResponse")
    Call<Student> getStudentDetails();

    @GET("api/RetrofitAndroidImageResponse")
    Call<ResponseBody> getImageDetails();
}