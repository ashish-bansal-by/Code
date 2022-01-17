import SortCollection.model.Address;
import SortCollection.model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfUsers = 3;
        String first_name, last_name, phoneNumber, city, state, country;
        List<User> users = new ArrayList<>();
        while (numberOfUsers > 0) {
            System.out.println("Enter User Details");
            numberOfUsers--;
            first_name = sc.nextLine();
            last_name = sc.nextLine();
            phoneNumber = sc.nextLine();
            city = sc.nextLine();
            state = sc.nextLine();
            country = sc.nextLine();
            users.add(new User(first_name, last_name, phoneNumber, new Address(city, state, country)));
        }
        users.stream().sorted(Comparator.comparing(User::getFirstName)
        ).forEach(System.out::println);
    }
}
