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
    }
}