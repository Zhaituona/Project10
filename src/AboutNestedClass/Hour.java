package AboutNestedClass;

public class Hour {
    Minute min ;
    public Hour(){
    }
    public Hour(Minute min){
        this.min = min;
    }
    public void WhatIdo(Minute min){
        switch (min){
            case MINUTETen:
                System.out.println("10");
                break;
            case MINUTEtwenty:
                System.out.println("20");
                break;
            case MINUTEthirty:
                System.out.println("30");
                break;
            case MINUTEfifty:
                System.out.println("50");
                break;
            case MINUTEforty:
                System.out.println("40");
                break;
            case MINUTEsixty:
                System.out.println("60");
                break;
                default:
                    System.out.println("no value");
        }
    }
}
