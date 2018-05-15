package bcs.com.multiviewtype.Inter;

import bcs.com.multiviewtype.model.Item;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/meayohub/api/v1/categories")
    Call<Item> GetMainData();

}