package com.mouse.design.state;

import java.util.Random;

/**
 * Created by wuhao1 on 2017/2/7.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("你不能重复投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退还投入的硬币！！！");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turn...");
        int win = new Random().nextInt(10);
        System.out.println("win--->"+win);
        if( (0 == win) && gumballMachine.getCount() > 0  ){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed...");
    }
}
