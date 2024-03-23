package ru.job4j.oop;

public class Error {
    private boolean isCritical;
    private int status;
    private String description;

    public Error() {}

    public Error(boolean isCritical, int status, String description) {
        this.isCritical = isCritical;
        this.status = status;
        this.description = description;
    }

    public void printInfo() {
        System.out.println("Критическая ошибка? : "+ isCritical);
        System.out.println("Статус код : " + status + " ошибки");
        System.out.println("Описание ошибки : " + description);
    }
    public static void main(String[] args) {
        Error err = new Error(false, 400, "BadRequest exception");
        err.printInfo();
        Error second = new Error(true, 500, "Internal server error");
        second.printInfo();
        Error third = new Error();
        third.printInfo();
    }
}
