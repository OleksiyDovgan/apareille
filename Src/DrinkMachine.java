public enum DrinkMachine{

        COFFEE(2.5),
        TEA(1.8),
        LEMONADE(2.0),
        MOJITO(3.0),
        MINERAL_WATER(1.5),
        COCA_COLA(2.2);

        private double price;

        DrinkMachine(double price) {
                this.price = price;
        }

        public double getPrice() {
                return price;
        }
}

