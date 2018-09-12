package com.rabbit.tutorial.operator;

public class BitOperator {
    public static void main(String[] args) {

        // 1： ~ 按位取反运算
        // byte 在内存中占用8个字节
        byte number = 42;//0010 1010
        byte inverseNumber = (byte) ~number;//1101 0101  ->按位取反 0010 1010 ->再加1 ->0010 1011->-43
        System.out.println("inverseNumber:"+inverseNumber);


        // 2: & 按位与运算

        byte numberA = 42;//0010 1010
        byte numberB = 15;//0000 1111
        //                 &0000 1010 -> 10
        byte numberC = (byte) (numberA & numberB);
        System.out.println("numberC:"+numberC);

        //3:按位或
        //      0010 1010
        //      0000 1111
        //    & 0010 1111 -> 47
        byte numberD = (byte) (numberA | numberB);
        System.out.println("numberD:"+numberD);

        //4:按位异或
        //      0010 1010
        //      0000 1111
        //    ^ 0010 0101 ->37
        byte numberE = (byte) (numberA ^ numberB);
        System.out.println("numberE:"+numberE);

        //5：左移

    }
}
