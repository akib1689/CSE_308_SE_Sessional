package com.company.main;

public class GradeCalculator {
    public static char calculateGrade(double score, int credit){
        double roundedScore = roundScore(score);
        if (credit != 3 && credit != 4) {
            throw new IllegalArgumentException("Credit must be 3 or 4");
        }
        double highestScore = credit * 100;
        double lowestScore = 0;
        if (score > highestScore || score < lowestScore) {
            throw new IllegalArgumentException("Score must be between 0 and " + highestScore);
        }
        double a = highestScore * 0.8;
        double b = highestScore * 0.7;
        double c = highestScore * 0.6;

        if (roundedScore < c){
            return 'F';
        } else if (roundedScore < b){
            return 'C';
        } else if (roundedScore < a){
            return 'B';
        } else {
            return 'A';
        }
    }

    public static double roundScore(double score) {
        return Math.round(score);
    }
}
