package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            int a = sc.nextInt();
            n.add(a);
        }

        Collections.sort(n);

        for (int i = 0; i <n.size() ; i++) {
            System.out.println(n.get(i));
        }

//
//
//        String abc = sc.next();
//
//        switch (abc) {
//            case "ABC": {
//                System.out.println(n.get(0)+" "+n.get(1)+" "+n.get(2));
//                break;
//            }
//            case "BCA": {
//                System.out.println(n.get(1)+" "+n.get(2)+" "+n.get(0));
//                break;
//            }
//            case "CAB": {
//                System.out.println(n.get(2)+" "+n.get(0)+" "+n.get(1));
//                break;
//            }
//            case "ACB": {
//                System.out.println(n.get(0)+" "+n.get(2)+" "+n.get(1));
//                break;
//            }
//            case "CBA": {
//                System.out.println(n.get(2)+" "+n.get(1)+" "+n.get(0));
//                break;
//            }
//            case "BAC": {
//                System.out.println(n.get(1)+" "+n.get(0)+" "+n.get(2));
//                break;
//            }
//            case "abc": {
//                System.out.println(n.get(0)+" "+n.get(1)+" "+n.get(2));
//                break;
//            }
//            case "bca": {
//                System.out.println(n.get(1)+" "+n.get(2)+" "+n.get(0));
//                break;
//            }
//            case "cab": {
//                System.out.println(n.get(2)+" "+n.get(0)+" "+n.get(1));
//                break;
//            }
//            case "acb": {
//                System.out.println(n.get(0)+" "+n.get(2)+" "+n.get(1));
//                break;
//            }
//            case "cba": {
//                System.out.println(n.get(2)+" "+n.get(1)+" "+n.get(0));
//                break;
//            }
//            case "bac": {
//                System.out.println(n.get(1)+" "+n.get(0)+" "+n.get(2));
//                break;
//            }
//            default:{
//                System.out.println("");
//                break;
//           }
//
 //       }
    }
}
