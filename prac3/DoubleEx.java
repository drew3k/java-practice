package prac3;

public class DoubleEx {
    public static void main(String[] args) {
        // Создание объектов класса Double с использованием метода valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf(42.0);

        // Преобразование значения типа String к типу double с использованием метода Double.parseDouble()
        String strValue = "5.67";
        double doubleValue = Double.parseDouble(strValue);

        // Преобразование объекта класса Double ко всем примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        // Вывод значения объекта Double в консоль
        System.out.println("Значение doubleObj1: " + doubleObj1);
        System.out.println("Значение doubleObj2: " + doubleObj2);

        // Преобразование литерала типа double к строке
        double d = 3.14;
        String strD = Double.toString(d);
        System.out.println("Строковое представление числа 3.14: " + strD);
    }
}
