package com.algorithm;


public class Answer {

        public static int stingy(int total_lambs){

            int henchmen = 1;
            int lastGivenAllowance = 1;
            int currentLambs = total_lambs - lastGivenAllowance;
            if( currentLambs < 1) {
                return henchmen;
            }

            int lambAllowance = 0;
            int currentAllowance = lambAllowance + 1;

            currentLambs -= currentAllowance;
            ++henchmen;
            while (currentLambs > 0) {
                lambAllowance = currentAllowance + lastGivenAllowance;
                currentLambs -= lambAllowance;
                if( currentLambs >= 0 ) {
                    ++henchmen;
                    lastGivenAllowance = currentAllowance;
                    currentAllowance = lambAllowance;
                }
            }
            return henchmen;


        }

        public static int generous(int total_lambs) {

            if( total_lambs < 1) {
                return 0;
            }

            int henchmen = 1;
            int maxAllowance = 1;
            int currentLambs = total_lambs - 1;

            while (currentLambs > 0) {
                maxAllowance *= 2;
                currentLambs -= maxAllowance;
                if( currentLambs >= 0 ) {
                    henchmen++;
                }
            }

            return henchmen;

        }


        public static int answer(int total_lambs) {
            // redoing taking the greed algorithm prospect
            return stingy(total_lambs) - generous(total_lambs);

        }

    public static void main(String[] args) {
        System.out.println(answer(10));
    }

}