package com.example.glab_s14_bpareja_2024_02

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class AdvancedWidget : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = AdvancedWidgetContent()
}
