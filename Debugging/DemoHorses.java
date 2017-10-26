public class DemoHorses {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.setName("Heisenberg");
        horse1.setColor("brown");
        horse1.setBirthYear(2015);
        System.out.println("horses name is" + horse1.getName() + "and is" + horse1.getColor() + "was born in" + horse1.getBirthYear());
    }
}
