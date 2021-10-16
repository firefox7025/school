import java.util.*;

public class IT232_Montgomery_Unit4 {

    public static void main(String[] args) {
        section1();
        section2();
        section3();
        section4();
        section5();
    }

    //*********************************************************
    //****Assignment 4 Section 1
    //*********************************************************
    public static void section1() {
        System.out.println("Section 1: Array of Structures.");
        Car[] cars = new Car[] {
                new Car("Ford", "Mustang", 2010),
                new Car("Chevrolet", "Silverado", 2008),
                new Car("Dodge", "Charger", 2012)
        };
        Arrays.stream(cars).forEach(System.out::println);
    }

    //*********************************************************
    //****Assignment 4 Section 2
    //*********************************************************
    public static void section2() {
        System.out.println("Section 2: Inventory Count.");
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Mustang", 9);
        inventory.put("Silverado", 13);
        inventory.put("Charger", 4);
        inventory.forEach((key, value) -> System.out.println("There are " + value  + " " + key + "s."));
    }

    //*********************************************************
    //****Assignment 4 Section 3
    //*********************************************************
    public static void section3() {
        System.out.println("Section 3: Days of the Week.");
        List<String> daysOfWeek = new ArrayList<>(
                Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        );
        for(String day : daysOfWeek) {
            System.out.println(day);
        }

        List<String> workDays = new ArrayList<>();
        for(String day : daysOfWeek) {
            if (!day.equals("Saturday") && !day.equals("Sunday")) {
                workDays.add(day);
            }
        }

        Collections.reverse(daysOfWeek);
        for(String day : daysOfWeek) {
            System.out.println(day);
        }

        for(String day : workDays) {
            System.out.println(day);
        }
    }

    //*********************************************************
    //****Assignment 4 Section 4
    //*********************************************************
    public static void section4() {
        System.out.println("Section 4: Stack.");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(24);
        stack.push(31);
        stack.push(45);
        stack.push(19);
        stack.push(76);
        System.out.println("There are " +  stack.size()  + " items in the stack.");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("There are " +  stack.size()  + " items in the stack.");
        System.out.println("The next item to be popped from the stack is " + stack.peek() + ".");
    }

    //*********************************************************
    //****Assignment 4 Section 5
    //*********************************************************
    public static void section5() {
        System.out.println("Section 5: Queue");
        Queue<Integer> queue = new ArrayDeque<>();
        queue.addAll(List.of(10, 24, 31, 45, 19, 76));
        System.out.println("There are " + queue.size() + " items in the queue.");
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println("There are " + queue.size() + " items in the queue.");
        System.out.println("The next item to be dequeued from the queue is " + queue.peek() + ".");
    }


    private static class Car {
        private String make;
        private String model;
        private Integer year;

        @Override
        public String toString() {
            return make + ", " + model + ", " + year;
        }

        public Car(String make, String model, Integer year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }
    }
}
