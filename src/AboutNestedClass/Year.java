package AboutNestedClass;

public class Year {
    Month month ;
    public Year(){
    }
    public Year(Month month){
        this.month = month;
    }
    public void WhatHappend(Month month){
        switch (month){
            case Jan:
                System.out.println("Will have snow");
                break;
            case Feb:
                System.out.println("will have snow too");
                break;
            case Mar:
                System.out.println("boy's birthday");
                break;
            case Apr:
                System.out.println("girl's birthday");
                break;
            case May:
                System.out.println("weather will worm");
                break;
            case Jun:
                System.out.println("hot weather");
                break;
            case Jul:
                System.out.println("very hot");
                break;
            case Aug:
                System.out.println("changed");
                break;
            case Sep:
                System.out.println("nice");
                break;
            case Oct:
                System.out.println("cold");
                break;
            case Nov:
                System.out.println("winter");
                break;
            case Dec:
                System.out.println("very cold");
                break;
                default:
                    System.out.println("no more month");
                    break;
        }
    }
}
