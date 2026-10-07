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
 * Клас для обчислення та пошуку точок балансу суми елементів всередині масивів.
 * Містить оптимізований алгоритм лінійного пошуку розділювача.
 * 
 * @author Анастасія Горбунова
 * @version 1.1 05 Oct 2026
 */
public class BalanceFinder {
    /** Масив цілих чисел для обчислення балансу частин */
    private final int[] array;

    /**
     * Конструктор для прив'язки досліджуваного масиву до об'єкта обчислювача.
     * 
     * @param array масив цілих чисел довжиною 2 або більше
     */
    public BalanceFinder(int[] array) {
        this.array = array;
    }

    /**
     * Перевіряє можливість розділення масиву на дві частини з рівною сумою чисел.
     * Оптимізовано під складність O(N) без використання вкладених циклів.
     * 
     * @return true, якщо масив можна збалансувати, інакше false
     */
    public boolean canBalance() {
        // Перед коментарем прийнято залишати порожній рядок
        if (array == null || array.length < 2) {
            return false;
        }

        int totalSum = 0;			/* Повна сума абсолютно всіх елементів масиву */
        int leftSum = 0;			/* Накопичувана сума лівої частини при ітерації */

        // Обчислюємо загальну суму масиву за допомогою компактного циклу foreach
        for (int element : array) {
            totalSum += element;
        }

        /* 
         * Якщо загальна сума чисел непарна, її математично неможливо 
         * розділити на дві рівні цілі частини. Відразу повертаємо false.
         */
        if (totalSum % 2 != 0) {
            return false;
        }

        // Послідовно накопичуємо ліву суму та порівнюємо її з половиною від загальної
        for (int element : array) {
            leftSum += element;
            
            if (leftSum == totalSum / 2) {
                return true; /* Точку рівноваги (балансу) знайдено */
            }
        }

        return false;
    }
}
