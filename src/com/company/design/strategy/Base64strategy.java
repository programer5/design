package com.company.design.strategy;

import java.util.Base64;

public class Base64strategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
