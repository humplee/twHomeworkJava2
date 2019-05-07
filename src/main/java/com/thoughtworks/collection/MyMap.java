package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        for(int i=0;i<array.size();i++){
            array.set(i,array.get(i)*3);
        }
        return array;
    }

    public List<String> mapLetter() {
        ArrayList<String> result=new ArrayList<>();

        for(int i=0;i<array.size();i++){
            result.add(String.valueOf((char)((array.get(i).toString().charAt(0))-'1'+'a')));
        }
        return result;
    }

    public List<String> mapLetters() {
        ArrayList<String> result=new ArrayList<>();


        for(int i=0;i<array.size();i++){
            ArrayList<Character> buffer=new ArrayList<>();
            int num=array.get(i);
            num--;
            buffer.add((char)(num%26+'a'));
            num/=26;
            while(num>0){
                num--;
                buffer.add((char)(num%26+'a'));
                num/=26;
            }

            char[]a=new char[buffer.size()];
            for(int j=0;j<a.length;j++){
                a[j]=buffer.get(a.length-j-1);
            }
            StringBuilder sb=new StringBuilder();
            sb.append(a);
            result.add(sb.toString());
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        Comparator com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o2- o1;
            }
        };
        Collections.sort(array,com);
        return array;
    }

    public List<Integer> sortFromSmall() {
        Comparator com = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                return o1- o2;
            }
        };
        Collections.sort(array,com);
        return array;
    }

}


