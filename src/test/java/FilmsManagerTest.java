import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void testfindAll() {

        FilmsManager manager = new FilmsManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilms() {
        FilmsManager manager = new FilmsManager(10);
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOneFilm() {

        FilmsManager manager = new FilmsManager();

        manager.addMovie("Film 1");
        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testZeroFilms() {

        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

        @Test
        public void findLastMore() {
            FilmsManager manager = new FilmsManager(10);
            manager.addMovie("Film 1");
            manager.addMovie("Film 2");
            manager.addMovie("Film 3");
            manager.addMovie("Film 4");
            manager.addMovie("Film 5");
            manager.addMovie("Film 6");
            manager.addMovie("Film 7");
            manager.addMovie("Film 8");
            manager.addMovie("Film 9");
            manager.addMovie("Film 10");
            manager.addMovie("Film 11");

            String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
            String[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
    }
}