package Calisma;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(int salary) {
        if (salary > 1000) {
            salary = salary - ((salary / 100) * 3);            
        }
        System.out.println(salary);
    }

    void bonus(int WorkHours, int extra) {
        if (workHours > 40) {
            workHours = workHours - 40;
            extra = workHours * 30;
        }
        System.out.println(extra);
    }

    void raiseSalary(int hireYear, int workYear) {
        hireYear = 2021;
        workYear = workYear - hireYear;

        if (workYear < 10) {
            salary = salary + ((salary / 100) * 5); 
        } else if (workYear > 9 && workYear < 20) {
            salary = salary + ((salary / 100) * 10);
        } else if (workYear > 19) {
            salary = salary + ((salary / 100) * 15);
        }
    }

    public toString() {
        System.out.print("Adi: " + this.name);
        System.out.print("Maasi: " + this.salary);
        System.out.print("Calisma Saati: " + this.workHours);
        System.out.print("Baslangic Yili: " + this.hireYear);
        System.out.print("Vergi: " + tax());
        System.out.print("Bonus: " + bonus());
        System.out.print("Maas Artisi: " + raiseSalary());
        System.out.print("Vergi ve bonuslar ile maas: " + ((salary - tax()) + bonus());
        System.out.print("Toplam maas: " + (salary + raiseSalary()));
    }
}
