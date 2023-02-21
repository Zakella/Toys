package view;

import model.Toy;

import java.util.List;

public class ToyViewer {

    public void showToyBox(List<Toy> toyList) {

        System.out.println("Here added toys in box");

        printWhatInBox(toyList);

    }

    public void showPrizeToy(Toy toy) {
        System.out.printf("Your prize toy is %s%n", toy.getSummary());
        System.out.println("---------------------");}

    public void showRemainingToys(List<Toy> toyList) {

        if (toyList.size() > 0){
            System.out.println("Leftover toys in the box");

        }else System.out.println("There is no toys in box.The draw is over");

        printWhatInBox(toyList);



    }

    public void printWhatInBox(List<Toy> toyList) {


        toyList.forEach(System.out::println);
        System.out.println("---------------------");
    }
}
