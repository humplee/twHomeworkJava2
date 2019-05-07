package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<array.size();i++){
            if(array.get(i)%2==0)result.add(array.get(i));
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<array.size();i++){
            if(array.get(i)%3==0)result.add(array.get(i));
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        ArrayList<Integer> listTemp = new ArrayList<>();
        ArrayList<Integer> firstTemp = new ArrayList<>(firstList);
        ArrayList<Integer> secondTemp = new ArrayList<>(secondList);

        for(int i=0;i<firstTemp.size();i++){
            if(secondTemp.contains(firstTemp.get(i))){
                listTemp.add(firstTemp.get(i));
            }
        }
        return listTemp;
    }

    public List<Integer> getDifferentElements() {
        List listTemp = new ArrayList();
        for(int i=0;i<array.size();i++){
            if(!listTemp.contains(array.get(i))){
                listTemp.add(array.get(i));
            }
        }
        return listTemp;
    }
}