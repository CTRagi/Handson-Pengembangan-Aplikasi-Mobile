package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Handson2Screen() {
    var hitung by remember {
        mutableStateOf(0) 
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 2: Counter")
        Text("Nilai: $hitung") 

        Row {
            Button(onClick = { hitung++ }) {
                Text("+")
            }
            Button(onClick = { hitung-- }) {
                Text("-")
            }
        }
    }
}