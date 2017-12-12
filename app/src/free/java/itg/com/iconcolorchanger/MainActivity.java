package itg.com.iconcolorchanger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

   /* TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        final TextView headerText = (TextView) findViewById(R.id.headerText);

        headerText.setText("Collapse");
        headerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layout.getVisibility() == View.VISIBLE) {
                    headerText.setText("Collapse");
                    layout.setVisibility(View.GONE);
                } else {
                    headerText.setText("Expand");
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });

        mText= (TextView) findViewById(R.id.text);
       // getAddressFromLocation(38.898748,-77.037684);
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }


    private void getAddressFromLocation(double latitude, double longitude) {

        Geocoder geocoder = new Geocoder(this, Locale.ENGLISH);

        try {
            List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);

            if (addresses.size() > 0) {
                Address fetchedAddress = addresses.get(0);
                StringBuilder strAddress = new StringBuilder();
                for (int i = 0; i < fetchedAddress.getMaxAddressLineIndex(); i++) {
               //     strAddress.append(fetchedAddress.getAddressLine(i)).append(" ");

                    strAddress.append(fetchedAddress.getLocality()).append("\n");

                }

                mText.setText(strAddress.toString());

            } else {
                mText.setText("Searching Current Address");
            }

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(MainActivity.this,"Could not get address..!",Toast.LENGTH_LONG).show();
        }
    }

    private String getAddress1(double latitude, double longitude) {
        StringBuilder result = new StringBuilder();
        try {
            Geocoder geocoder = new Geocoder(this, Locale.getDefault());
            List<Address> addresses = geocoder.getFromLocation(latitude, longitude, 1);
            if (addresses.size() > 0) {
                Address address = addresses.get(0);
                result.append(address.getLocality()).append("\n");
                result.append(address.getCountryName());
            }
        } catch (IOException e) {
            Log.e("tag", e.getMessage());
        }

        return result.toString();
    }


    @Override
    public void onResume() {
        super.onResume();
        mText= (TextView) findViewById(R.id.text);
        if(!EventBus.getDefault().hasSubscriberForEvent(MessageModelEvent.class)) {

            EventBus.getDefault().register(this);

        }
    }

    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    // This method will be called when a MessageEvent is posted (in the UI thread for Toast)
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageModelEvent(MessageModelEvent event) {
        mText.setText(event.message);
    }
*/


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

            TextView tv= (TextView) findViewById(R.id.text);
            tv.setText("Free");


    }
}
