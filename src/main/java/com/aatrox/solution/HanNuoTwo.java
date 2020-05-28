package com.aatrox.solution;

/**
 * @author aatrox
 * @desc 汉诺塔的算法
 * @date 2020/5/28
 */
public class HanNuoTwo {
    public static void main(String[] args) {
        move(3,"A","B","C");
    }

    public static void move(int num,String a,String b,String c){
        if(num==1){
            System.out.println("将"+num+"从"+a+"移动到"+c);
            return;
        }
        move(num-1,a,c,b);
        System.out.println("将"+num+"从"+a+"移动到"+c);
        move(num-1,b,a,c);

    }
}
