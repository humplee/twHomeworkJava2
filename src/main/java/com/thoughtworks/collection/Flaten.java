package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                result.add(array[i][j]);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                result.add(array[i][j]);
            }
        }
        Filter filter=new Filter(result);
        return filter.getDifferentElements();
    }
}
