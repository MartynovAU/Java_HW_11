import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Affiche;
import ru.netology.managers.FilmManager;

public class FilmManagerTest {
    Affiche one = new Affiche(1, "Bladshot", "action");
    Affiche two = new Affiche(2, "Vpered", "cartoon");
    Affiche three = new Affiche(3, "Belgrad", "comedy");
    Affiche four = new Affiche(4, "Jentelmans", "action");
    Affiche five = new Affiche(5, "Voina", "drama");
    Affiche six = new Affiche(6, "Brat", "Drama");
    Affiche seven = new Affiche(7, "Zhmurki", "drama");
    Affiche eight = new Affiche(8, "Morfiy", "drama");
    Affiche nine = new Affiche(9, "Kochegar", "criminal drama");
    Affiche ten = new Affiche(10, "Brigada", "criminal drama");
    Affiche eleven = new Affiche(11, "Mne ne bolno", "melodrama");


    @Test
    public void testFindLastStandardLessThanTen() {
        FilmManager manager = new FilmManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);


        Affiche[] actual = manager.findLast();
        Affiche[] expected = {nine, eight, seven, six, five, four, three, two, one};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithConst() {

        FilmManager manager = new FilmManager(3);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        Affiche[] actual = manager.findLast();
        Affiche[] expected = {eleven, ten, nine};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastStandard() {
        FilmManager manager = new FilmManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        Affiche[] actual = manager.findLast();
        Affiche[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Assertions.assertArrayEquals(expected, actual);
    }
}