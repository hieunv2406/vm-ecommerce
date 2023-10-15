package com.vm.dto;

import java.util.List;

import com.vm.entities.InvoiceItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceRequest extends BaseDto {
    private Long invoiceId;
    private Double totalAmount;
    private Boolean status;
    private String note;
    private List<InvoiceItem> invoiceItems;
}
