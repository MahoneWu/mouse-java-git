package com.mouse.design.state;

/**
 * Created by wuhao on 2017/2/7.
 */
public class WinnerState implements  State {


    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("奖励的，别丢钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("奖励的也没钱退...");
    }

    @Override
    public void turnCrank() {
        System.out.println("转了也没有，这是赏你的糖...");
    }

    @Override
    public void dispense() {
        System.out.println("你真幸运,多奖励你一颗糖...");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("深表歉意,只剩下最后一个糖了...");
        } else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0 ){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("没糖了...");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }

        }
    }
}
