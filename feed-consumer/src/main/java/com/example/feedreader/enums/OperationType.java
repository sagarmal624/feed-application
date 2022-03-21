package com.example.feedreader.enums;

public enum OperationType {
    CREATE("create"), UPDATE("update");
    private final String operation;

    OperationType(String operation) {
        this.operation = operation;
    }
    public static OperationType getOperationType(String operation) {
        for (OperationType operationType : OperationType.values()) {
            if (operationType.operation.equals(operation))
                return operationType;
        }
        return null;
    }
}
