public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog=dog + 4 -3.5;
        cat=cat+4- 1.6;
        paper=paper+4- 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumBoxer = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + sumBoxer + " кг");
        var differenceBoxer = secondBoxer - firstBoxer;
        System.out.println("Вычитание из большего веса меньшего " + differenceBoxer + " кг");
        var differenceBoxer2 = secondBoxer % firstBoxer;
        System.out.println("Используя функцию остаток от деления " + differenceBoxer2 + " кг");
        var sumTime = 640;
        var jobTime = 8;
        var worker = sumTime / jobTime;
        System.out.println("Всего работников в компании – " + worker + " человек");
        var newWorker = worker + 94;
        var newSumTime = newWorker * 8;
        System.out.println("Если в компании работает " + newWorker + " человек, " + "то всего " + newSumTime + " часов работы может быть поделено между сотрудниками.");
    }
}