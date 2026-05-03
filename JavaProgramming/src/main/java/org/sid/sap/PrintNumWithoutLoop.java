package org.sid.sap;

public interface PrintNumWithoutLoop {
    public static void main(String[] args) {
        print(0);
    }

    public static void print(int num){
        if (num>10){
           return;
        }
        System.out.println(num);
        print(num+1);
    }
}
