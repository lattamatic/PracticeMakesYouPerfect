package com.example.sandeep_chi.practicemakesyouperfect;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by sandeep_chi on 12/20/2016.
 */

public interface RetrofitArrayAPI {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
    */
    @GET("api/RetrofitAndroidArrayResponse")
    Call<List<Student>> getStudentDetails();

}