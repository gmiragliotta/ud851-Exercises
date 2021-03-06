package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// Complete (1) Create a class called ReminderTasks
public class ReminderTasks {
// Complete (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    public static final String ACTION_INCREMENT_WATER_COUNT = "actionIncrementWaterCount";

// Complete (6) Create a public static void method called executeTask
    public static void executeTask(Context context, String action) {
// Complete (7) Add a Context called context and String parameter called action to the parameter list
// Complete (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount
        switch (action) {
            case ACTION_INCREMENT_WATER_COUNT:
                incrementWaterCount(context);
                break;
        }
    }

// Complete (3) Create a private static void method called incrementWaterCount
    private static void incrementWaterCount(Context context){
//  Complete (4) Add a Context called context to the argument list
//  Complete (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count
        PreferenceUtilities.incrementWaterCount(context);
    }
}
