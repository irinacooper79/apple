import java.sql.SQLOutput;

public class Main {
public static void main(String[] args) {
        var firstboxersWight = 78.2;
        var secondboxersWight = 82.7;
        var fighters = firstboxersWight + secondboxersWight;
        System.out.println("Общий вес бойцов" + fighters);
        var weightDifference = secondboxersWight - firstboxersWight;
        System.out.println("Разница веса" + weightDifference);
        var divisionDelay = secondboxersWight / firstboxersWight;
        System.out.println("Остаток от деления" + divisionDelay);
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
        System.out.println("Если в компании работает 174 человека, то всего часов может быть поделено между сотрудниками"
                + divideHours);
        int ageSerj = 75;
        System.out.println("Значение переменной ageSerj с типом int равно" + ageSerj);
        byte heightIra = 110;
        System.out.println("Значение переменной heightIra с типом byte равно" + heightIra);
        short lengthStreet = 333;
        System.out.println("Значение переменной lengthStreet с типом short равно" + lengthStreet);
        long bodySize = 48;
        System.out.println("Значение переменной bodySize с типом long равно" + bodySize);
        float ageIra = 42.9f;
        System.out.println("Значение переменной ageIra с типом float равно" + ageIra);
        double ageUra = 40.1d;
        System.out.println("Значение переменной ageUra с типом double равно" + ageUra);
        float appleBox = 27.12f;
        System.out.println(appleBox);
        long pearsBox = 987678965549l;
        System.out.println(pearsBox);
        double littleCat = 2.786d;
        System.out.println(littleCat);
        boolean bigDog = false;
        System.out.println(bigDog);
        short bigHourse = 569;
        System.out.println(bigHourse);
        int fastRiver = -159;
        System.out.println(fastRiver);
        int pinkCat = 27897;
        System.out.println(pinkCat);
        byte blueSky = 67;
        System.out.println(blueSky);
        int ludPav = 23;
        int annaSerg = 27;
        int ekatAnd = 30;
        int totalStudents = ludPav + annaSerg + ekatAnd;
        System.out.println("Всего учеников" + totalStudents);
        short piecePaper = 480;
        int paperStudent = piecePaper / totalStudents;
        System.out.println("На каждого ученика рассчитано листов бумаги" + paperStudent);
        byte bottle = 16;
        byte time = 2;
        int efficiency = bottle / time;
        System.out.println("Производительность в одну минуту " + efficiency);
        int time20 = 20;
        int efficiency20 = efficiency * time20;
        System.out.println("За 20 минут машина произвела бутылок штук" + efficiency20);
        int timeDay = 1440;
        int efficiencyDay = efficiency * timeDay;
        System.out.println("За сутки минут машина произвела бутылок штук" + efficiencyDay);
        int time3Day = 4320;
        int efficiency3Day = efficiency * time3Day;
        System.out.println("За трое суток минут машина произвела бутылок штук" + efficiency3Day);
        int timeMonth = 43200;
        int efficiencyMonth = efficiency * timeMonth;
        System.out.println("За месяц минут машина произвела бутылок штук" + efficiencyMonth);
        byte totalCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int allPaint = whitePaint + brownPaint;
        int allRoom = totalCans / allPaint;
        System.out.println("Сколько краски" + allRoom);
        int allWhite = allRoom * whitePaint;
        System.out.println("В школе, где классов, нужно банок белой краски" + allWhite);
        int allBrown = allRoom * brownPaint;
        System.out.println("В школе, где классов, нужно банок коричневой краски" + allBrown);
        int banana = 400;
        int milk = 210;
        int icecream = 200;
        int eggs = 280;
        int products = banana + milk + icecream + eggs;
        double weight = products / 1000;
        System.out.println("Спортивный завтрак в килограммах" + weight);
        int allWeight = 7000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int weight1 = allWeight / weightLoss1;
        System.out.println("Количество дней для похудения 250 грамм в день" + weight1);
        int weight2 = allWeight / weightLoss2;
        System.out.println("Количество дней для похудения 500 грамм в день" + weight2);
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int year = 12;
        int raisMasha = Masha / 100 * 10;
        int moneyMasha = raisMasha + Masha;
        System.out.println("Маша зарплата +10%" + moneyMasha);
        int moneyMasha1 = moneyMasha * year;
        System.out.println("Маша теперь получает за год" + moneyMasha1);
        int moneyMasha11 = Masha * year;
        System.out.println("Зарплата Маши до повышения за год" + moneyMasha11);
        int differenceM = moneyMasha1 - moneyMasha11;
        System.out.println("Годовой доход Маши вырос на " + differenceM);
        int raisDenis = Denis / 100 * 10;
        int moneyDenis = raisDenis + Denis;
        System.out.println("Дениса зарплата +10%" + moneyDenis);
        int moneyDenis1 = moneyDenis * year;
        System.out.println("Денис теперь получает за год" + moneyDenis1);
        int moneyDenis11 = Denis * year;
        System.out.println("Зарплата Дениса до повышения за год" + moneyDenis11);
        int differenceD = moneyDenis1 - moneyDenis11;
        System.out.println("Годовой доход Дениса вырос на " + differenceD);
        int raisKristina = Kristina / 100 * 10;
        int moneyKristina = raisKristina + Kristina;
        System.out.println("Кристина зарплата +10%" + moneyKristina);
        int moneyKristina1 = moneyKristina * year;
        System.out.println("Кристина теперь получает за год" + moneyKristina1);
        int moneyKristina11 = Kristina * year;
        System.out.println("Зарплата Кристины до повышения за год" + moneyKristina11);
        int differenceK = moneyKristina1 - moneyKristina11;
        System.out.println("Годовой доход Кристина вырос на " + differenceK);
        int age1 = 23;
        if (age1 >= 18) ;
        {
        }
        System.out.println("С совершеннолетием");
        if (age1 <= 18) ;
        {
        }
        System.out.println("Совершеннолетие еще не наступило");
        if (age1 >= 7) ;
        {
        }
        System.out.println("Ребенок идет в школу когда ему исполнилось 7 лет и больше");
        if (age1 >= 18) ;
        {
        }
        System.out.println("Можно отправляться в универ");
        if (age1 >= 24) ;
        {
        }
        System.out.println("Первая работа");
        int van = 102;
        int sit = 60;
        int stend = van - sit;
        System.out.println("Стоячих мест" + stend);
        if (sit <= 60) ;
        {
        }
        System.out.println("Сидячие места");
        if (stend < sit && stend < van) ;
        {
        }
        System.out.println("Только стоячие места остались");

        int age2 = 24;
        if (age2 >= 18) {
            System.out.println("С совершеннолетием");
        } else if (age2 <= 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, надо подождать");
        }
        int vag1 = 102;
        int seat1 = 60;
        int stand1 = vag1 - sit1;
        System.out.println("Стоячие места" + stand1);
        int people = 105;
        if (people <= sit ){
            System.out.println("Есть сидячие места") {
            } else if (people>=sit1 && people <= stand1){
                System.out.println("Остались стоячие места");
            } else if (people > 105);{
                System.out.println("Мест нет вагон полность заполнен"); }
            {

        int age3 = 24;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Ребенок может отправляться в университет");
        } else if (age3 >= 24) {
            System.out.println("Человек закончил университет и ему пора искать работу"); }
    }

        int vag1 = 102;
        int seat1 = 60;
        int stand1 = vag1 - sit1;
        System.out.println("Стоячие места" + stand1);
        int people = 105;
        if (people <= sit ) {
        System.out.println("Есть сидячие места") {
        } else if (people >= sit1 && people <= stand1) {
        System.out.println("Остались стоячие места");
        } else if (people > 105) ;
        {
        System.out.println("Мест нет вагон полность заполнен");}
        {

                    }
                    int age = 19;
                    if (age >= 2 && age < 6) {
                            System.out.println("Если возраст человека равен " + int
                            +", то ему надо ходить в детский сад");
                    } else if (age >= 7 && age < 18) {
                            System.out.println("Если возраст человека равен " + int +", то ему надо ходить в школу");
                    } else if (age >= 18 && <24){
                            System.out.println("Если возраст человека равен " + int
                            +", то ему надо ходить в университет");
                    } else if (age > 24) {
                            System.out.println("Если возраст человека равен " + int +", то ему надо ходить на работу");}
                    }
            }

                   int small=4;
                   int midl = 12;
                   int older = 15;
                   boolean smallChild = small<5;
                   boolean midlChild = midl>5 &&midl <14;
                   boolean teenager = older >14;
                   if (smallChild){
                   System.out.println("Если ребенку "+ smallChild" ребенок не может кататься на аттракционе");
                   if (midlChild){
                    System.out.println("Ребенок может кататься в сопровождении возрослого "+ midlChild" Если взрослого нет то кататься нельзя");
                    if (teenager){
                    System.out.println("Ребенок может кататься  "+ teenager" без сопровождения возрослых");}
                   }

                   int one = 20;
                   int two = 14;
                   int three = -2;
                   if (one>two && one>three) {
                   System.out.println("Число" + one + "больше чем" + two + "и больше чем" + three);
                   }  else if (two > one && two > three) {
                   System.out.println("Число" + two + "больше чем" + one + "и больше чем" + three);
                   } else if (three > one && three > two){
                   System.out.println ("Число" + three + "больше чем" + one + "и больше чем" + two);}
        }
                   }
                   int clientOS = (0 II 1);
                   if (clientOS == 1) {
                   System.out.println("Установите версию приложения для IOS по ссылке");
                   } else {
                   System.out.println ("Установите версию приложения для Android по ссылке");}
    }
    }
                   int clientDeviceYear = 2015;
                   if (clientDeviceYear <= 2015){
                   System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                   } else {
                   System.out.println("Установите облегченную версию для Android по ссылке");}
    }
    }
                  int year = 2021;
                  if (year/4){
                  System.out.println("Год является высокосным");
                  } else if (year/100 && year/400);
                  System.out.println("Год не ялвляется высокосным");}
            }
            }
                  int deliveryDistance = 95;
                  if (deliveryDistance <20){
        System.out.println("Потребуется дней: 1 сутки");
        } else if (deliveryDistance >=20 && <=60){
        System.out.println("Потребуется дней: + 2 суток");
        } else if (deliveryDistance >=60 && <=100){
        System.out.println ("Потребуется дней: + 3 суток");}
        }
        }
        int monthNumber = 12;
        switch (monthNumber){
        case 1:
        System.out.println("Январь");
        break;
        case 2:
        System.out.println("Февраль");
        break;
        case 3:
        System.out.println("Март");
        break;
        case 4:
        System.out.println("Апрель");
        break;
        case 5:
        System.out.println("Май");
        break;
        case 6:
        System.out.println("Июнь");
        break;
        case 7:
        System.out.println("Июль");
        break;
        case 8:
        System.out.println("Август");
        break;
        case 9:
        System.out.println("Февраль");
        break;
        case 10:
        System.out.println("Февраль");
        break;
        case 11:
        System.out.println("Февраль");
        break;
        case 12:
        System.out.println("Февраль");
        break;
        case 13:
        System.out.println("Такого месяца не существует");
        break;
        }
        }











