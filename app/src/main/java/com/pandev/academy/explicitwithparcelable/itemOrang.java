package com.pandev.academy.explicitwithparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class itemOrang implements Parcelable {
    private String nama;
    private String alamat;
    private String email;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //parcelable

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
        dest.writeString(this.email);
    }

    public itemOrang() {
    }

    protected itemOrang(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
        this.email = in.readString();
    }

    public static final Parcelable.Creator<itemOrang> CREATOR = new Parcelable.Creator<itemOrang>() {
        @Override
        public itemOrang createFromParcel(Parcel source) {
            return new itemOrang(source);
        }

        @Override
        public itemOrang[] newArray(int size) {
            return new itemOrang[size];
        }
    };
}
