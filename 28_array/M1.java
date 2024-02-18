class A {
    public static void main(String[] args) {
        Employee[][] x = new Employee[2][];

        x[0] = new Employee[] {
                                new Employee("om1",12, new Salary(new Basic(1800), new Bonus(2000))),
                                new Employee("om2",13, new Salary(new Basic(2200), new Bonus(3000)))
                            };

        x[1] = new Employee[] {
                                new Employee("om3",14, new Salary(new Basic(2400), new Bonus(4000))),
                                new Employee("om4",15, new Salary(new Basic(2800), new Bonus(5000))),
                                new Employee("om5",16, new Salary(new Basic(4200), new Bonus(6000)))
                            };

        System.out.println(x[1][1].salary.basic.dA);       // UP
        System.out.println(x[0][1].salary.bonus.adv);      // nag
    }
}

class Employee {
    String name;
    int age;
    Salary salary;

    Employee(String name, int age, Salary salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class Salary {
    Basic basic;
    Bonus bonus;

    Salary(Basic basic, Bonus bonus) {
        this.basic = basic;
        this.bonus = bonus;
    }
}

class Basic {
    int dA;

    Basic(int dA) {
        this.dA = dA;
    }
}

class Bonus {
    int adv;

    Bonus(int adv) {
        this.adv = adv;
    }
}