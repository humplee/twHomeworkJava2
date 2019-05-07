package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Comparator com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        };
        Collections.sort(arrayList,com);
        return arrayList.get(arrayList.size()-1);
    }

    public double getMinimum() {
        Comparator com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        };
        Collections.sort(arrayList,com);
        return arrayList.get(0);
    }

    public double getAverage() {
        int sum=0;
        for(int i=0;i<arrayList.size();i++){
            sum+=arrayList.get(i);
        }
        return (double)sum/arrayList.size();
    }

    public double getOrderedMedian() {
        Comparator com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        };
        Collections.sort(arrayList,com);
        if(arrayList.size()==0)return 0;
        if(arrayList.size()%2!=0)return (double)arrayList.get(arrayList.size()/2);
        else return ((double)arrayList.get(arrayList.size()/2-1)+(double)arrayList.get(arrayList.size()/2))/2;
    }

    public int getFirstEven() {
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0)return arrayList.get(i);
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0)return i;
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        Comparator com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        };
        Collections.sort(arrayList,com);
        Collections.sort(this.arrayList,com);
        if(arrayList.size()!=this.arrayList.size())return false;
        for(int i=0;i<arrayList.size();i++){
            if(this.arrayList.get(i)!=arrayList.get(i))return false;
        }
        return true;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
//        Comparator com = new Comparator<Integer>(){
//            public int compare(Integer o1, Integer o2) {
//                return o1- o2;
//            }
//        };
//        Collections.sort(arrayList,com);
        if(arrayList.size()==0)return 0.0;
        if(arrayList.size()%2!=0)return (double)arrayList.get(arrayList.size()/2);
        else return ((double)arrayList.get(arrayList.size()/2-1)+(double)arrayList.get(arrayList.size()/2))/2;
    }

    public int getLastOdd() {
        int theOdd=-1;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2!=0)theOdd=arrayList.get(i);
        }
        return theOdd;
    }

    public int getIndexOfLastOdd() {
        int theOdd=-1;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2!=0)theOdd=i;
        }
        return theOdd;
    }
}
