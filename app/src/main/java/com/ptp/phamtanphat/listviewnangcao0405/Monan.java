package com.ptp.phamtanphat.listviewnangcao0405;

/**
 * Created by KhoaPhamPC on 25/5/2018.
 */

public class Monan {
    private String Tenmonan;
    private int Giamonan;
    private int Hinhanh;

    public Monan(String tenmonan, int giamonan, int hinhanh) {
        Tenmonan = tenmonan;
        Giamonan = giamonan;
        Hinhanh = hinhanh;
    }

    public String getTenmonan() {
        return Tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        Tenmonan = tenmonan;
    }

    public int getGiamonan() {
        return Giamonan;
    }

    public void setGiamonan(int giamonan) {
        Giamonan = giamonan;
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }
}
