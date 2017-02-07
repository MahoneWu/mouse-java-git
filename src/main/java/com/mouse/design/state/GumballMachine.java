package com.mouse.design.state;

/**
 * Created by wuhao on 2017/2/7.
 */
public class GumballMachine {


    State hasQuarterState;

    State noQuarterState;

    State soldOutState;

    State soldState;

    State winnerState;

    State state = soldOutState;

    int count = 0;


    public GumballMachine(int numberCount) {
        this.count = numberCount;
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (numberCount > 0) {
            state = noQuarterState;
        }
    }

    /**
     * 投币
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退还硬币
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 转动转轴
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    /**
     * 释放糖果并且糖果数减1;
     */
    void releaseBall() {
        System.out.println("a gumball comes rolling  out the slot");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}