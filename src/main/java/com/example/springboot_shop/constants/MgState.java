package com.example.springboot_shop.constants;

public enum  MgState {

    TRUE((byte)1),
    FLASE((byte)0);

    private byte value;

    MgState(Byte value) {
        this.value = value;
    }

    public Byte getValue() {
        return value;
    }
}
