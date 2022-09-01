public class Main {
    public static void main(String[] args)
    {   var firstboxersWight = 78.2;
        var secondboxersWight = 82.7;
        var fighters = firstboxersWight + secondboxersWight;
        System.out.println("Общий вес бойцов" + fighters);
        var weightDifference =  secondboxersWight - firstboxersWight;
        System.out.println("Разница веса" + weightDifference);
        var divisionDelay = secondboxersWight / firstboxersWight;
        System.out.println ("Остаток от деления" + divisionDelay);
        var athleteWeight = (firstboxersWight + secondboxersWight) % divisionDelay;
        System.out.println("Разница деления" + athleteWeight);
        var openingHours = 640.0;
        var timeWorker = 8.0;
        var totalEmployees = openingHours / timeWorker;
        System.out.println("Всего работников в компании" + totalEmployees);
        var morePeople = 94.0;
        var totalPeople = totalEmployees + morePeople;
        System.out.println("Всего людей" + totalPeople);
        var divideHours = totalPeople * timeWorker;
        System.out.println("Если в компании работает 174 человека, то всего часов может быть поделено между сотрудниками" + divideHours);
    }
    }