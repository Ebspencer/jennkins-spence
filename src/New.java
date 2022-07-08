import java.util.*;

public class New {


        public static void main(String...args) {
            List<String> cities = new ArrayList<>();
            cities.add("Poznan");
            cities.add("Warsaw");
            cities.add("Wroclaw");
            cities.add("Lublin");
            cities.add("Krakow");
            cities.add("Gdansk");
            cities.add("Katowice");
            System.out.println("please choose a city");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "poznan":
                    System.out.println("your choice Poznan");
                    break;
                case "warsaw":
                    System.out.println("your choice Warsaw ");
                    break;
                case "wroclaw":
                    System.out.println("your choice Wroclaw ");
                    break;
                case "krakow":
                    System.out.println("your choice Krakow ");
                    break;
                case "gdansk":
                    System.out.println("your choice Gdansk ");
                    break;
                case "lublin":
                    System.out.println("your choice Lublin ");
                    break;
                case "katowice":
                    System.out.println("your choice Katowice ");
                    break;
                default:
                    System.out.println("");
            }
        }}


