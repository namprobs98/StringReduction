/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.stringreduction;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nhat Anh
 */
public class StringReduction {

    public static String stringReduction(String input) {
        //Khởi tạo 1 LinkedHashSet
        Set<Character> charSet = new LinkedHashSet<>();
        //Duyệt hết các phần tử của String thêm vào set
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }
        //Dựng lại string từ linkedhashset
        StringBuilder sb = new StringBuilder();
        for (char c : charSet) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        String output = stringReduction(input);
        System.out.println("Output: " + output);
    }
}
