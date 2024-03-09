package com.example.rental.domain.model;

import com.example.rental.domain.model.vo.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalCard {

    private RentalCardNo rentalCardNo;
    private IDName member;
    private RentalStatus rentStatus;
    private LateFee lateFee;
    private List<RentalItem> rentalItemList = new ArrayList<RentalItem>();
    private List<ReturnItem> returnItemList = new ArrayList<ReturnItem>();


}
