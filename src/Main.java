import controller.ToyController;
import model.Toy;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        ToyController toyController = new ToyController();
        List<Toy> toys = List.of(
                new Toy(1, "Teddi Bear", 1, 1),
                new Toy(2, "Lol Doll", 1, 2),
                new Toy(3, "Superman", 1, 3),
                new Toy(4, "Barby", 1, 4),
                new Toy(5, "Lego", 1, 6)
        );

        toys.forEach(toyController::addToyInBox);
        toyController.showToyBox();
        for (int i = 0; i < toys.size(); i++) {
            toyController.play();

        }


    }
}