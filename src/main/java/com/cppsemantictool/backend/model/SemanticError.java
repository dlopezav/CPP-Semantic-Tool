package com.cppsemantictool.backend.model;

public class SemanticError {
    private int row;
    private int col;
    private ErrorType type;
    private String message;

    public SemanticError(int row, int col, ErrorType type, String message) {
        this.row = row;
        this.col = col;
        this.type = type;
        this.message = message;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public ErrorType getType() {
        return this.type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public enum ErrorType{
        OVERFLOW,
        INFINITY_LOOP,
        CORE_DUMP,
        CASTING,
        PRECISION,
        UNUSED_LOOP,
        INPUT_OUTPUT
    }
}
