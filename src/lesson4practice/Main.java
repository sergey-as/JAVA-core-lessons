package lesson4practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Створити  Зооклуб.
        // В мейн методі створити меню, яке буде реалізовувати наступні функції:
        //1) додати учасника в клуб;
        //2) додати тваринку до учасника клубу.
        //3) видалити тваринку з власника.
        //4) видалити учасника клубу.
        //5) вивести усіх тваринок конкретного власника
        //6) вивести на екран зооклуб.
        //
        //для вводу інформації з клавіатури выкористовуємо Scanner
        //якщо не знаєте як то дивимося тут:
        //https://leodev.ru/blog/java-faq/chapter-2-the-basics-of-java-programming/%D0%BA%D0%BE%D0%BD%D1%81%D0%BE%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9-%D0%B2%D0%B2%D0%BE%D0%B4%D0%B2%D1%8B%D0%B2%D0%BE%D0%B4-%D0%B2-java/#.YNyIQWdRWV4

        String menu = "Zoo club:" + "\n" +
                "1 - add member; 2 - add pet to member; 3 - delete pet from member; " +
                "4 - delete member; 5 - show pets of member; 6 - show Zoo club; 0 - exit";

        Set<Member> memberSet = new HashSet<>();

        Scanner in = new Scanner(System.in);

        int choice = 7;
        Member currentMember;

        while (choice != 0) {
            switch (choice) {
                case (1)://1 - add member
                    int id = memberSet.size() + 1;
                    System.out.println("Enter name:");
                    String name = new Scanner(System.in).nextLine();
                    memberSet.add(new Member(id, name));
                    System.out.println("Member added");
                    break;
                case (2)://2 - add pet to member
                    currentMember = Member.chooseMember(memberSet);
                    if (currentMember != null) {
                        int idPet = currentMember.getPets().size() + 1;
                        System.out.println("Enter name of Pet:");
                        String namePet = new Scanner(System.in).nextLine();
                        currentMember.getPets().add(new Pet(idPet, namePet));
                        System.out.println("Pet added");
                    }
                    break;
                case (3)://3 - delete pet from member
                    currentMember = Member.chooseMember(memberSet);

                    if (currentMember != null) {
                        HashSet<Pet> pets = currentMember.getPets();
                        System.out.println("Pets:");
                        for (Pet pet : pets) {
                            System.out.printf("id: %s, name: %s\n", pet.getId(), pet.getName());
                        }
                        System.out.println("Enter pet id to delete:");
                        int petId = new Scanner(System.in).nextInt();

                        final Iterator<Pet> iterator = pets.iterator();
                        int newId = 0;
                        while (iterator.hasNext()) {
                            final Pet pet = iterator.next();
                            if (pet.getId() == petId) {
                                iterator.remove();
                                System.out.println("Pet deleted");
                            } else {
                                pet.setId(++newId);
                            }
                        }
                    }
                    break;
                case (4)://4 - delete member
                    currentMember = Member.chooseMember(memberSet);
                    if (currentMember != null) {
                        final Iterator<Member> iterator = memberSet.iterator();
                        int newId = 0;
                        while (iterator.hasNext()) {
                            final Member member = iterator.next();
//                            if (member.equals(currentMember)) {
                            if (member == currentMember) {
                                iterator.remove();
                                System.out.println("Member deleted");
                            } else {
                                member.setId(++newId);
                            }
                        }
                    }
                    break;
                case (5)://5 - show pets of member
                    currentMember = Member.chooseMember(memberSet);

                    if (currentMember != null) {
                        HashSet<Pet> pets = currentMember.getPets();
                        System.out.println("Pets of :"+currentMember.getName());
                        for (Pet pet : pets) {
//                            System.out.printf("id: %s, name: %s\n", pet.getId(), pet.getName());
                            System.out.println(pet);
                        }
                    }
                    break;
                case (6)://6 - show Zoo club
                    for (Member member : memberSet) {
                        System.out.println(member);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(menu);
            System.out.println("Make your choice");
            choice = in.nextInt();
//            System.out.println(choice);
        }
    }

}
