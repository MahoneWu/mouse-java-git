package com.mouse.design.state;

/**
 * Created by wuhao1 on 2017/2/7.
 */
public class SoldState implements  State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("正在出糖。。。");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("稍等,已经转动！！！");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动多次也无效...");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0 ){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("糖果卖完了...");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
