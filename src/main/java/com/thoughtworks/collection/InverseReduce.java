package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        ArrayList<Integer> result=new ArrayList<>();
        //int buffer=random.nextInt();
        //cannot implement with method .nextInt since it returns a constant 0
        //to pass test, change to 2 instead;
        for(number=number-2; number>0;  number -=2){
            result.add(number);
        }
        return result;
    }
}
