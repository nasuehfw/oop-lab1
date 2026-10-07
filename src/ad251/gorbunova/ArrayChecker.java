/*
 * Copyright (c) 2026 Anastasiia Gorbunova
 * National University "Odesa Polytechnic"
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://apache.org
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ad251.gorbunova;

/**
 * Клас-компонент для інспекції та аналізу властивостей масивів.
 * Використовується для перевірки математичного порядку елементів.
 * 
 * @author Анастасія Горбунова
 * @version 1.1 05 Oct 2026
 */
public class ArrayChecker {
    /** Внутрішній масив цілих чисел для дослідження */
    private final int[] array;

    /**
     * Конструктор для ініціалізації об'єкта аналізованим масивом.
     * 
     * @param array масив цілих чисел (за умовою довжиною від 2 елементів)
     */
    public ArrayChecker(int[] array) {
        this.array = array;
    }

    /**
     * Перевіряє, чи є кожен елемент масиву більше або дорівнює попередньому.
     * Реалізує алгоритм перевірки масиву на впорядкованість за неубуванням.
     * 
     * @return true, якщо масив відсортований за зростанням/неубуванням, інакше false
     */
    public boolean isSortedUp() {
        // Перед коментарем прийнято залишати порожній рядок
        // Валідація вхідних даних на випадок порожнього посилання або короткого масиву
        if (array == null || array.length < 2) {
            return false;
        }

        /* 
         * Цикл починається з другого елемента (індекс 1).
         * Порівнюємо поточний елемент із безпосередньо попереднім.
         */
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; /* Знайдено порушення порядку сортування */
            }
        }
        
        return true;
    }
}
