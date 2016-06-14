package tntstudios.com.br.firebasecloudmessaging.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * @author ton1n8o - antoniocarlos.dev@gmail.com on 6/13/16.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static String TAG = "Registration";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
        System.out.println("Registration.onTokenRefresh TOKEN: " + refreshedToken );
    }
}
