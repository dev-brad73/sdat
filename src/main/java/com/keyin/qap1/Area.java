package com.keyin.qap1;

public class Area {

    public int threeSided(int base, int height){
        return((base * height) / 2);
    }

    public boolean fourSided(int length, int width, int ans){
        boolean answer = false;
        int i = length * width;

        if (ans == i){
            answer = true;
        }
        return answer;
    }

    public double circle(double radius){

        return 3.14 * radius * radius;
    }
}
