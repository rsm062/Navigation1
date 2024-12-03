package com.example.navigation1.presentation.ui.screens

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Pantalla 1") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.Center
        ) {

            Button(onClick = { /* navega  a la pantalla 2 */ }) {
                Text(text = "Pantalla 2")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { /* navega  a la pantalla 3 */ }) {
                Text(text = "Pantalla 3")
            }
        }
    }
}