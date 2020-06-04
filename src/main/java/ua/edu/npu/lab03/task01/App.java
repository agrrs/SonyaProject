package ua.edu.npu.lab03.task01;

import java.util.ArrayList;

public class App {
    public static int ownerName(String ownName, ArrayList<PetOwner> owners) {
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getName().equals(ownName)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<PetOwner> ownersArray = new ArrayList<>();
        ownersArray.add(new PetOwner("Jack"));
        ownersArray.get(ownerName("Jack", ownersArray)).petAdd("Eagle", "Ollie", 2);
        ownersArray.get(ownerName("Jack", ownersArray)).showOwnedPets();
        ownersArray.add(new PetOwner("Mike"));
        ownersArray.get(ownerName("Mike", ownersArray)).petAdd("Cat", "Meowth", 4);
        ownersArray.get(ownerName("Jack", ownersArray)).petAdd("Fish", "Nemo", 1);
        ownersArray.get(ownerName("Jack", ownersArray)).showOwnedPets();
        ownersArray.get(ownerName("Mike", ownersArray)).showOwnedPets();
        ownersArray.get(ownerName("Jack", ownersArray)).petRemove("Nemo", 1);
        ownersArray.get(ownerName("Jack", ownersArray)).showOwnedPets();
    }


}
