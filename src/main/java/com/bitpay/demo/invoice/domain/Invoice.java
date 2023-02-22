/*
 * Copyright 2023 BitPay.
 * All rights reserved.
 */

package com.bitpay.demo.invoice.domain;

import java.time.LocalDateTime;
import lombok.NonNull;

public class Invoice {

    private Long id;
    private Fields fields;
    private Price price;
    private Currency currency;
    private BitPayId bitPayId;
    private Status status;
    private LocalDateTime createdDate;
    private BitPayOrderId bitPayOrderId;

    Invoice() {
    }

    public Invoice(
        @NonNull final Fields fields,
        @NonNull final Price price,
        @NonNull final Currency currency,
        @NonNull final BitPayId bitPayId,
        @NonNull final Status status,
        @NonNull final LocalDateTime createdDate,
        @NonNull final BitPayOrderId bitPayOrderId
    ) {
        this.fields = fields;
        this.price = price;
        this.currency = currency;
        this.bitPayId = bitPayId;
        this.status = status;
        this.createdDate = createdDate;
        this.bitPayOrderId = bitPayOrderId;
    }

    public @NonNull Long getId() {
        return this.id;
    }

    public @NonNull Fields getFields() {
        return this.fields;
    }

    public @NonNull Price getPrice() {
        return this.price;
    }

    public @NonNull Currency getCurrency() {
        return this.currency;
    }

    public @NonNull Status getStatus() {
        return this.status;
    }

    public @NonNull BitPayId getBitPayId() {
        return this.bitPayId;
    }

    public @NonNull LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public @NonNull BitPayOrderId getBitPayOrderId() {
        return this.bitPayOrderId;
    }

}
