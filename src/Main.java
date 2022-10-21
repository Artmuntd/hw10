public class Main {
    public static void main(String[] args) {

        System.out.println("задача 1");
        String firstName = "Ivan";
        String midleName =  "Ivanovich";
        String lastName = "Ivanov";
        String fullName =  lastName+ " " + firstName + " " +  midleName;
        System.out.println("ФИО сотрудника -  " + fullName);

        System.out.println("задача 2");
        String upperName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета  - " + upperName);

        System.out.println("задача 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fixName = fullName2.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fixName);


    }
}