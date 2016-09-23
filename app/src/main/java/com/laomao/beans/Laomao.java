package com.laomao.beans;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by laomao on 16/9/23.
 */

public class Laomao implements Parcelable {
    private String id;
    private String name;
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.age);
    }

    public Laomao() {
    }

    protected Laomao(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.age = in.readString();
    }

    public static final Parcelable.Creator<Laomao> CREATOR = new Parcelable.Creator<Laomao>() {
        @Override
        public Laomao createFromParcel(Parcel source) {
            return new Laomao(source);
        }

        @Override
        public Laomao[] newArray(int size) {
            return new Laomao[size];
        }
    };

    @Override
    public String toString() {
        return this.getName()+":"+this.getAge();
    }
}
