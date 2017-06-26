package test1.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import net.pubnative.library.request.PubnativeRequest;
import net.pubnative.library.request.model.PubnativeAdModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements PubnativeRequest.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PubnativeRequest request = new PubnativeRequest();
        request.setParameter(PubnativeRequest.Parameters.APP_TOKEN, "a2098873f48142d78c3d48b5f2567089");

        request.setTestMode(true);
        request.setTimeout(30000);
        request.start(this,this);
    }


    @Override
    public void onPubnativeRequestSuccess(PubnativeRequest request, List<PubnativeAdModel> ads) {
 if (MainActivity.this!=null ){
     //TEst make here
     Log.d("TestionLib","Success");
 }
    }

    @Override
    public void onPubnativeRequestFailed(PubnativeRequest request, Exception ex) {
        if (MainActivity.this!=null ){
//test make here
            Log.d("TestionLib","failed");

        }
    }
}
