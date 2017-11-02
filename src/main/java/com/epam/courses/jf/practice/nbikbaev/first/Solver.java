package com.epam.courses.jf.practice.nbikbaev.first;

import com.epam.courses.jf.practice.common.first.ISolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solver implements ISolver {

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    @Override
    public void task1() {
        int n;
        String maxString = null;
        String minString = null;
        int minLength = 0;
        int maxLength = 0;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String strLine = in.readLine();
            n = Integer.valueOf(strLine);
            strLine = in.readLine();
            maxString = strLine;
            minString = strLine;
            for (int i = 0; i < n - 1; i++) {
                strLine = in.readLine();
                if (strLine.length() >= maxString.length()) {
                    maxString = strLine;
                }
                if (strLine.length() <= minString.length()) {
                    minString = strLine;
                }
            }
            minLength = minString.length();
            maxLength = maxString.length();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("MIN (%d): \"%s\"%n", minLength, minString);
        System.out.printf("MAX (%d): \"%s\"%n", maxLength, maxString);
    }

    @Override
    public void task2() {
        int n;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String strLine = in.readLine();
            n = Integer.valueOf(strLine);
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strings.add(in.readLine());
            }
            strings.sort((o1, o2) -> {
                int res = Integer.compare(o1.length(), o2.length());
                if (res == 0) {
                    return o1.compareTo(o2);
                }
                return res;
            });
            for (String s : strings) {
                System.out.printf("(%d): \"%s\"%n", s.length(), s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void task3() {
        int n;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String strLine = in.readLine();
            n = Integer.valueOf(strLine);
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strings.add(in.readLine());
            }
            strings.sort(Comparator.comparingInt(String::length));
            int totalLength = 0;
            for (String s : strings) {
                totalLength += s.length();
            }
            int average = totalLength / n;
            System.out.printf("AVERAGE (%d)%n", average);
            for (String s : strings) {
                if (s.length() < average) {
                    System.out.printf("(%d): \"%s\"%n", s.length(), s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void task4() {
        int n;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String strLine = in.readLine();
            n = Integer.valueOf(strLine);
            int min = Integer.MAX_VALUE;
            String minWord = null;
            strLine = in.readLine();
            String[] words = strLine.trim().split(" ");
            Set<Character> uniqKeys = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < words[i].length(); k++) {
                    uniqKeys.add(words[i].charAt(k));
                }
                if (uniqKeys.size() < min) {
                    min = uniqKeys.size();
                    minWord = words[i];
                }
                uniqKeys.clear();
            }
            System.out.println(minWord);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void task5() {
        int n = 0;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String strLine = in.readLine();
            n = Integer.valueOf(strLine);
            strLine = in.readLine();
            Pattern pattern2 = Pattern.compile("[AEIOUaeiouz]");
            int k = 0;
            for (String word : strLine.trim().split(" ")) {
                int v = 0;
                if (word.matches("^[a-zA-Z]+$")) {
                    Matcher matcher2 = pattern2.matcher(word);
                    while (matcher2.find()) {
                        v++;
                    }
                    if (word.length() / 2 == v) {
                        k++;
                    }
                }

            }
            System.out.println(k);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void task6() {

    }

    @Override
    public void task7() {

    }

    @Override
    public void task8() {

    }

    @Override
    public void task9() {

    }

    @Override
    public void task10() {

    }

    @Override
    public void task11() {

    }

    @Override
    public void task12() {

    }

    @Override
    public void task13() {

    }

    @Override
    public void task14() {

    }

    @Override
    public void task15() {

    }

    @Override
    public void task16() {

    }

    @Override
    public void task17() {

    }

    @Override
    public void task18() {

    }

    @Override
    public void task19() {

    }

    @Override
    public void task20() {

    }

    @Override
    public void task21() {

    }

    @Override
    public void task22() {

    }

    @Override
    public void task23() {

    }

    @Override
    public void task24() {

    }

    @Override
    public void task25() {

    }

    @Override
    public void task26() {

    }

    @Override
    public void task27() {

    }
}