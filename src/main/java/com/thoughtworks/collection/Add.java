package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(rightBorder<leftBorder){
            int buffer=leftBorder;
            leftBorder=rightBorder;
            rightBorder=buffer;
        }
        //switch if invalid input occurs
        if(rightBorder%2!=0)rightBorder--;
        if(leftBorder%2!=0)leftBorder++;
        return (leftBorder+rightBorder)*((rightBorder-leftBorder)/2+1)/2;
        //throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(rightBorder<leftBorder){
            int buffer=leftBorder;
            leftBorder=rightBorder;
            rightBorder=buffer;
        }
        //switch if invalid input occurs
        if(rightBorder%2==0)rightBorder--;
        if(leftBorder%2==0)leftBorder++;
        return (leftBorder+rightBorder)*((rightBorder-leftBorder)/2+1)/2;
        //throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for(int i=0;i<arrayList.size();i++){
            sum+=(arrayList.get(i)+2);
        }
        return sum;
        //throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        //int sum=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2!=0){
                arrayList.set(i,arrayList.get(i)*3+2);
            }
        }
        return arrayList;
        //throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //throw new NotImplementedException();
        int sum=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2!=0){
                //arrayList.set(i,arrayList.get(i)*3+2);
                sum=sum+arrayList.get(i)*3+5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        int sum=0;
        ArrayList<Integer> buffer2=new ArrayList<>(arrayList);
        for(int i=0;i<buffer2.size();){
            if(buffer2.get(i)%2!=0){
                //arrayList.set(i,arrayList.get(i)*3+2);
                buffer2.remove(i);
            }else{
                i++;
            }
        }
        int[] buffer=new int[buffer2.size()];
        for(int i=0;i<buffer2.size();i++){
            buffer[i]=buffer2.get(i);
        }
        Arrays.sort(buffer);
        if(buffer.length==0)return 0;
        if(buffer.length%2!=0)return buffer[buffer.length/2];
        else return (buffer[buffer.length/2-1]+buffer[buffer.length/2])/2;
        //throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double sum=0;
        ArrayList<Integer> buffer2=new ArrayList<>(arrayList);
        for(int i=0;i<buffer2.size();){
            if(buffer2.get(i)%2!=0){
                //arrayList.set(i,arrayList.get(i)*3+2);
                buffer2.remove(i);
            }else
                {
                    sum+=buffer2.get(i);
                    i++;
                }
        }

        return sum/buffer2.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        double sum=0;
        ArrayList<Integer> buffer2=new ArrayList<>(arrayList);
        for(int i=0;i<buffer2.size();i++){

            if(arrayList.get(i)==specialElment&&specialElment%2==0)return true;

        }

        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //double sum=0;
        ArrayList<Integer> buffer2=new ArrayList<>(arrayList);
        for(int i=0;i<buffer2.size();){
            if(buffer2.get(i)%2!=0){
                //arrayList.set(i,arrayList.get(i)*3+2);
                buffer2.remove(i);
            }else
            {
                //sum+=buffer2.get(i);
                i++;
            }
        }

        return buffer2;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        ArrayList<Integer> odd=new ArrayList<Integer>();
        ArrayList<Integer> even=new ArrayList<Integer>();
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2!=0){
                //arrayList.set(i,arrayList.get(i)*3+2);
                odd.add(arrayList.get(i));
            }else
            {
                even.add(arrayList.get(i));
            }
        }
        int[] oddBuffer=new int[odd.size()];
        int[] oddBuffer2=new int[odd.size()];
        int[] evenBuffer=new int[even.size()];
        for(int i=0;i<even.size();i++){
            evenBuffer[i]=even.get(i);
        }
        for(int i=0;i<odd.size();i++){
            oddBuffer[i]=odd.get(i);
        }
        Arrays.sort(oddBuffer);
        Arrays.sort(evenBuffer);
        for(int i=0;i<even.size();i++){
            oddBuffer2[i]=oddBuffer[even.size()-i-1];
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<even.size();i++){
            result.add(evenBuffer[i]);
        }
        for(int i=0;i<odd.size();i++){
            result.add(oddBuffer2[i]);
        }
        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        for(int i=0;i<arrayList.size()-1;i++){
            arrayList.set(i,(arrayList.get(i)+arrayList.get(i+1))*3);
        }

        return arrayList.subList(0,arrayList.size()-1);
    }
}
