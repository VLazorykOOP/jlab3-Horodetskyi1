// Абстрактний базовий клас Number
abstract class Number {
    // Абстрактні методи
    public abstract Number add(Number other);
    public abstract Number subtract(Number other);
    public abstract Number multiply(Number other);
    public abstract Number divide(Number other);

    // Перевизначення toString (загальний вигляд)
    @Override
    public abstract String toString();

    // Перевизначення equals (загальний вигляд)
    @Override
    public abstract boolean equals(Object obj);
}

// Клас для цілих чисел
class IntegerNumber extends Number {
    private final int value;

    public IntegerNumber(int value) {
        this.value = value;
    }

    @Override
    public Number add(Number other) {
        if (other instanceof IntegerNumber) {
            int result = this.value + ((IntegerNumber) other).value;
            return new IntegerNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for addition");
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof IntegerNumber) {
            int result = this.value - ((IntegerNumber) other).value;
            return new IntegerNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for subtraction");
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof IntegerNumber) {
            int result = this.value * ((IntegerNumber) other).value;
            return new IntegerNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for multiplication");
    }

    @Override
    public Number divide(Number other) {
        if (other instanceof IntegerNumber) {
            if (((IntegerNumber) other).value == 0) {
                throw new ArithmeticException("Division by zero");
            }
            int result = this.value / ((IntegerNumber) other).value;
            return new IntegerNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for division");
    }

    @Override
    public String toString() {
        return "IntegerNumber: " + value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntegerNumber) {
            return this.value == ((IntegerNumber) obj).value;
        }
        return false;
    }
}

// Клас для дійсних чисел
class RealNumber extends Number {
    private final double value;

    public RealNumber(double value) {
        this.value = value;
    }

    @Override
    public Number add(Number other) {
        if (other instanceof RealNumber) {
            double result = this.value + ((RealNumber) other).value;
            return new RealNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for addition");
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof RealNumber) {
            double result = this.value - ((RealNumber) other).value;
            return new RealNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for subtraction");
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof RealNumber) {
            double result = this.value * ((RealNumber) other).value;
            return new RealNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for multiplication");
    }

    @Override
    public Number divide(Number other) {
        if (other instanceof RealNumber) {
            if (((RealNumber) other).value == 0) {
                throw new ArithmeticException("Division by zero");
            }
            double result = this.value / ((RealNumber) other).value;
            return new RealNumber(result);
        }
        throw new IllegalArgumentException("Invalid type for division");
    }

    @Override
    public String toString() {
        return "RealNumber: " + value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RealNumber) {
            return this.value == ((RealNumber) obj).value;
        }
        return false;
    }
}

// Головний клас програми
public class task2{
    public static void main(String[] args) {
        // Створення об'єктів
        Number int1 = new IntegerNumber(10);
        Number int2 = new IntegerNumber(20);

        Number real1 = new RealNumber(5.5);
        Number real2 = new RealNumber(2.2);

        // Масив об'єктів
        Number[] numbers = {int1, int2, real1, real2};

        // Демонстрація роботи методів
        for (Number number : numbers) {
            System.out.println(number);
        }

        // Арифметичні операції
        System.out.println("Addition: " + int1.add(int2));
        System.out.println("Subtraction: " + int2.subtract(int1));
        System.out.println("Multiplication: " + real1.multiply(real2));
        System.out.println("Division: " + real1.divide(real2));

        // Перевірка equals
        System.out.println("int1 equals int2: " + int1.equals(int2));
        System.out.println("real1 equals real2: " + real1.equals(real2));
    }
}
