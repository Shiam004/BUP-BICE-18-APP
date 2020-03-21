package com.shabiruzzaman_shiam.bice_18;

public class DataSetFire {
    String Date;
    String Title;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public DataSetFire() {
    }

    public DataSetFire(String date, String title) {
        Date = date;
        Title = title;
    }
}
