package com.bridgelabz;

public class FlipCoin {
    public static void main(String[] args) {
        float CoinFlip=10;
        int TailCount = 0;
        int HeadCount = 0;
        for (int i=0; i < CoinFlip; i++) {
            if (Math.random() < 0.5) {
                TailCount++;
                System.out.println("Tails");
            } else {
                HeadCount++;
                System.out.println("Heads");
            }
        }
        float TailPercentage = ((TailCount/ CoinFlip) * 100);
        System.out.println("percentage for tail is:" +TailPercentage + "%");
        float HeadPercentage = ((HeadCount/ CoinFlip) * 100);
        System.out.println("percentage for head is:" +HeadPercentage + "%");
    }
}
