package com.example.glab_s14_bpareja_2024_02

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.Button
import androidx.glance.ButtonDefaults
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider

class SimpleWidgetContent : GlanceAppWidget() {
   override suspend fun provideGlance(context: Context, id: GlanceId) {
       provideContent {
           GlanceTheme {
               MyContent()
           }
       }
   }

   @Composable
   private fun MyContent() {
       // Organic green palette for widget
       val lightGreen = ColorProvider(androidx.compose.ui.graphics.Color(0xFFE8F5E9))
       val deepGreen = ColorProvider(androidx.compose.ui.graphics.Color(0xFF1B5E20))
       val forestGreen = ColorProvider(androidx.compose.ui.graphics.Color(0xFF2E7D32))

       Column(
           modifier = GlanceModifier
               .fillMaxSize()
               .background(lightGreen)
               .cornerRadius(16.dp)
               .padding(12.dp),
           verticalAlignment = Alignment.CenterVertically,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Text(
               text = "🌳 Jardín de la Integridad",
               style = TextStyle(
                   color = deepGreen,
                   fontSize = 14.sp,
                   fontWeight = FontWeight.Bold
               )
           )
           
           Spacer(modifier = GlanceModifier.height(4.dp))

           Text(
               text = "¿A dónde quieres dirigirte hoy?",
               style = TextStyle(
                   color = forestGreen,
                   fontSize = 11.sp
               )
           )

           Spacer(modifier = GlanceModifier.height(8.dp))

           Row(horizontalAlignment = Alignment.CenterHorizontally) {
               Button(
                   text = "Ir a Página Principal",
                   onClick = actionStartActivity<MainActivity>(),
                   colors = ButtonDefaults.buttonColors(
                       backgroundColor = forestGreen,
                       contentColor = ColorProvider(androidx.compose.ui.graphics.Color.White)
                   )
               )
           }
       }
   }
}
