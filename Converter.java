public class Converter {
    double distancy;
    long energy;
    int step;




    public void convert(int step) {
        distancy = step * 0.75;
        System.out.println("Пройденная дистанция" + distancy + "км");
        energy = step * 50000;
        System.out.println("Колличество соженных килокаллорий" + energy);

    }


}




