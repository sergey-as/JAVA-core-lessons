package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello okten");

        User user1 = new User(1, "John", "Doe", 85.324657987, true, new String[]{"java", "js"}, new String[]{"qaz"});
        System.out.println(user1);

//        User user2 = new User();
//        user2.id = 2;
//        user2.name = "Vasya";
//        user2.surname = "Pupkin";
//        user2.status = false;

        //3
        User user2 = new User();
        user2.setId(65484);
        user2.setName("Vasya");
        user2.setSurname("Pupkin");
        user2.setStatus(true);
        user2.setWeight(100);
        user2.setSkills(new String[]{"js", "html", "php"});
        System.out.println(user2);
        System.out.println(user2.getId());

//        User user3 = new User(3,"Kolya","Asdqwe",54.5, false, new String[]{"asd","qwe"},new String[]{"zxc"});
        String[] skills = new String[2];
        skills[0] = "java";
        skills[1] = "js";
        String[] phrases = new String[1];
        phrases[0] = "ZXC";
        User user3 = new User(3, "Kolya", "Asdqwe", 54.5, false, skills, phrases);
        System.out.println(user3);

        User[] users = {user1, user2, user3};
        System.out.println(Arrays.toString(users));

        System.out.println();

        //itar
        System.out.println("itar:");
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            System.out.println(user);
        }

        System.out.println();

        //iter
        System.out.println("iter");
        for (User user : users) {
            if (user.isStatus() && user.getSkills().length > 2) {
                System.out.println(user);
            }
        }

        System.out.println();
        System.out.println("while:");
        int counter = 0;
        while (counter < users.length) {
            User user = users[counter];
            counter++;
            System.out.println(user);
        }

    }
}
