/*
 * Copyright 2023 BitPay.
 * All rights reserved.
 */

package com.bitpay.demo.shared.infrastructure;

import com.bitpay.demo.DependencyInjection;
import com.bitpay.demo.shared.ObjectToStringConverter;
import com.google.gson.Gson;
import lombok.NonNull;

@DependencyInjection
class ObjectToJsonConverter implements ObjectToStringConverter {

    private final Gson gson = new Gson();

    @Override
    public @NonNull String execute(@NonNull final Object object) {
        return this.gson.toJson(object);
    }
}
