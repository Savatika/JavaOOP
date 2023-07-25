package Callculator;

/*
 * Интерфейс
 */
public interface Calculator {

    /**
     * сложение
     * 
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    Operation add(Operation n1, Operation n2);

    /**
     * умножение
     * 
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    Operation multiply(Operation n1, Operation n2);

    /**
     * деление
     * 
     ** @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    Operation divide(Operation n1, Operation n2);
}
