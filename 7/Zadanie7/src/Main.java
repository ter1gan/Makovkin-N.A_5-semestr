//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Building building = new Builder("Жилой")
                .setFloors(10)
                .setArea(2500.5)
                .setColor("Голубой")
                .build();

        System.out.println(building);
    }
}
