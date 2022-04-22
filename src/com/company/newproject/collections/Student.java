package com.company.newproject.collections;



import java.util.List;

public class Student {


    private String name;
    private int age;
    private List<Score> scores;

    public Student(String name, int age, List<Score> scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

        public int getAverageScore() {
        int sum = 0;
        for(Score score : scores) {
            sum += score.getScoreValue();
        }

        return sum / scores.size();
    }


}
