package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.itera.pam.p1.getPlatformName

fun getGreetingMessage(): String {
    val namaPlatform = getPlatformName() 
    return "Halo dari $namaPlatform!"
}

@Composable
fun Handson1Screen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 1: Expect/Actual")
        Text(getGreetingMessage())
    }
}