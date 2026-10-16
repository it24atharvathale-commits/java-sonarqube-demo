
package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public String getGrade(int marks) {
        if (marks >= 75) {
            return "Distinction";
        } else if (marks >= 60) {
            return "First Class";
        } else if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Java SonarQube Demo");
        System.out.println("Sum: " + app.add(10, 20));
        System.out.println("Grade: " + app.getGrade(82));
    }
}
