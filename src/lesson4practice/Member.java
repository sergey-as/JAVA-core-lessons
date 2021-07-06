package lesson4practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Member {
    private int id;
    private String name;
    private HashSet<Pet> pets = new HashSet<>();

    public Member() {
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Pet> getPets() {
        return pets;
    }

    public void setPets(HashSet<Pet> pets) {
        this.pets = pets;
    }

    public void setPet(Pet pet) {
        this.pets.add(pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name);
    }

    public static Member chooseMember(Set<Member> memberSet) {
        System.out.println("Members:");
        for (Member member : memberSet) {
            System.out.printf("id: %s, name: %s\n", member.getId(), member.getName());
        }
        System.out.println("Enter member id:");
        int memberId = 0;
        try {
            memberId = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Not correct id");
        }

        Member currentMember = null;
        for (Member member : memberSet) {
            if (member.getId() == memberId) {
                currentMember = member;
                break;
            }
        }
        if (currentMember == null) {
            System.out.printf("Not found member with id %s\n", memberId);
        }
        return currentMember;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
