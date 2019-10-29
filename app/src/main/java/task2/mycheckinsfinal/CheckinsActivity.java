package task2.mycheckinsfinal;

import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.util.UUID;


import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class CheckinsActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID = "task2.mycheckins.checkins_id";
    public static final int REQUEST_ERROR = 0;
    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CheckinsActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }




    @Override
    protected Fragment createFragment() {
        return new CheckinsFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();

        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int errorCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (errorCode != ConnectionResult.SUCCESS){
            Dialog errorDialog  = apiAvailability.getErrorDialog(this, errorCode,
                    REQUEST_ERROR,
                    new DialogInterface.OnCancelListener() {
                        @Override
                        public void onCancel(DialogInterface dialogInterface) {
                            finish();
                        }
                    });
            errorDialog.show();
        }
    }
}
