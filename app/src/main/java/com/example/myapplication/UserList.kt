package com.example.myapplication

class UserList(var userList: MutableList<User>) {

    fun FindUser(login:String,password:String):String {
        userList.forEach {
            if (it.login==login){
                if (it.password==password)
                {
                    return it.toString()
                }
            }
        }
        return "Erroy login or password!!!"
    }

    fun AddList(name:String,login: String,password: String,word:String):String{
        if(FindLogin(login)==false) {
            userList.add(User(userList.last().id + 1, name, login, password, word))
            return "New User!!!!!"
        }else return "Login is busy"
    }

    fun FindLogin(login: String):Boolean
    {
        userList.forEach {
            if (it.login==login){
                return  true
            }
        }
        return false
    }
}