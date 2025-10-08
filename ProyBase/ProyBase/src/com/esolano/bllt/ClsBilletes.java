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

    //----> getter billetes-----------**

    public Integer getB2000() {
        return b2000;
    }

    public Integer getB5000() {
        return b5000;
    }

    public Integer getB10000() {
        return b10000;
    }

    public Integer getB20000() {
        return b20000;
    }
    //----> getter fajos----------**

    public Integer getFajBillT2() {
        return fajBillT2;
    }

    public Integer getFajBillT5() {
        return fajBillT5;
    }

    public Integer getFajBillT10() {
        return fajBillT10;
    }

    public Integer getFajBillT20() {
        return fajBillT20;
    }
}
