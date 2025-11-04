package patterns.factory_method.transport;

import patterns.factory_method.transport.Bicycle;
import patterns.factory_method.transport.Car;
import patterns.factory_method.transport.Transport;

public class TransportFactory {

    public Transport createTransport(String type) {

        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("bicycle")) {
            return new Bicycle();
        }
        return null;
    }
}
