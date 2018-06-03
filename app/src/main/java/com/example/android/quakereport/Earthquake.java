package com.example.android.quakereport;

/**
 * An {@link Earthquake} object contains information related to a single earthquake.
 */


public class Earthquake {
        /** Magnitude of the earthquake */
        private String mMagnitude;

        /** Location of the earthquake */
        private String mLocation;

        /** Time of the earthquake */
        private String mTimeInMilliseconds;

        public Earthquake (String magnitude, String location, String timeInMilliseconds) {
            mMagnitude = magnitude;
            mLocation = location;
            mTimeInMilliseconds = timeInMilliseconds;
        }

        public String getMagnitude (){
           return mMagnitude;
        }
        public String getLocation () {
            return mLocation;
        }
        public String getTimeInMilliseconds () {
            return mTimeInMilliseconds;
        }
}


