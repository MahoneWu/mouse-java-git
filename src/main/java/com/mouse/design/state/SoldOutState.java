package com.mouse.design.state;

/**
 * Created by wuhao1 on 2017/2/7.
 */
public class SoldOutState implements  State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经没有糖果了，不要丢币了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果没了");
    }

    @Override
    public void turnCrank() {
        System.out.println("别转了，转了也没糖了，嘿嘿");
    }

    @Override
    public void dispense() {
        System.out.println("没糖出了...");
    }
}
