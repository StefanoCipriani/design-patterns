package com.design.pattern.factory;


import com.design.pattern.factory.interfaces.HamburgerStore;
import com.design.pattern.factory.model.CheeseBurger;
import com.design.pattern.factory.model.Hamburger;
import com.design.pattern.factory.model.JamHamburgerstore;
import com.design.pattern.factory.model.MozHamburgerStore;

public class MainFactoryPattern {

    public static void main(String[] args) {

        CheeseBurger cheeseBurger = new CheeseBurger();
        
        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");




    }
}
