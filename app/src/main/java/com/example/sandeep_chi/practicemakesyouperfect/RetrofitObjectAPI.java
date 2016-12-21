package com.example.sandeep_chi.practicemakesyouperfect;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by sandeep_chi on 12/20/2016.
 */

public interface RetrofitObjectAPI {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
    */
    @GET("api/RetrofitAndroidObjectResponse")
    Call<Student> getStudentDetails();
}