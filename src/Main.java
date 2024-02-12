import java.util.Scanner;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        /*
        Кундорго enum тузунуз (Monday, Tuesday ...)
консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
Жуманын кундорун кыргыз тилинде корсотунуз.

Создайте enum дней (Monday, Tuesday ...)
Через консоль выберите один день -Если Monday тогда в консоль должен выходить "В понедельник у нас урок по Жава"
или если - Tuesday тогда "Во вторник у нас английский" и т.д. и так все должен выходить зависимо от дня.
Еще плюс дни недели еще должны быть переведены на кыргызский.
Комментарии
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the day of the week ");
        String days = scanner.nextLine();
        String [] array = new String[]{"MONDAY","TUESDAY","WEDNESDAY"};
        for (int i = 0; i < 1; i++) {
            if(days.equals(array[0])){
                Days.MONDAY.method();
            }if (days.equals(array[1])){
                Days.TUESDAY.method();

            } else if (days.equals(array[2])) {
                Days.WEDNESDAY.method();

            }

        }
        }}




