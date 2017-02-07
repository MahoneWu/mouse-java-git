package com.mouse.design.state;

/**
 * Created by wuhao1 on 2017/2/7.
 */
public class Client {

    public static void main(String[] args) {
        GumballMachine  gumballMachine = new GumballMachine(5);

        System.out.println("---------1--------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("--------2-----");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("------3-------");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("------4-------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("------5-------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();


        System.out.println("------6-------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }

}
