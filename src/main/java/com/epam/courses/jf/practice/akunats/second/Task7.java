package com.epam.courses.jf.practice.akunats.second;

import com.epam.courses.jf.practice.common.second.ITestableTask7;

import java.util.ArrayList;
import java.util.List;

public class Task7 implements ITestableTask7 {
    public List<Integer> multiplyPolynomials(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();
        List<Integer> maxListSize = new ArrayList<>(first.size() >= second.size() ? first : second); // нходим коллекцию большей размерности
        // заполняем матрицу result возможным количеством нулей
        int lengthMin = first.size() <= second.size() ? first.size() : second.size() ;
        int lengthResult = (2 * lengthMin) < maxListSize.size() ? maxListSize.size() - 1 : (2 * lengthMin);
        for (int i = 0; i < lengthResult; i++) {
            result.add(i, 0);
        }
        List<Integer> minListSize = new ArrayList<>(first.size() < second.size() ? first : second);
        //////
        for (int i = 0; i < minListSize.size(); i++) {
            for (int j = 0; j < maxListSize.size(); j++) {
                // если индекс содержится в двух коллецкиях
                // умножаем элементы (1) и записываем в индекс с сложенным показателем степени (2)
                result.set(i + j, //(2)
                        result.get(i + j)
                                + maxListSize.get(j)
                                * minListSize.get(i) // (1)
                                /*+ (i + i < maxListSize.size()
                                && i + i >= minListSize.size() ?
                                maxListSize.get(i + j) : 0)*/);
                /*if (result.get(i) == 0) {
                    result.set(i, maxListSize.get(i));
                }*/
                //если индекс не содержится в двух коллецкиях, оставляем тот элемент из большей коллекции
            }
        }
        return result;
    }
}