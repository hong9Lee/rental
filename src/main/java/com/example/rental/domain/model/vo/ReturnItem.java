package com.example.rental.domain.model.vo;

import com.example.rental.domain.model.RentalItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnItem {

    private RentalItem rentalItem;
    private LocalDate returnDate;

    public static ReturnItem createReturnItem(RentalItem rentalItem) {
        return new ReturnItem(rentalItem, LocalDate.now());
    }

}
