package com.xy.sbstudy.basedemo.annotation.configration;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-01
 */

public class PIDto {
    private Integer i;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
    public void a (){
        this.setI(1);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PIDto{");
        sb.append("i=").append(i);
        sb.append('}');
        return sb.toString();
    }
}
