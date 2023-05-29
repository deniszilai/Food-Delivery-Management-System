package ro.tuc.tp.start;

import ro.tuc.tp.bll.DeliveryService;
import ro.tuc.tp.data.Authenticator;
import ro.tuc.tp.data.Serializator;
import ro.tuc.tp.presentation.Controller;


public class App {

    public static void main(String[] args) {
        DeliveryService ds = Serializator.deserialization();
        Authenticator auth = Serializator.deserializationAuth();

        Controller a = new Controller(ds, auth);
        Controller c = new Controller(ds, auth);
        Controller e = new Controller(ds, auth);
        ds.addObserver(a.getEp());
        ds.addObserver(c.getEp());
        ds.addObserver(e.getEp());


    }
}
