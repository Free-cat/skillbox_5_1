import java.util.ArrayList;
import java.util.Random;

public class AveragePatientTemperature {

    public static void main(String[] args) {
        double minTemperature = 32;
        double maxTemperature = 40;
        double[] temperatures = generateRandomPatients(minTemperature, maxTemperature);

        ArrayList<Double> goodPatients = new ArrayList<Double>();
        double patientAllTemperature = 0;
        for (double temperature : temperatures) {
            patientAllTemperature += temperature;

            if (temperature > 36.2 && temperature < 36.9) {
                goodPatients.add(temperature);
            }
        }
        printGoodPatients(goodPatients);

        System.out.println(String.format("Средняя температура: %.2f C\u00b0", patientAllTemperature/temperatures.length));
    }

    private static double[] generateRandomPatients(double minTemperature, double maxTemperature){
        double[] temperatures = new double[30];
        Random r = new Random();

        for(int i = 0; i < temperatures.length; i++){
            double randomTemperature = r.nextDouble() * (maxTemperature - minTemperature) + minTemperature;
            System.out.println(String.format("Пациент %d - %.2f C\u00b0", i, randomTemperature));
            temperatures[i] = randomTemperature;
        }

        return temperatures;
    }

    private static void printGoodPatients(ArrayList<Double> goodPatients){
        if (goodPatients.size() > 0){
            System.out.println("Температура здоровых пациентов: ");
            for(double goodPatient : goodPatients){
                System.out.println(String.format(" - %.2f C\u00b0", goodPatient));
            }
        }else{
            System.out.println("Здоровых пациентов нет");
        }
    }
}
