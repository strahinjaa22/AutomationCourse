package basics;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Arrayss {
    public static void main(String[] args) {
/*
        int [] lottoTicket = new int [6];
        lottoTicket[0]=4;
        lottoTicket[1]=60;
        lottoTicket[2]=62;
        lottoTicket[3]=600;
        lottoTicket[4]=16;
        lottoTicket[5]=32;


        System.out.println(Arrays.toString(lottoTicket));

        Arrays.sort(lottoTicket);
        for (int j : lottoTicket) {
            System.out.println(j);
        }*/
        int [] numbers= new int [] {20,400,10,4,60,120};

        for (int i=0; i<numbers.length;i++){
            if(numbers[i]>100){
                System.out.println(numbers[i] + " is bigger than 100");
            }else{
                System.out.println(numbers[i] + " is less than 100");
            }
        }

}}
