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
import androidx.glance.layout.width
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider

class AdvancedWidgetContent : GlanceAppWidget() {
   override suspend fun provideGlance(context: Context, id: GlanceId) {
       provideContent {
           GlanceTheme {
               MyContent()
           }
       }
   }

   @Composable
   private fun MyContent() {
       // Deep forest theme palette
       val darkForest = ColorProvider(androidx.compose.ui.graphics.Color(0xFF1B5E20))
       val accentGold = ColorProvider(androidx.compose.ui.graphics.Color(0xFFFFB300))
       val softMint = ColorProvider(androidx.compose.ui.graphics.Color(0xFFE8F5E9))
       val forestGreenLight = ColorProvider(androidx.compose.ui.graphics.Color(0xFF2E7D32))

       Column(
           modifier = GlanceModifier
               .fillMaxSize()
               .background(darkForest)
               .cornerRadius(16.dp)
               .padding(12.dp),
           verticalAlignment = Alignment.CenterVertically,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {
           Text(
               text = "✨ Santuario del Bosque ✨",
               style = TextStyle(
                   color = accentGold,
                   fontSize = 13.sp,
                   fontWeight = FontWeight.Bold
               )
           )

           Spacer(modifier = GlanceModifier.height(2.dp))

           Text(
               text = "Elige tu destino en el jardín",
               style = TextStyle(
                   color = softMint,
                   fontSize = 10.sp
               )
           )

           Spacer(modifier = GlanceModifier.height(8.dp))

           Row(
               verticalAlignment = Alignment.CenterVertically,
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Button(
                   text = "🏡 Principal",
                   onClick = actionStartActivity<MainActivity>(),
                   colors = ButtonDefaults.buttonColors(
                       backgroundColor = forestGreenLight,
                       contentColor = ColorProvider(androidx.compose.ui.graphics.Color.White)
                   )
               )
               
               Spacer(modifier = GlanceModifier.width(8.dp))

               Button(
                   text = "📄 Santuario",
                   onClick = actionStartActivity<SecondActivity>(),
                   colors = ButtonDefaults.buttonColors(
                       backgroundColor = forestGreenLight,
                       contentColor = ColorProvider(androidx.compose.ui.graphics.Color.White)
                   )
               )
           }
       }
   }
}
