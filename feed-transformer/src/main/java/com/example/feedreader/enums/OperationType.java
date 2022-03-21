package com.example.feedreader.enums;

public enum OperationType {
    CREATE("create"), UPDATE("update");
    private final String operation;

    OperationType(String operation) {
        this.operation = operation;
    }
}
