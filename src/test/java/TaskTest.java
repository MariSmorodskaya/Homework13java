import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");

        boolean actual = task.matches("родителям");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");

        boolean actual = task.matches("бабушке");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesShouldFindEpicTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");
        Assertions.assertTrue(actual);

    }

    @Test
    public void testMatchesShouldFindEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Лимон");
        Assertions.assertFalse(actual);

    }

    @Test
    public void testMatchesShouldFindMeetingTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertTrue(actual);

    }

    @Test
    public void testMatchesShouldFindMeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean actual = meeting.matches("Тренировка");
        Assertions.assertFalse(actual);

    }

    @Test
    public void testShouldFindEpicMatchesTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");
        Assertions.assertTrue(actual);

    }

    @Test
    public void testShouldFindEpicMatchesFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Лимон");
        Assertions.assertFalse(actual);

    }

    @Test
    public void testSshouldFindMeetingMatchesTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertTrue(actual);

    }

    @Test
    public void testShouldFindMeetingMatchesFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean actual = meeting.matches("Тренировка");
        Assertions.assertFalse(actual);

    }
}





