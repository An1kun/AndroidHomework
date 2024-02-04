package com.example.androidhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidhomework.databinding.ActivityUserDetailsBinding

class UserDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val person = intent.getSerializableExtra("PERSON_EXTRA") as Person


        binding.firstNameTextView.text = "First Name: ${person.firstName}"
        binding.lastNameTextView.text = "Last Name: ${person.lastName}"
        binding.dobTextView.text = "Date of Birth: ${person.dateOfBirth}"
        binding.loginTextView.text = "Login: ${person.login}"
        binding.passwordTextView.text = "Password: ${person.password}"
    }
}
