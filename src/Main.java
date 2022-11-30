public class Main {
    public static void main(String[] args) {
        // задание 6
        System.out.println("задание 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("общий вес двух бойцов " + (boxer1Weight + boxer2Weight));
        System.out.println("разница весов двух бойцов " + (boxer2Weight - boxer1Weight));
        // задание 7
        System.out.println("задание 7");
        System.out.println("разница весов двух бойцов(1 способ) " + (boxer2Weight - boxer1Weight));
        System.out.println("разница весов двух бойцов(2 способ) " + (boxer2Weight - boxer1Weight));
        // задание 8
        System.out.println("задание 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("если в компании работает " + totalEmployees + " человека, то всего "+ totalWorkingHours +" часа может быть поделено между сотрудниками");




    }
}