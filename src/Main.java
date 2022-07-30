public class Main {
    public static void main(String[] args) {
        //Задание 1
         String firstName = "Ivan";
         String middleName = "Ivanovich";
         String lastName = "Ivanov";
         String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задание 3
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        if (fullName.contains ("ё")) {
            String fullNameRight = fullName.replace ("ё", "е");
            System.out.println(fullNameRight);
        }

        //задание 4
        fullName = "Ivanov Ivan Ivanovich";
        firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length ());
        lastName = fullName.substring(0, fullName.indexOf(" "));
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        //Задание 5
        fullName = "ivanov ivan ivanovich";
        firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length ());
        lastName = fullName.substring(0, fullName.indexOf(" "));
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — ");
        char [] lastNameChar = lastName.toCharArray();
        for (int i = 0; i < lastNameChar.length; i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase (lastNameChar[0]));
            } else if (i == lastNameChar.length - 1) {
                System.out.print(lastNameChar[i] + " ");
            } else {
                System.out.print(lastNameChar[i]);
            }
        }
        char [] firstNameChar = firstName.toCharArray();
        for (int i = 0; i < firstNameChar.length; i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase (firstNameChar[0]));
            } else if (i == firstNameChar.length - 1) {
                System.out.print(firstNameChar[i] + " ");
            } else {
                System.out.print(firstNameChar[i]);
            }
        }
        char [] middleNameChar = middleName.toCharArray();
        for (int i = 0; i < middleNameChar.length; i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase (middleNameChar[0]));
            } else if (i == middleNameChar.length - 1) {
                System.out.println(middleNameChar[i]);
            } else {
                System.out.print(middleNameChar[i]);
            }
        }
        //Задание 6
        StringBuilder a = new StringBuilder("123");
        StringBuilder b = new StringBuilder("456");
        a.append(b);
        System.out.println("Данные строки — " + a);

        //Задание 7
        String letters = "aabccddefgghiijjkk";
        char [] lettersChar = letters.toCharArray();
        for (int i = 0; i < lettersChar.length; i++) {
            if (i < lettersChar.length - 1 && lettersChar[i] == lettersChar[i + 1]) {
                System.out.print(lettersChar [i]);
            }

        }


    }
}