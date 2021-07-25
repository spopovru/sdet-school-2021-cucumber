#language: ru
@calculator @multiplication
Функция: Умножение

  Сценарий: Умножение положительных чисел
    Пусть первый аргумент равен 3.0
    Пусть второй аргумент равен 2.0
    Когда выполнена операция умножения
    Тогда результат равен 6.0

  Сценарий: Умножение отрицательных чисел
    Когда выполнена операция умножения чисел -3.0 и -2.0
    Тогда результат равен 6.0

  Структура сценария: Умножение различных чисел
    Пусть первый аргумент равен <аргумент1>
    Пусть второй аргумент равен <аргумент2>
    Когда выполнена операция умножения
    Тогда результат равен <результат>
    Примеры:
      | аргумент1 | аргумент2 | результат |
      |       0.0 |       0.0 |       0.0 |
      |       1.0 |       0.0 |       0.0 |
      |      -0.5 |       2.0 |      -1.0 |
      |       0.5 |       2.0 |       1.0 |
      |       4.5 |       2.0 |       9.0 |
      |       3.0 |       3.0 |       9.0 |
      |      -3.0 |      -3.0 |       9.0 |
      |       3.0 |      -3.0 |      -9.0 |
      |      -2.0 |       5.0 |     -10.0 |