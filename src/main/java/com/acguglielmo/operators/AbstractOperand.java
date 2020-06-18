package com.acguglielmo.operators;

public abstract class AbstractOperand<T, Y> implements Operand<T, Y> {

    @Override
    public String toString() {

        return "( " + evaluate()  + " )";

    }

}
