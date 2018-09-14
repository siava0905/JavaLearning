package com.sale.backend.initModel;

import com.sale.backend.model.User;

import java.awt.*;
import java.util.ArrayList;

public class InitModels {
    public ArrayList <User> initUserModel (){
        ArrayList <User> initList = new ArrayList <User> ();
        User newUser;


        newUser = new User();
        //
        newUser.setUserId(1);
        newUser.setName("Olaf");
        newUser.setAddress("");
        newUser.setEmeil("");
        newUser.setPhone("");

        initList.add(newUser); // Добавление в результирующий лист (список)

        //_______________________________________________________________________________________

        newUser = new User(2, "Masha", "", "", "");
        initList.add(newUser); // Добавление в результирующий лист

        newUser = new User(3, "Andrei", "", "", "");
        initList.add(newUser); // Добавление в результирующий лист

        newUser = new User(4, "Maxim", "", "", "");
        initList.add(newUser); // Добавление в результирующий лист


        initList.add(new User(5, "Misha", "", "", "")); // Добавление в результирующий лист

        initList.add(new User(5, "Misha", "", "", ""));

        initList.add(new User(5, "Misha", "", "", ""));




        return initList;
    }
}
