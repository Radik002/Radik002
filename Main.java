public class Main {

    public static void main(String[] args) {

        MagicBox<String> boxString = new MagicBox<>(5);
        boxString.add("Книга");
        boxString.add("Машина");
        boxString.add("Телефон");
        boxString.add("Ведро");
        boxString.add("Тетрадь");
        System.out.println(boxString.pick());

        MagicBox<Integer> boxInt = new MagicBox<>(6);
        boxInt.add(1);
        boxInt.add(2);
        boxInt.add(3);
        boxInt.add(4);
        boxInt.add(5);
        boxInt.add(6);
//        boxInt.add(7);
//        boxInt.add(8);
        System.out.println(boxInt.pick());
    }
}