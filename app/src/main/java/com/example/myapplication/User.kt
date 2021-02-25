package com.example.myapplication

class User(val id:Int, val name:String,val login:String,val password :String,val text:String) {
    override fun toString(): String {
        return "Id: $id \nName: $name \nWord:$text"
    }
}