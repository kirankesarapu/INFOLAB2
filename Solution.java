import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] a={1,2,3};
        String[] b= {"Hello","World"};
        printArrays(a, b);
        
    }
    
    private static void printArrays(int[] a, String[] b){
        for(int i : a){
            System.out.println(i);
        }
        for(String j : b){
            System.out.println(j);
        }
    }
}
