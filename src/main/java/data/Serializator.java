import java.io.*;

public class Serializator {
    private static final String filenameDS = "fileDS.ser";
    private static final String filenameAuth = "fileAuth.ser";

    public static void serialization(DeliveryService ds) {
        try {
            FileOutputStream file = new FileOutputStream(filenameDS);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(ds);

            out.close();
            file.close();
            System.out.println("Object has been serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DeliveryService deserialization() {
        DeliveryService ds = null;
        try {
            FileInputStream file = new FileInputStream(filenameDS);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            ds = (DeliveryService) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");

        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Deserialization failed: " + e.getMessage());
        }
        return ds;
    }
}

