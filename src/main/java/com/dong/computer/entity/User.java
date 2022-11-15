package com.dong.computer.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    int id ;
    String name ;
    String password ;

}
