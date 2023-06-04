package com.sangamprashant.truevpn;

import com.sangamprashant.truevpn.R;

public class Utils {

    // Convert resource ID to image URI string
    public static String getImage(int resourceId) {
        return "android.resource://" + com.sangamprashant.truevpn.R.class.getPackage().getName() + "/" + resourceId;
    }
}

