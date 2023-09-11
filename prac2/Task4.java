package prac2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Класс, представляющий компьютер.
class Computer {
    private final String brand;
    private final String model;
    private final double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " - $" + price;
    }
}

// Класс, представляющий магазин компьютеров.
class Shop {
    private List<Computer> computers = new ArrayList<>();

    // Добавление компьютера в магазин.
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Удаление компьютера из магазина.
    public boolean removeComputer(Computer computer) {
        return computers.remove(computer);
    }

    // Поиск компьютера в магазине по бренду и модели.
    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null; // Если компьютер не найден.
    }

    // Вывод списка компьютеров в магазине.
    public List<Computer> displayComputers() {
        return computers;
    }
}

// Интерфейс для ввода данных с клавиатуры.
interface Input {
    Scanner scanner = new Scanner(System.in);

    default String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    default double getDouble(String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(scanner.nextLine());
    }
}

public class Task4 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Input input = new Input() {};

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Вывести список компьютеров");
            System.out.println("4. Найти компьютер");
            System.out.println("0. Выход");

            int choice = (int) input.getDouble("Выберите действие: ");

            switch (choice) {
                case 1:
                    String brand = input.getString("Введите бренд компьютера: ");
                    String model = input.getString("Введите модель компьютера: ");
                    double price = input.getDouble("Введите цену компьютера: ");
                    Computer computer = new Computer(brand, model, price);
                    shop.addComputer(computer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    List<Computer> computers = shop.displayComputers();
                    if (!computers.isEmpty()) {
                        System.out.println("Список компьютеров в магазине:");
                        for (int i = 0; i < computers.size(); i++) {
                            System.out.println((i + 1) + ". " + computers.get(i));
                        }
                        int indexToRemove = (int) input.getDouble("Введите номер компьютера для удаления: ") - 1;
                        if (indexToRemove >= 0 && indexToRemove < computers.size()) {
                            Computer computerToRemove = computers.get(indexToRemove);
                            if (shop.removeComputer(computerToRemove)) {
                                System.out.println("Компьютер удален из магазина.");
                            } else {
                                System.out.println("Ошибка при удалении компьютера.");
                            }
                        } else {
                            System.out.println("Недопустимый номер компьютера.");
                        }
                    } else {
                        System.out.println("Магазин пуст. Нет компьютеров для удаления.");
                    }
                    break;
                case 3:
                    computers = shop.displayComputers();
                    if (!computers.isEmpty()) {
                        System.out.println("Список компьютеров в магазине:");
                        for (int i = 0; i < computers.size(); i++) {
                            System.out.println((i + 1) + ". " + computers.get(i));
                        }
                    } else {
                        System.out.println("Магазин пуст.");
                    }
                    break;
                case 4:
                    String searchBrand = input.getString("Введите бренд для поиска: ");
                    String searchModel = input.getString("Введите модель для поиска: ");
                    Computer foundComputer = shop.findComputer(searchBrand, searchModel);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    } else {
                        System.out.println("Компьютер не найден.");
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Недопустимый выбор. Пожалуйста, выберите действие из меню.");
            }
        }
    }
}
