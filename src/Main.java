public class Main {
    public static void main(String[] args) {
        Computer computer= new Computer("Intel" ,12,12,5);
        for (int i = 0; i < computer.resource; i++){
            if (computer.turnOn() && computer.turnOff()){
                continue;
            } else {
                break;
            }
        }
    }
}

