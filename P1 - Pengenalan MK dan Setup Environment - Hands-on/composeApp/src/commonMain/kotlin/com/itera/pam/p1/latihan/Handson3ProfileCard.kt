package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import com.itera.pam.p1.getPlatformName

@Composable
fun Handson3Screen() {
    Card(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Nama: Mahawira Athaya Fikri") 
            Text("NIM: 124140050") 
 
            Row {
                Text("Platform: ")
                Text(getPlatformName())
            }
        }
    }
}