interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land using a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by water using a ship.");
    }
}

class Drone implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by air using a drone.");
    }
}

abstract class TransportFactory {
    abstract Transport createTransport(String type);
}

class DeliveryFactory extends TransportFactory {
    @Override
    Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "land":
                return new Truck();
            case "water":
                return new Ship();
            case "air":
                return new Drone();
            default:
                throw new IllegalArgumentException("Unknown delivery type.");
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        TransportFactory factory = new DeliveryFactory();

        Transport transport1 = factory.createTransport("land");
        transport1.deliver();

        Transport transport2 = factory.createTransport("water");
        transport2.deliver();

        Transport transport3 = factory.createTransport("air");
        transport3.deliver();
    }
}
