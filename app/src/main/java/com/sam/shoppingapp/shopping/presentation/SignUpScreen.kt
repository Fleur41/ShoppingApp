package com.sam.shoppingapp.shopping.presentation

import android.R.attr.label
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sam.shoppingapp.shopping.presentation.Utils.CustomTextField

@Composable
fun SignUpScreen() {
    val context = LocalContext.current
    var firstName by remember { mutableStateOf("")}
    var lastName by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}
    var confirmPassword by remember { mutableStateOf("")}
    var phoneNumber by remember { mutableStateOf("")}

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "SignUp",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 16.dp).align( Alignment.Start )
        )

        CustomTextField(
            value = firstName,
            onValueChange = {firstName = it},
            label = "First Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        )

        CustomTextField(
            value = lastName,
            onValueChange = {lastName = it},
            label = "Last Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        )

        CustomTextField(
            value = email,
            onValueChange = {email = it},
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        )

        CustomTextField(
            value = phoneNumber,
            onValueChange = {phoneNumber = it},
            label = "Phone Number",
            leadingIcon = Icons.Default.Call,
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        )

        CustomTextField(
            value = password,
            onValueChange = {password = it},
            label = "Create Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        )

        CustomTextField(
            value = confirmPassword,
            onValueChange = {confirmPassword = it},
            label = "Confirm Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SignUpScreenPreview() {
    SignUpScreen()
}