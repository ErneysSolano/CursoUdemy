package com.esolano.mnd;

public class ClsMnds {
    private Integer mnd50;
    private Integer mnd100;
    private Integer mnd200;
    private Integer mnd500;
    private Integer mnd1000;


    public ClsMnds(Integer mnd50, Integer mnd100, Integer mnd200, Integer mnd500, Integer mnd1000) {
        this.mnd50 = mnd50;
        this.mnd100 = mnd100;
        this.mnd200 = mnd200;
        this.mnd500 = mnd500;
        this.mnd1000 = mnd1000;
    }

    public ClsMnds() {
    }

    //---- getter ------


    public Integer getMnd50() {
        return mnd50;
    }

    public void setMnd50(Integer mnd50) {
        this.mnd50 = mnd50;
    }

    public Integer getMnd1000() {
        return mnd1000;
    }

    public void setMnd1000(Integer mnd1000) {
        this.mnd1000 = mnd1000;
    }

    public Integer getMnd500() {
        return mnd500;
    }

    public void setMnd500(Integer mnd500) {
        this.mnd500 = mnd500;
    }

    public Integer getMnd200() {
        return mnd200;
    }

    public void setMnd200(Integer mnd200) {
        this.mnd200 = mnd200;
    }

    public Integer getMnd100() {
        return mnd100;
    }

    public void setMnd100(Integer mnd100) {
        this.mnd100 = mnd100;
    }
}
