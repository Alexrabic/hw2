package org.example;

import java.util.ArrayList;
import java.util.List;


public class HomeWork extends BinaryIntSearchTree {

    /**
     * <h1>Задание 1.</h1>
     * Дан класс BinaryTree, который реализует бинарное дерево поиска.
     * Реализовать метод findMaxDigits, который возвращает массив
     * наибольших элементов в дереве, не превосходящих upperBound.
     * <br/>
     * Пример :
     * коллекция в дереве 1, 2, 3, 4, 5
     * count = 3, upperBound 4
     * ответ [4, 3, 2]

     *
     * @param count максимальное количество элементов в ответе
     * @param upperBound верхняя граница для поиска элементов
     * @return массив найденных максимальных значений не более чем upperBound и длиной не более count, отсортировано от большего к меньшему
     * Сигнатуру метода не меняем
     */
    public List<Integer> findMaxDigits(int count, int upperBound) {
        if (count == 0 || upperBound == 0 ) {
            throw new IllegalArgumentException("Вы передали нулевые значения для метода. Измените значения");
        }
        List<Integer> result = new ArrayList<>();
        findMaxDigitsHelper(result, count, upperBound, root);
        return result;
    }

    private void findMaxDigitsHelper(List<Integer> result, int count, int upperBound, Node node) {
        if (node == null) {
            return;
        }

        if (node.value <= upperBound) {
            findMaxDigitsHelper(result, count, upperBound, node.right);
            if (result.size() < count) {
                result.add(node.value);
            }
        }
        findMaxDigitsHelper(result, count, upperBound, node.left);
    }
}
