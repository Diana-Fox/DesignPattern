package template_method.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        UserModel um1 = new UserModel("u1", "user1", 23);
        UserModel um2 = new UserModel("u2", "user2", 22);
        UserModel um3 = new UserModel("u3", "user3", 24);
        UserModel um4 = new UserModel("u4", "user4", 21);
        ArrayList<UserModel> list = new ArrayList<>();
        list.add(um1);
        list.add(um2);
        list.add(um3);
        list.add(um4);
        System.out.println("排序前~");
        printList(list);
        Comparator<UserModel> comparator = new Comparator<UserModel>() {
            @Override
            public int compare(UserModel o1, UserModel o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() == o2.getAge())
                    return 0;
                else
                    return -1;
            }
        };
        Collections.sort(list, comparator);
        System.out.println("排序后");
        printList(list);
    }

    private static void printList(ArrayList<UserModel> list) {
        for (UserModel um :
                list) {
            System.out.println(um);
        }
    }
}
