package com.mouse.design.state;

/**
 * Created by wuhao on 2017/2/7.
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了25分钱");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没有投钱不能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("你没有投钱不能要糖果");
    }

    @Override
    public void dispense() {
        System.out.println("没有投钱，不能发放糖果");
    }
}
