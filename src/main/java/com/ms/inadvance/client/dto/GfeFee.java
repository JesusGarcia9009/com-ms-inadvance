package com.ms.inadvance.client.dto;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GfeFee{
    public String gfeFeeType;
    public int gfeFeeIndex;
    public double otherAmount;
}
