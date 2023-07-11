package com.example.myloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // variable declaration
    lateinit var etUsername:EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialazation
        etUsername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            //operation perform
            if(etUsername.text.toString(). isEmpty()){
                etUsername.error = "Enter your email"
            }
            else if (etPassword.text.toString().isEmpty()){
                etPassword.error = "enter_password"
            }
            else{
                Toast.makeText(this,"login Successfully", Toast.LENGTH_SHORT).show()
                //intent - source class, destination class

                var intent = Intent(this, Second_activity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
    override fun onStart(){
        super.onStart()
        Toast.makeText(this, "on Start Called ",  Toast.LENGTH_SHORT).show()
    }
    override fun onResume(){
        super.onResume()
        Toast.makeText(this,"on Resume called ", Toast.LENGTH_SHORT).show()
    }

}