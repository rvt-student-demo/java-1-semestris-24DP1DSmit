package main.java.rvt;

public class Overloaded {
    public class Product {
        private String name;
        private String location;
        private int weight;

        public Product(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public Product(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Product(String name, String location, int weight) {
            this.name = name;
            this.location = location;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return this.name + " (" + this.weight + " kg) can be found from " + this.location;
        }
    }
}
