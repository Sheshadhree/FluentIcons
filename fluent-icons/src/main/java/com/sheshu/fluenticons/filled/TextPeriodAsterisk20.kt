package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextPeriodAsterisk20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextPeriodAsterisk20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.246f, 4.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(1.858f)
            lineTo(8.982f, 6.035f)
            curveTo(8.588f, 5.907f, 8.165f, 6.122f, 8.037f, 6.516f)
            reflectiveCurveToRelative(0.087f, 0.817f, 0.481f, 0.945f)
            lineToRelative(1.768f, 0.575f)
            lineTo(9.194f, 9.54f)
            curveToRelative(-0.244f, 0.335f, -0.17f, 0.804f, 0.166f, 1.048f)
            curveToRelative(0.335f, 0.243f, 0.804f, 0.169f, 1.048f, -0.166f)
            lineToRelative(1.09f, -1.502f)
            lineToRelative(1.092f, 1.502f)
            curveToRelative(0.243f, 0.335f, 0.713f, 0.41f, 1.048f, 0.166f)
            curveToRelative(0.335f, -0.244f, 0.409f, -0.713f, 0.165f, -1.048f)
            lineTo(12.71f, 8.037f)
            lineToRelative(1.771f, -0.576f)
            curveToRelative(0.394f, -0.128f, 0.61f, -0.551f, 0.482f, -0.945f)
            curveToRelative(-0.128f, -0.394f, -0.551f, -0.61f, -0.945f, -0.481f)
            lineTo(12.246f, 6.61f)
            verticalLineTo(4.75f)
            close()
            moveTo(6.5f, 16f)
            curveTo(7.328f, 16f, 8f, 15.328f, 8f, 14.5f)
            reflectiveCurveTo(7.328f, 13f, 6.5f, 13f)
            reflectiveCurveTo(5f, 13.672f, 5f, 14.5f)
            reflectiveCurveTo(5.672f, 16f, 6.5f, 16f)
            close()
        }
    }.build()
}
