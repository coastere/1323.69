package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num=9669;
        int i=1;
        int m=-1;

        int a=num;
        while (a /10 > 0) {
            a=a/10;
            i++;
        }

        int [] dd=new int[i];
        i=0;

        while (num % 10 > 0) {
            dd[i]=num-(num/10)*10;
            if(dd[i]==6) m=i;
            i++;
            num=num/10;
        }

        int result=0;
        for (int j = 0; j <dd.length ; j++) {
            if(m==j) result = result + 9*(int)Math.pow(10, j);
            else result = result + dd[j]*(int)Math.pow(10, j);
        }

        System.out.println(result);

    }
}
