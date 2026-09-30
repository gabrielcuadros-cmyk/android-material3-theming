package com.example.reply

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.reply.ui.theme.ReplyTheme

@Composable
fun ReplyApp(
    modifier: Modifier = Modifier
) {
    ReplyTheme {
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // Contenido principal de la aplicación
        }
    }
}