class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    public House(HouseBuilder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House [Rooms=" + numRooms + ", Floors=" + numFloors + 
               ", Pool=" + hasPool + ", Garage=" + hasGarage + "]";
    }

    static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public HouseBuilder setRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public HouseBuilder setFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public HouseBuilder setPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                             .setRooms(3)
                             .setFloors(2)
                             .setPool(true)
                             .setGarage(false)
                             .build();
                             
        System.out.println(house);
    }
}
