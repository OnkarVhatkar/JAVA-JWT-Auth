package com.vonkar.jwtauthjpa.enumerator;

public enum UserRole{
    User(1,"User"),
    Admin(2,"Admin");

    int key;
    String value;

    UserRole(int key,String value){
        this.key = key;
        this.value = value;
    }

    public boolean contains(String role){
        for(UserRole userRole :UserRole.values()){
            if(userRole.value.equals(role)){
                return true;
            }
        }
        return false;
    }
}