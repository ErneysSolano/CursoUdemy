package com.esolano.bllt;

public class ClsBilletes {
    private Integer b2000  = 2000;
    private Integer b5000  = 5000;
    private Integer b10000 = 10000;
    private Integer b20000 = 20000;


    private Integer fajBillT2  = b2000 * 100;
    private Integer fajBillT5  = b5000 * 100;
    private Integer fajBillT10 = b10000 * 100;
    private Integer fajBillT20 = b20000 * 100;

    //----> Constructor----


    public ClsBilletes() {
    }

    //----> getter y setter-----------**
    public Integer getB2000() {
        return b2000;
    }

    public void setB2000(Integer b2000) {
        this.b2000 = b2000;
    }

    public Integer getB5000() {
        return b5000;
    }

    public void setB5000(Integer b5000) {
        this.b5000 = b5000;
    }

    public Integer getB20000() {
        return b20000;
    }

    public void setB20000(Integer b20000) {
        this.b20000 = b20000;
    }

    public Integer getB10000() {
        return b10000;
    }

    public void setB10000(Integer b10000) {
        this.b10000 = b10000;
    }

    public Integer getFajBillT2() {
        return fajBillT2;
    }

    public void setFajBillT2(Integer fajBillT2) {
        this.fajBillT2 = fajBillT2;
    }

    public Integer getFajBillT5() {
        return fajBillT5;
    }

    public void setFajBillT5(Integer fajBillT5) {
        this.fajBillT5 = fajBillT5;
    }

    public Integer getFajBillT10() {
        return fajBillT10;
    }

    public void setFajBillT10(Integer fajBillT10) {
        this.fajBillT10 = fajBillT10;
    }

    public Integer getFajBillT20() {
        return fajBillT20;
    }

    public void setFajBillT20(Integer fajBillT20) {
        this.fajBillT20 = fajBillT20;
    }
}
