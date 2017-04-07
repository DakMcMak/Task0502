public class Cat {
        public String name;
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            int b = 0;
            int c = 0;

            if (age > anotherCat.age) {
                b = b + 1;
            }  if (weight > anotherCat.weight) {
                b = b + 1;
            } else if (strength > anotherCat.strength) {
                b = b + 1;
            }
                return true;

        }

        public static void main(String[] args) {
            Cat cat1 = new Cat();
            cat1.name = "Borz";
            cat1.age = 5;
            cat1.weight = 6;
            cat1.strength = 61;

            Cat cat2 = new Cat();
            cat2.name = "vaska";
            cat2.age = 5;
            cat2.weight = 6;
            cat2.strength = 61;

            System.out.println(cat2.fight(cat1));

        }
    }

