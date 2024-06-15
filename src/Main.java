public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);

        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Dog + 4 = " + dog);
        System.out.println("Cat + 4 = " + cat);
        System.out.println("Paper + 4 = " + paper);

        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Dog + 4 - 3.5 = " + dog);
        System.out.println("Cat + 4 - 1.6 = " + cat);
        System.out.println("Paper + 4 - 7639 = " + paper);

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("frient = " + friend);
        friend = friend + 2;
        System.out.println("frient + 2 = " + friend);
        friend = friend / 7;
        System.out.println("(frient + 2) / 7 = " + friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("(frog * 10) / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("((frog * 10) / 3.5) + 4 = " + frog);

        //Задача 6
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var massOfTwoBoxers = firstBoxer + secondBoxer;
        System.out.println("Общая масса двух бойцов = " + massOfTwoBoxers);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница между массами бойцов = " + weightDifference);

        //Задача 7
        System.out.println("Задача 7");
        var weightDifference2 = secondBoxer % firstBoxer;
        System.out.println("Разница между массами бойцов = " + weightDifference2);

        //Задача 8
        System.out.println("Задача 8");
        var genWorkTime = 640;
        var workerTime = 8;
        var workers = genWorkTime / workerTime;
        System.out.println("Всего работников в компании — " + workers + " человек");

        workers = workers + 94;
        genWorkTime = workers *  workerTime;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + genWorkTime + " часов работы может быть поделено между сотрудниками");







    }
}