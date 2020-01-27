package com.github.skjolber.packing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import py4j.GatewayServer;

public class BinPacker {

    public static void main(String[] args) {
        // initialization
        List<Container> containers = new ArrayList<Container>();
//        containers.add(new Container("Foot container", 6, 10, 3, 100));
//        containers.add(new Container("Leg container", 4, 10, 2, 100));
//        containers.add(new Container("Arm container", 4, 10, 3, 100))
        containers.add(new Container(100, 100, 100, 9999999)); // x y z and weight


        for (String s : args) {
            System.out.println(s);
        }

//		containers.add(new Container(6, 10, 3, 100));
//		containers.add(new Container("poep", 10, 10, 3, 100));
//		containers.add(new Container("test-container",8, 10, 3, 100));
//		containers.add(new Container(10, 10, 3, 100)); // x y z and weight
        Packager packager = BruteForcePackager.newBuilder().withContainers(containers).build();


        List<BoxItem> products = new ArrayList<BoxItem>();
//        products.add(new BoxItem(new Box("Foot", 6, 10, 2, 25), 1));
//        products.add(new BoxItem(new Box("Leg", 4, 10, 1, 25), 1));
//        products.add(new BoxItem(new Box("Arm", 4, 10, 2, 50), 1));
        products.add(new BoxItem(new Box("Box", 4, 50, 43, 1), 116));

        // match a single container
        Container match = packager.pack(products);
        System.out.println(
                match
        );
//        int maxContainers = 4; // maximum number of containers which can be used
//
//        long deadline = System.currentTimeMillis() + 5000;
//
//        // match multiple containers
//        List<Container> fits = packager.packList(products, maxContainers, deadline);
//
//        Container test = fits.get(0);

//        System.out.println(
//                fits
//        );
//        System.out.println(
//                test.getClass()
//        );
//        System.out.println(
//                test.name
//        );


//        return fits;

    }
}


