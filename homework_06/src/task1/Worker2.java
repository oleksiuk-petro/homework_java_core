//Worker2 - це клас працівника із погодинною заробітньою платою
package task1;

public class Worker2 implements Salary {

    //оголошуємо поле класу (назва поля = назві інтерфейсу)
    private double salary;
    //оголошуємо поле класу (погодинна зарплата)
    private double hourlyRate;
    //оголошуємо поле класу (тривалість робочого часу)
    private double time;

    //створюємо конструктор класу
    //Alt + Insert -> Constructor (hourly_rate, time)
    public Worker2(double hourlyRate, double time) {
        this.hourlyRate = hourlyRate;
        this.time = time;
    }

    //перевизначаємо метод із Salary
    //Alt + Insert -> Override (salary)
    @Override
    public void salary() {
        salary = hourlyRate * time;
        System.out.println(salary);
    }

    //встановлюємо Get та Set для поля класу Worker2
    //Alt + Insert -> Getter and Setter (Salary, hourly_rate, time)

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
