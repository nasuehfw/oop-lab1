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
 * Головний керуючий клас програми (Точка входу).
 * Координує створення об'єктів-компонентів та демонстрацію виконання завдань 1, 2 та 3*.
 * 
 * @author Анастасія Горбунова
 * @version 1.1 05 Oct 2026
 */
public class Main {

    /**
     * Точка входу в програму. Викликає методи компонентів з демонстраційними даними.
     * 
     * @param args аргументи командного рядка при запуску додатка
     */
    public static void main(String[] args) {
        // Перед коментарем прийнято залишати порожній рядок
        // --- Демонстрація та перевірка Завдання 1 ---
        System.out.print("=== Лабораторна робота №1 ===\n\n");
        System.out.print("Завдання 1 (Перевірка масиву на впорядкованість):\n");
        
        int[] sortedData = {1, 2, 3, 3, 5};
        int[] unsortedData = {1, 3, 2, 4, 5};
        
        ArrayChecker correctChecker = new ArrayChecker(sortedData);
        ArrayChecker wrongChecker = new ArrayChecker(unsortedData);
        
        System.out.print("  Масив {1, 2, 3, 3, 5} -> " + correctChecker.isSortedUp() + "\n");
        System.out.print("  Масив {1, 3, 2, 4, 5} -> " + wrongChecker.isSortedUp() + "\n\n");

        // --- Демонстрація та перевірка Завдання 2 ---
        System.out.print("Завдання 2 (Сітка FizzBuzz для чисел від 1 до 100):\n");
        
        FizzBuzzGame game = new FizzBuzzGame(1, 100);
        game.play();
        System.out.print("\n");

        // --- Демонстрація та перевірка Завдання 3* ---
        System.out.print("Завдання 3* (Пошук точки балансу сум масиву):\n");
        
        int[] balanceData1 = {1, 1, 1, 2, 1};
        int[] balanceData2 = {2, 1, 1, 2, 1};
        int[] balanceData3 = {10, 10};
        
        BalanceFinder finder1 = new BalanceFinder(balanceData1);
        BalanceFinder finder2 = new BalanceFinder(balanceData2);
        BalanceFinder finder3 = new BalanceFinder(balanceData3);
        
        System.out.print("  Method({1, 1, 1, 2, 1}) -> " + finder1.canBalance() + "\n");
        System.out.print("  Method({2, 1, 1, 2, 1}) -> " + finder2.canBalance() + "\n");
        System.out.print("  Method({10, 10})        -> " + finder3.canBalance() + "\n");
    }
}
