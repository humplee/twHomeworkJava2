package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        ArrayList<Integer> result=new ArrayList<>();
        if(left>right){
            for(int i=left;i>=right;i--){
                result.add(i);
            }
        }
        else{
            for(int i=left;i<=right;i++){
                result.add(i);
            }

        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        ArrayList<Integer> result=new ArrayList<>();
        if(left>right){
            for(int i=left;i>=right;i--){
                if(i%2==0)result.add(i);
            }
        }
        else{
            for(int i=left;i<=right;i++){
                if(i%2==0)result.add(i);
            }

        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                result.add(array[i]);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList <Integer>result=new ArrayList<>();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int pointer1=0,pointer2=0;
        while(pointer1<firstArray.length&&pointer2<secondArray.length){
            if (firstArray[pointer1]==secondArray[pointer2]){
                result.add(firstArray[pointer1]);
                pointer1+=1;
                pointer2+=1;
            }
            else if(firstArray[pointer1]<=secondArray[pointer2]){
                pointer1+=1;
            }else pointer2+=1;

        }
        return result;

    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        //int pointer1=0,pointer2=0;
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(firstArray));
        for (Integer integer : secondArray) {
            if (!result.contains(integer)) {
                result.add(integer);
            }
        }


        return result;
    }
}
