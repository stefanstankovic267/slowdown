package com.slowdown.radar;

import android.app.Application;

import com.slowdown.radar.LocalServices.MyLocalService;
import com.slowdown.radar.LocalServices.User;


/**
 * Created by Stefan on 11/4/2016.
 */

public class RadarApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        User user = new User("123", "Stefan", "Stankovic","stefan@stankovic@gmail.com", "Thu Dec 29 2011 20:14:56 GMT-0600 (CST)",
                "Thu Dec 29 2011 20:14:56 GMT-0600 (CST)", "06123456789", true, false, 5.0);

        if(!MyLocalService.getInstance().getLogin(this))
            MyLocalService.getInstance().setLogin(this, user, "token");

    }
}
