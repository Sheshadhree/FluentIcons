package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FStop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FStop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.884f, 5.35f)
            curveToRelative(0.291f, -1.706f, 2.03f, -2.753f, 3.673f, -2.216f)
            lineToRelative(0.788f, 0.258f)
            curveToRelative(0.262f, 0.086f, 0.544f, -0.057f, 0.63f, -0.32f)
            curveToRelative(0.086f, -0.262f, -0.057f, -0.545f, -0.32f, -0.63f)
            lineToRelative(-0.787f, -0.258f)
            curveToRelative(-2.224f, -0.728f, -4.575f, 0.69f, -4.97f, 2.997f)
            lineTo(9.244f, 9f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 9f, 5f, 9.224f, 5f, 9.5f)
            reflectiveCurveTo(5.224f, 10f, 5.5f, 10f)
            horizontalLineToRelative(3.573f)
            lineToRelative(-0.622f, 3.633f)
            curveToRelative(-0.335f, 1.96f, -2.531f, 2.974f, -4.24f, 1.958f)
            lineToRelative(-0.455f, -0.27f)
            curveToRelative(-0.238f, -0.142f, -0.545f, -0.064f, -0.686f, 0.174f)
            curveToRelative(-0.14f, 0.237f, -0.063f, 0.544f, 0.175f, 0.685f)
            lineTo(3.7f, 16.45f)
            curveToRelative(2.312f, 1.375f, 5.283f, 0.003f, 5.737f, -2.648f)
            lineTo(10.087f, 10f)
            horizontalLineTo(13.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-3.241f)
            lineToRelative(0.625f, -3.65f)
            close()
        }
    }.build()
}
