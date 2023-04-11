package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester t1 = new Tester();
        Tester t2 = new Tester("Роман", "Зыль", 4,200.42);
        Tester t3 = new Tester("Иван", "Иванович",2,5,200.323);
        t1.workTihon("Тихон");
        t2.workTihon();
        t3.workTihon(23);
        t1.earn("Тихон",200.42);
    }
}
