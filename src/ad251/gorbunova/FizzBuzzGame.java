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
 * Клас, що реалізує логіку відомої у Британії дитячої гри FizzBuzz.
 * Використовує формативане виведення для створення акуратної текстової сітки.
 * 
 * @author Анастасія Горбунова
 * @version 1.1 05 Oct 2026
 */
public class FizzBuzzGame {
    /** Початкове значення діапазону чисел гри */
    private final int start;
    /** Кінцеве значення діапазону чисел гри */
    private final int end;

    /**
     * Конструктор для ініціалізації меж ігрового діапазону.
     * 
     * @param start перше число діапазону
     * @param end останнє число діапазону
     */
    public FizzBuzzGame(int start, int end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Запускає гру та виводить результат у вигляді красивої сітки (10 стовпців).
     * Замінює числа кратні 3 на Fizz, кратні 5 на Buzz, кратні обом — на FizzBuzz.
     */
    public void play() {
        int count = 0; /* Лічильник виведених елементів у поточному рядку */
        
        for (int i = start; i <= end; i++) {
            String value; /* Текстове представлення поточного кроку гри */
            
            /* 
             * Блок аналізу кратності числа за допомогою оператора залишку від ділення.
             * Спочатку перевіряємо комбіновану умову кратності обом числам (3 та 5).
             */
            if (i % 3 == 0 && i % 5 == 0) {
                value = "FizzBuzz";
            } else if (i % 3 == 0) {
                value = "Fizz";
            } else if (i % 5 == 0) {
                value = "Buzz";
            } else {
                value = String.valueOf(i);
            }

            // Перед однорядковим коментарем прийнято залишати порожній рядок
            // %-10s вирівнює текст по лівому краю, резервуючи під нього 10 символів
            System.out.printf("%-10s", value);
            count++;

            // Перевіряємо, чи заповнився поточний рядок сітки з 10 елементів
            if (count % 10 == 0) {
                System.out.print("\n");
            }
        }
        
        // Перевіряємо необхідність фінального перенесення рядка в самому кінці
        if (count % 10 != 0) {
            System.out.print("\n");
        }
    }
}
