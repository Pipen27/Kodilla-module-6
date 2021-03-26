package com.kodilla.patterns.builder.bigmac;

public enum Bun {
    WITH_SESAME("with sesame"),
    WITHOUT_SESAME("without sesame");

    private String kindOfBun;

    Bun(String kindOfBun) {
        this.kindOfBun = kindOfBun;
    }

    public String getKindOfBun(Bun kind) {
        return kindOfBun;
    }
}
