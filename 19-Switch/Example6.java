
public class Example6 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        String season=switch(month){
            case 11, 12, 1, 2 -> {
                System.out.println("cold month");
                yield "Winter";
            }
            case 3, 4, 5, 6 -> {
                System.out.println("hot month");
                yield "Summer";
            }
            case 7,8,9,10 -> {
                System.out.println("wet season");
                yield "Rainy";
            }
            default -> "Invalid Input";
            
        };
        System.out.println(season);
    }
}
