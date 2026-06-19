package com.example.glab_s14_bpareja_2024_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Park
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF1F8E9)
                ) {
                    SecondScreen(
                        onNavigateBack = {
                            finish()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun SecondScreen(onNavigateBack: () -> Unit) {
    val gradientBg = Brush.verticalGradient(
        colors = listOf(Color(0xFFE8F5E9), Color(0xFFC5E1A5))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBg)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(28.dp))

        // Header with Back Button
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onNavigateBack,
                colors = IconButtonDefaults.iconButtonColors(containerColor = Color.White)
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Regresar", tint = Color(0xFF2E7D32))
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Santuario de Sabiduría",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B5E20)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Wisdom Card
        Card(
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Park,
                    contentDescription = null,
                    tint = Color(0xFF388E3C),
                    modifier = Modifier
                        .size(56.dp)
                        .background(Color(0xFFF1F8E9), CircleShape)
                        .padding(10.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Reflexión del Día",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E7D32)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "\"La verdad es la raíz de la cual crece toda confianza. Un árbol sin raíces fuertes caerá ante la primera tormenta.\"",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                    color = Color(0xFF33691E),
                    textAlign = TextAlign.Center,
                    lineHeight = 22.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Info Tips Card
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9).copy(alpha = 0.9f)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Default.AutoAwesome, contentDescription = null, tint = Color(0xFFF57F17), modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Consejo de Cuidado del Widget",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF33691E)
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "¡Has accedido a esta sección de manera rápida desde el Widget! Recuerda que puedes configurar el widget en tu pantalla de inicio para acceder directamente con un solo toque sin pasar por la página de inicio.",
                    fontSize = 11.sp,
                    color = Color(0xFF558B2F),
                    lineHeight = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // Styled Back Action Button
        Button(
            onClick = onNavigateBack,
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF558B2F)),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text("Volver al Jardín Principal", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.White)
        }

        Spacer(modifier = Modifier.height(12.dp))
    }
}
