package io;

import OOP.inheritance.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by Юля on 15.04.2016.
 */
public class IOMain {

    public static void main(String[] args) {
       Person mike = new Person("Mike");
        Car myCar = new Car("BMW", 2015, mike);
        mike.setCar(myCar);
        myCar.setTenant(new Tenant("Nick"));
        save(myCar);
        Car deserializedCar = load();
        System.out.println(deserializedCar);
        //System.out.println(deserializedCar == myCar);
    }

    public static void save(Car car) {
        //our own classes has to implement interface serializable to be saved and readed
        //all classes in the ObjectOUTIN must be serializable
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp/car.dat"))) {
            objectOutputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car load() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("temp/car.dat"))) {
            return (Car) objectInputStream.readObject();
        } catch (IOException  | ClassNotFoundException e) {
            throw  new RuntimeException(e);
        }
    }

    private static void propertyExample() {
        //property files *.Property use for program settings
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream("temp/settings.properties")) {
            properties.load(inputStream);
            String db = properties.getProperty("Db");
            String password = properties.getProperty("password");
            int timeout = Integer.parseInt(properties.getProperty("timeout"));

            System.out.println(db + " " + password + " " + timeout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void objectOutInPutStream() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp/objectOutputStream.txt"))) {
            int[] date = new int[]{15, 4, 2016};

            objectOutputStream.writeObject(date);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("temp/objectOutputStream.txt"))) {
                int[] date = (int[]) objectInputStream.readObject();
                System.out.println(Arrays.toString(date));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void primitiveTypeWriterAndReader() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("temp/filePrimitives.dat"))) {
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(04);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("temp/filePrimitives.dat"))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedReader() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("temp/myFile.txt"), "windows-1251"))) {
            String value;
            while ((value = reader.readLine()) != null) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithWindows1251() {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("temp/myFile.txt"), "windows-1251")) {
            int value;
            while ((value = reader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileCopy() {

        //fileInputStream read bytes not symbols
        try (InputStream inputStream = new FileInputStream("temp/myFile.txt");
             OutputStream outputStream = new FileOutputStream("temp/myFile_copy.txt")) {

            int value;

            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileTryWithResources() {
        //does not need to close this inputStream cause of try with resources

        try (InputStream inputStream = new FileInputStream("temp/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("temp/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void filesAndPath() {
        System.out.println("yes\\no");

        File file = new File("e:\\temp");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        file.mkdirs();
        System.out.println(file.exists());

        File relativePath = new File("temp/myFile.txt");

        System.out.println(relativePath.exists());
        System.out.println(relativePath.getAbsolutePath());

        Path path = Paths.get("temp/myFile.txt");

        Path parent = path.getParent();

        //resolve is myFolder/MyFolder/file.txt
        Path resolve = parent.resolve(path);

        System.out.println("Parent : " + parent);

        System.out.println("Absolute path of path: " + path.toAbsolutePath());

        try {
            Files.createDirectory(path.getParent());
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        someMethodCaller();
    }

    public static void someMethodCaller() {
        someMethod(1, 2, 3, 56);
    }

    public static void someMethod(int i, Integer... integers) {
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
    }
}
