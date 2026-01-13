package ch19_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();
        List<String> fieldTrips = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            String trip = scanner.nextLine();
            fieldTrips.add(trip);
        }
        System.out.println();
        for (int i = 0; i < fieldTrips.size(); i++) {
            System.out.println((i + 1) + " 번 학생의 후보지 : " + fieldTrips.get(i));
        }
        Set<String> fieldTripSet = new HashSet<>(fieldTrips);
        List<String> finalFieldTrips = new ArrayList<>(fieldTripSet);
        System.out.println();
        System.out.println("수학 여행 후보지는");
        for (String trip : finalFieldTrips) {
            System.out.println(trip);
        }
        System.out.println("입니다.");
    }
}
