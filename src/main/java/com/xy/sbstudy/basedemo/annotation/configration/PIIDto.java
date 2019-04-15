package com.xy.sbstudy.basedemo.annotation.configration;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-01
 */
public class PIIDto {
    private Integer i ;

    private PIDto piDto;

    public PIIDto(PIDto piDto) {
        this.piDto = piDto;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public PIDto getPiDto() {
        return piDto;
    }

    public void setPiDto(PIDto piDto) {
        this.piDto = piDto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PIIDto{");
        sb.append("i=").append(i);
        sb.append(", piDto=").append(piDto);
        sb.append('}');
        return sb.toString();
    }
}
