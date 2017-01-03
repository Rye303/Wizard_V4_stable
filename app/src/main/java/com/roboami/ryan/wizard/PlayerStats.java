package com.roboami.ryan.wizard;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ryan on 1/2/2017.
 */

public class PlayerStats implements Parcelable {

    public String Name;
    public String CharClass;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Name);
        dest.writeString(this.CharClass);
    }

    public PlayerStats() {
    }

    protected PlayerStats(Parcel in) {
        this.Name = in.readString();
        this.CharClass = in.readString();
    }

    public static final Parcelable.Creator<PlayerStats> CREATOR = new Parcelable.Creator<PlayerStats>() {
        @Override
        public PlayerStats createFromParcel(Parcel source) {
            return new PlayerStats(source);
        }

        @Override
        public PlayerStats[] newArray(int size) {
            return new PlayerStats[size];
        }
    };
}
