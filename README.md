# Laboratorio 14: Widgets de Pantalla de Inicio con Jetpack Glance

Este repositorio contiene la implementación del **Laboratorio 14** para el desarrollo de Widgets interactivos en la pantalla de inicio de Android utilizando **Jetpack Glance**. 

Glance es un framework construido sobre Compose que permite crear vistas rápidas (AppWidgets) receptivas y con un diseño moderno mediante APIs declarativas en Kotlin.

---

## 🛠️ Tecnologías y Librerías Utilizadas

- **Kotlin**: Lenguaje de programación principal del proyecto.
- **Jetpack Compose**: Para la interfaz de usuario de las actividades principales.
- **Jetpack Glance (v1.1.0)**:
  - `androidx.glance:glance-appwidget`: Soporte base para AppWidgets.
  - `androidx.glance:glance-material3`: Interoperabilidad con componentes y temas de Material Design 3.
  - `androidx.glance:glance-material`: Interoperabilidad con Material Design 2.
- **Gradle (Kotlin DSL)**: Sistema de construcción del proyecto.

---

## 📂 Contenido del Proyecto y Estructura

El laboratorio está separado en dos widgets independientes para facilitar la visualización de cada paso:

### 1. SimpleWidget (Paso 1)
- **Componentes**: 
  - [SimpleWidget](file:///home/ivan/AndroidStudioProjects/GLAB---S14---BPAREJA---2024-02/app/src/main/java/com/example/glab_s14_bpareja_2024_02/SimpleWidget.kt): Receptor del widget (`GlanceAppWidgetReceiver`).
  - [SimpleWidgetContent](file:///home/ivan/AndroidStudioProjects/GLAB---S14---BPAREJA---2024-02/app/src/main/java/com/example/glab_s14_bpareja_2024_02/SimpleWidgetContent.kt): Estructura del widget (`GlanceAppWidget`).
- **Funcionamiento**: Muestra el texto *"¿A dónde quieres dirigirte?"* y un botón *"Página Principal"* que abre la actividad principal (`MainActivity`) al hacer clic.

### 2. AdvancedWidget (Paso 2)
- **Componentes**: 
  - [AdvancedWidget](file:///home/ivan/AndroidStudioProjects/GLAB---S14---BPAREJA---2024-02/app/src/main/java/com/example/glab_s14_bpareja_2024_02/AdvancedWidget.kt): Receptor del widget.
  - [AdvancedWidgetContent](file:///home/ivan/AndroidStudioProjects/GLAB---S14---BPAREJA---2024-02/app/src/main/java/com/example/glab_s14_bpareja_2024_02/AdvancedWidgetContent.kt): Estructura del widget.
- **Funcionamiento**: Permite al usuario iniciar la aplicación en dos vistas diferentes desde la pantalla de inicio:
  - Botón **"Página Principal"**: Abre la [MainActivity](file:///home/ivan/AndroidStudioProjects/GLAB---S14---BPAREJA---2024-02/app/src/main/java/com/example/glab_s14_bpareja_2024_02/MainActivity.kt).
  - Botón **"Segunda Vista"**: Abre la [SecondActivity](file:///home/ivan/AndroidStudioProjects/GLAB---S14---BPAREJA---2024-02/app/src/main/java/com/example/glab_s14_bpareja_2024_02/SecondActivity.kt) (vista de detalle secundaria).

---

## 📲 Cómo Probar los Widgets

1. Compila e instala la aplicación en un emulador o dispositivo físico.
2. Ve a la pantalla de inicio del dispositivo.
3. Mantén presionado un espacio vacío y selecciona **Widgets**.
4. Busca la aplicación **GLAB - S14 - BPAREJA - 2024-02**.
5. Añade tanto el **Simple Widget** como el **Advanced Widget** para probar las redirecciones de forma independiente.
