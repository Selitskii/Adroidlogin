package com.example.myapplication

import android.app.Activity
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    val userlist:MutableList<User> = mutableListOf(User(1,"Dima","Hegoolik","Dima","Age 21")
    )
    val userDateBase:UserList= UserList(userlist)

    lateinit var loginView:TextView
    lateinit var passwordView:TextView
    lateinit var textView:TextView
    lateinit var textRegView: TextView
    lateinit var  nameView:TextView
    lateinit var buttonView:Button
    lateinit var buttonRegView: Button
    lateinit var checkBoxStule1: CheckBox
    lateinit var checkBoxStule2: CheckBox
    lateinit var checkBoxStule3: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginView=findViewById(R.id.editTextTextPersonName)
        passwordView=findViewById(R.id.editTextTextPassword)
        textView=findViewById(R.id.text)
        buttonView=findViewById(R.id.button)
        buttonRegView=findViewById(R.id.button2)
        textRegView=findViewById(R.id.editTextTextPersonName2)
        nameView= findViewById(R.id.editTextTextPersonName3)
        checkBoxStule1=findViewById(R.id.checkBox)
        checkBoxStule2=findViewById(R.id.checkBox2)
        checkBoxStule3=findViewById(R.id.checkBox3)
        val activity:View=findViewById(R.id.activity)
        buttonView.setOnClickListener {
            val login = loginView.text.toString()
            val password = passwordView.text.toString()
            textView.text=userDateBase.FindUser(login,password)
            loginView.text=""
            passwordView.text=""
        }

        buttonRegView.setOnClickListener {
            val login = loginView.text.toString()
            val password = passwordView.text.toString()
            val word =textRegView.text.toString()
            val name = nameView.text.toString()
            textView.text=userDateBase.AddList(name, login, password, word)
            loginView.text=""
            passwordView.text=""
            textRegView.text=""
            nameView.text=""
        }
        checkBoxStule1.setOnCheckedChangeListener { buttonView2, isChecked ->
            if(isChecked){
                checkBoxStule2.isChecked=false
                checkBoxStule3.isChecked=false

                buttonView.setBackgroundColor(resources.getColor(R.color.black))
                buttonRegView.setBackgroundColor(resources.getColor(R.color.black))
                buttonView.setTextColor(resources.getColor(R.color.white))
                buttonRegView.setTextColor(resources.getColor(R.color.white))
                checkBoxStule1.setTextColor(resources.getColor(R.color.black))
                checkBoxStule2.setTextColor(resources.getColor(R.color.black))
                checkBoxStule3.setTextColor(resources.getColor(R.color.black))
                activity.setBackgroundColor(resources.getColor(R.color.Green))
            }
        }
        checkBoxStule2.setOnCheckedChangeListener { buttonView2, isChecked ->
            if(isChecked) {
                checkBoxStule1.isChecked = false
                checkBoxStule3.isChecked = false
                buttonView.setBackgroundColor(resources.getColor(R.color.Red))
                buttonRegView.setBackgroundColor(resources.getColor(R.color.Red))
                buttonView.setTextColor(resources.getColor(R.color.black))
                buttonRegView.setTextColor(resources.getColor(R.color.black))
                checkBoxStule1.setTextColor(resources.getColor(R.color.Red))
                checkBoxStule2.setTextColor(resources.getColor(R.color.Red))
                checkBoxStule3.setTextColor(resources.getColor(R.color.Red))
                activity.setBackgroundColor(resources.getColor(R.color.white))
            }
        }
        checkBoxStule3.setOnCheckedChangeListener { buttonView2, isChecked ->
            if(isChecked){
                checkBoxStule1.isChecked=false
                checkBoxStule2.isChecked=false

                buttonView.setBackgroundColor(resources.getColor(R.color.white))
                buttonRegView.setBackgroundColor(resources.getColor(R.color.white))
                buttonView.setTextColor(resources.getColor(R.color.black))
                buttonRegView.setTextColor(resources.getColor(R.color.black))
                checkBoxStule1.setTextColor(resources.getColor(R.color.white))
                checkBoxStule2.setTextColor(resources.getColor(R.color.white))
                checkBoxStule3.setTextColor(resources.getColor(R.color.white))
                activity.setBackgroundColor(resources.getColor(R.color.purple_500))
            }
        }
    }
}