import reflection.goat.Goat;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {

//        Object goat = new Goat("goat");
//        Class<?> clazz = goat.getClass();
//
//        System.out.println(clazz.getSimpleName());
//        System.out.println(clazz.getName());
//        System.out.println(clazz.getCanonicalName());

        Class<?> goatClass = Class.forName("reflection.goat.Goat");
        Class<?> animalClass = Class.forName("reflection.Animal");

        int goatMods = goatClass.getModifiers();
        int animalMods = animalClass.getModifiers();

        System.out.println(Modifier.isPublic(goatMods));
        System.out.println(Modifier.isAbstract(animalMods));
        System.out.println(Modifier.isPublic(animalMods));

        Class<?> goatSuperClass = goatClass.getSuperclass();
        System.out.println(goatSuperClass.getSimpleName());
        System.out.println("some string".getClass().getSuperclass().getSimpleName());

        Class<?>[] goatInterfaces = goatClass.getInterfaces();
        Class<?>[] animalInterfaces = animalClass.getInterfaces();
        System.out.println(goatInterfaces[0].getSimpleName());
        System.out.println(animalInterfaces[0].getSimpleName());

//        Constructor<?>[] constructors = goatClass.getConstructors(); //меняем
        Constructor<?>[] constructors = goatClass.getDeclaredConstructors();
        System.out.println(constructors[0].getName());

        Field[] fields = animalClass.getDeclaredFields();
        List<String> actualFields = Arrays.stream(fields).map(Field::getName).toList();
        actualFields.forEach(System.out::println);

        constructors[0].setAccessible(true);
        Constructor<?> cons2 = goatClass.getDeclaredConstructor(String.class);
        cons2.setAccessible(true);
        Goat antoshka = (Goat) constructors[0].newInstance("Antoshka");
        antoshka.getLocomotion();
        antoshka.getSound();

        Field nameField = goatClass.getSuperclass().getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println(nameField.get(antoshka));

        nameField.set(antoshka, "Mohammad");
        antoshka.printName();

        Method secretMethod = goatClass.getDeclaredMethod("sayYourSecretName");
        secretMethod.setAccessible(true);
        secretMethod.invoke(antoshka);

        Method verySecretMethod = goatClass.getDeclaredMethod("sayYourVerySecretName", int.class);
        verySecretMethod.setAccessible(true);
        verySecretMethod.invoke(antoshka, 1111);
        verySecretMethod.invoke(antoshka, 9999);



    }
}