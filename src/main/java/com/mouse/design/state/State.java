package com.mouse.design.state;

/**
 * Created by wuhao on 2017/2/7.
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
