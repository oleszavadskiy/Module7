import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Олесь on 07.11.2016.
 */
public class TravelCalculator {
  public static void main(String args[]) throws IOException {

      String sConsump;
      String sDistance;
      String sNofDays;
      String sHotelCost;
      String sFuelCost;
      String sFoodCost;
      float nConsump;
      double nDistance;                                         // Засорение кода.. Переменные одного типа следует обьявить через кому.
      double nNofDays;
      double nHotelCost;
      double nFuelCost;
      double nFoodCost;
      double DailyExp;
      double HundredsQuant;
      double LittersNeed;
      double FuelSpent;
      double DaySpendQuan;
      double Sum;
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

          System.out.print("Введите расстояние путишествия Км: ");
          sDistance = reader.readLine();

          System.out.print("Введите средний расход топлива Литр/100 Км: ");
          sConsump = reader.readLine();

          System.out.print("Введите среднюю стоимость топлива Евро/Литр: ");
          sFuelCost = reader.readLine();

          System.out.print("Введите предпологаемое количество дней в пути: ");
          sNofDays = reader.readLine();

          System.out.print("Введите допустимую стоимость отеля для ночлега Евро: ");
          sHotelCost = reader.readLine();


          System.out.print("Введите необходимую сумму для питания на сутки Евро: ");
          sFoodCost = reader.readLine();
      }

      nConsump = Float.parseFloat(sConsump);
      nDistance = Double.parseDouble(sDistance);
      nNofDays = Double.parseDouble(sNofDays);
      nHotelCost = Double.parseDouble(sHotelCost);
      nFuelCost = Double.parseDouble(sFuelCost);
      nFoodCost = Double.parseDouble(sFoodCost);

      DailyExp = (nHotelCost + nFoodCost);                      //Волшебные слова...Непонятно о чем речь в расчетах.
                                                                //Можно назвать переменные понятным образом, что бы было понятно что конкретно считаеться.

      DaySpendQuan = (nNofDays * DailyExp);


      HundredsQuant = (nDistance / 100);
      LittersNeed = (HundredsQuant * nConsump);
      FuelSpent = (LittersNeed * nFuelCost);

      Sum = FuelSpent + DaySpendQuan;
      System.out.println("Общая стоимость путишевствия составляет " + Sum + " евро, или " + Sum * 28.4 + " грн. (Не включая платные дороги!)");

  }
  }



