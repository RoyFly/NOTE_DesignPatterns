package com.vectorx.pattern.t14_visitor;

/**
 * 具体访问者
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男生给了通过");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女生给了通过");
    }
}
