package test;

public class TextString {

    static class Animal {

        private int id;
        private int leg;

        public Animal() {

        }

        public Animal(int id, int leg) {

            this.id = id;
            this.leg = leg;
        }

        public String getId() {
            String value = this.id + "," + this.leg;
            return value;
        }

        public void setId(int id,int leg) {
            this.id = id;
            this.leg = leg;
        }

    }

    public static void main(String[] args) {

        Animal dog = new Animal(1, 4);

        Animal cat = new Animal();

        cat.setId(2, 3);
        System.out.println(cat.getId());

        System.out.println(dog.leg);
        System.out.println(cat.leg);






    }
}