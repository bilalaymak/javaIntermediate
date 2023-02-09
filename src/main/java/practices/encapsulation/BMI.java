package practices.encapsulation;

import java.text.DecimalFormat;

public class BMI {
/*
BMI stands for Body Mass Index,
which is a numerical value of a person's weight in relation to their height.
It is widely used as a simple and quick method to assess
whether a person is underweight, normal weight, overweight, or obese.
BMI = weight (kg) ÷ height (m)^2
 */

    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    public void calculateBMI() {

        double bmi = weight / (height * height);
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        System.out.println("BMI: " + decimalFormat.format(bmi));

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
    }







}
