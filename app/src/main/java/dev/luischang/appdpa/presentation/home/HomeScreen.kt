package dev.luischang.appdpa.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Bienvenido al App ESAN DPA"
            , style = MaterialTheme.typography.titleLarge)

    }

}