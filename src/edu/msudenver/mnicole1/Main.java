package edu.msudenver.mnicole1;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Sums for " + i);
            sum(i, new LinkedList<>());
        }
    }

    private static boolean sum (int goal, List<Integer> current) {
        int sumStart = 1;
        int currentSum = 0;
        if (!current.isEmpty()) {
            sumStart = current.get(current.size() - 1);
            for (Integer i : current) {
                currentSum += i;
            }
        }
        if (currentSum == goal) {
            StringJoiner sj = new StringJoiner("+");
            for (Integer i : current) {
                sj.add(i.toString());
            }
            System.out.println(sj.toString());
            return true;
        }
        return false;
    }
}
