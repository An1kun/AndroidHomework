package com.example.androidhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val firstName = binding.firstNameEditText.text.toString()
            val lastName = binding.lastNameEditText.text.toString()
            val dob = binding.dobEditText.text.toString()
            val login = binding.loginEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            val person = Person(firstName, lastName, dob, login, password)

            val intent = Intent(this, UserDetailsActivity::class.java)


            intent.putExtra("PERSON_EXTRA", person)


            startActivity(intent)
        }
    }
}
