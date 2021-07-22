#language: ru
@calculator @addition

Функция: Сложение

  Сценарий: Сложение положительных чисел
    Пусть первый аргумент равен 1.0
    Пусть второй аргумент равен 2.0
    Когда выполнена операция сложения
    Тогда результат равен 3.0
  
  Сценарий: Сложение отрицательных чисел
    Когда выполнена операция сложения чисел -1.0 и -2.0
    Тогда результат равен -3.0

  Структура сценария: Сложение различных чисел
    Пусть первый аргумент равен <аргумент1>
    Пусть второй аргумент равен <аргумент2>
    Когда выполнена операция сложения
    Тогда результат равен <результат>
    Примеры:
      | аргумент1 | аргумент2 | результат |
      |       0.0 |       0.0 |       0.0 |
      |       0.0 |      -1.0 |      -1.0 |
      |      -1.0 |       0.0 |      -1.0 |
      |       0.0 |       1.0 |       1.0 |
      |       1.0 |       0.0 |       1.0 |
      |      -0.1 |       0.0 |      -0.1 |
      |       0.0 |      -0.1 |      -0.1 |
      |       0.1 |       0.0 |       0.1 |
      |       0.0 |       0.1 |       0.1 |
      |       1.0 |      -2.0 |      -1.0 |
      |      -2.0 |       1.0 |      -1.0 |