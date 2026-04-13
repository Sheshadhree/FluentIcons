package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DrinkWine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DrinkWine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.733f, 6.303f)
            curveToRelative(0.03f, -0.274f, -0.167f, -0.521f, -0.442f, -0.552f)
            curveToRelative(-0.274f, -0.03f, -0.521f, 0.167f, -0.552f, 0.442f)
            curveTo(9.7f, 6.56f, 9.543f, 6.905f, 9.294f, 7.179f)
            curveToRelative(-0.25f, 0.273f, -0.578f, 0.46f, -0.94f, 0.535f)
            curveToRelative(-0.27f, 0.056f, -0.444f, 0.32f, -0.388f, 0.59f)
            curveToRelative(0.055f, 0.271f, 0.32f, 0.445f, 0.59f, 0.39f)
            curveToRelative(0.569f, -0.118f, 1.086f, -0.413f, 1.477f, -0.842f)
            curveToRelative(0.391f, -0.43f, 0.636f, -0.972f, 0.7f, -1.549f)
            close()
            moveTo(4.5f, 1f)
            curveTo(4.224f, 1f, 4f, 1.224f, 4f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.04f, 1.527f, 3.723f, 3.5f, 3.97f)
            verticalLineTo(14f)
            horizontalLineTo(6f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(5.724f, 15f, 6f, 15f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 14f, 10f, 14f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(-3.53f)
            curveTo(10.472f, 10.222f, 12f, 8.54f, 12f, 6.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 1.224f, 11.776f, 1f, 11.5f, 1f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(5f, 4f)
            verticalLineTo(2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
