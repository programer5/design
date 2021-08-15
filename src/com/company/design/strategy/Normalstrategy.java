package com.company.design.strategy;

public class Normalstrategy implements EncodingStrategy {
    @Override
    public String encode(String text) {
        return text;
    }
}
