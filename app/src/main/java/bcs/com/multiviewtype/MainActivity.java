package bcs.com.multiviewtype;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import bcs.com.multiviewtype.Inter.ApiInterface;
import bcs.com.multiviewtype.adapter.SessionAdapter;
import bcs.com.multiviewtype.model.Data;
import bcs.com.multiviewtype.model.Item;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    SessionAdapter sessionAdapter;
    List<Data> data;
    private static final int VERTICAL = 48;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        data = new ArrayList<>();
        Load_data();
        sessionAdapter = new SessionAdapter(this, data);
        mRecyclerView.setAdapter(sessionAdapter);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void Load_data() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://biggieconsulting.com").addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        final ProgressDialog progressDoalog;
        progressDoalog = new ProgressDialog(MainActivity.this);
        progressDoalog.setMax(100);
        progressDoalog.setMessage("Its loading....");
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDoalog.show();
        Call<Item> call = apiInterface.GetMainData();
        Log.d("tag1", "message");
        call.enqueue(new Callback<Item>() {
            @Override
            public void onResponse(@NonNull Call<Item> call, @NonNull Response<Item> response) {
                Log.d("tag2", response.message());
                if (response.isSuccessful()) {
                    Item sd = response.body();
                    Log.d("maindata", String.valueOf(sd));
                    progressDoalog.dismiss();
                    try {
                        List<Data> sampleData = fetchResults(response);
                        if (sampleData != null && sampleData.size() > 0) {
                            for (Data ghg : sampleData) {
                                data.add(ghg);
                            }
                            sessionAdapter.notifyDataSetChanged();
                        }
                        progressDoalog.dismiss();
                        System.out.println("ArraySize" + data.size());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<Item> call, Throwable t) {
                t.getStackTrace();
                progressDoalog.dismiss();
                Log.v("Item link", "No Response!");
            }
        });
    }

    /**
     * @param response extracts List<{@link Data>} from response
     * @return
     */
    private List<Data> fetchResults(Response<Item> response) {
        Item sample_data = response.body();
        sample_data.getData().getClass().getName();
        return sample_data.getData();
    }

}
