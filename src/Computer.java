import java.util.Random;
import java.util.Scanner;

    public class Computer {
        String CPU;
        int RAM;
        int HDD;
        int resource;

        public Computer(String CPU, int RAM, int HDD, int resource) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.HDD = HDD;
            this.resource = resource;
        }


        public boolean turnOn() {
            boolean a = false;
            Random random = new Random();
            System.out.println("Введите 0 или 1 ");
            Scanner scanner = new Scanner(System.in);
            int n = random.nextInt(2);
            System.out.println(n);
            int x = scanner.nextInt();
            while (x == 0 || x == 1) {
                if (x == n) {
                    System.out.println("Компьютер включен");
                    a = true;
                    break;
                } else if (x != n) {
                    System.out.println("Компьютер сгорел(");
                    a = false;
                    break;
                }
            }
            return a;
        }

        public boolean turnOff() {
            boolean b = true;
            Random random = new Random();
            System.out.println("Введите 1 или 0 ");
            Scanner scanner = new Scanner(System.in);
            int n1 = random.nextInt(2);
            System.out.println(n1);
            int y = scanner.nextInt();
            while (y == 0 || y == 1) {
                if (y == n1) {
                    System.out.println("Компьютер выключен");
                    b = true;
                    break;
                }
                if (y != n1) {
                    System.out.println("Компьютер сгорел(");
                    b = false;
                    break;
                }
            }
            return b;
        }
    }
