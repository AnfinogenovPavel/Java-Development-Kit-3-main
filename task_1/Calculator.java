public static class Calculator {
  // Обобщенный метод для сложения
    public static <T extends Number> double sum(T num1, T num2) {
      return num1.doubleValue() + num2.doubleValue();
    }

  // Обобщенный метод для умножения
    public static <T extends Number> double multiply(T num1, T num2) {
      return num1.doubleValue() * num2.doubleValue();
    }

  // Обобщенный метод для деления
    public static <T extends Number> double divide(T num1, T num2) {
    if (num2.doubleValue() == 0) {
      throw new IllegalArgumentException("Деление на ноль не допускается");
    }
    return num1.doubleValue() / num2.doubleValue();
  }


  // Обобщенный метод для вычитания
    public static <T extends Number> double subtract(T num1, T num2) {
    return num1.doubleValue() - num2.doubleValue();
    }
  }

  public static void main(String[] args) {
    // Примеры использования
    int intSumResult = (int) Calculator.sum(5, 3);
    double doubleDivideResult = Calculator.divide(10.0, 2.5);
    int intSubtractResult = (int) (int) Calculator.subtract(10, 5);
    double doubleMultiplyResult = Calculator.multiply(3.5, 2.0);

    System.out.println("Сумма: " + intSumResult);
    System.out.println("Результат деления: " + doubleDivideResult);
    System.out.println("Разность: " + intSubtractResult);
    System.out.println("Произведение: " + doubleMultiplyResult);
  }

