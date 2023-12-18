package prac23;

import java.util.Arrays;

// Интерфейс для абстрактного типа данных "Очередь"
interface Queue<T> {
    void enqueue(T element);    // добавить элемент в очередь
    T element();                // первый элемент в очереди
    T dequeue();                // удалить и вернуть первый элемент в очереди
    int size();                 // текущий размер очереди
    boolean isEmpty();          // является ли очередь пустой
    void clear();               // удалить все элементы из очереди
}

// Реализация очереди на массиве
class ArrayQueue<T> implements Queue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements; //Массив для хранения элементов очереди
    private int size; //размер очереди
    private int front;//Индекс первого элемента в очереди
    private int rear;//Индекс последнего элемента в очереди

    public ArrayQueue() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = -1;
    }

    // Пересчет индекса с учетом цикличности
    private int adjustIndex(int index) {
        return (index + elements.length) % elements.length;
    }

    // Добавление элемента в очередь
    public void enqueue(T element) {
        if (size == elements.length) { //достиглаа ли очередь своей текущей максимальной емкости
            elements = Arrays.copyOf(elements, elements.length * 2); //создание нового увеличенного массива в 2 раза
        }
        rear = adjustIndex(rear + 1); //новый конец очереди
        elements[rear] = element; //значение элемента в позиции rear
        size++;
    }

    // Получение первого элемента в очереди
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[front];
    }

    // Удаление и возвращение первого элемента в очереди
    public T dequeue() {
        T element = element();
        elements[front] = null;
        front = adjustIndex(front + 1);
        size--;
        return element;
    }

    // Текущий размер очереди
    public int size() {
        return size;
    }

    // Проверка, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Удаление всех элементов из очереди
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        front = 0;
        rear = -1;
    }
}

public class task1 {
    public static void main(String[] args) {
        // Тестирование ArrayQueue
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("42");
        queue.enqueue("42");
        queue.enqueue("423");

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Извлечено: " + queue.dequeue());
        System.out.println("Размер: " + queue.size());
        System.out.println("Пусто ли: " + queue.isEmpty());

        queue.clear();
        System.out.println("Пусто после очистки: " + queue.isEmpty());

    }
}
