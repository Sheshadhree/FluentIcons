package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle724: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle724",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveToRelative(-0.88f, 15.49f)
            curveToRelative(0.05f, 0.01f, 0.13f, 0.01f, 0.13f, 0.01f)
            verticalLineToRelative(0.01f)
            curveToRelative(0.36f, 0f, 0.68f, -0.25f, 0.74f, -0.62f)
            curveToRelative(0.86f, -5.12f, 3.8f, -8.61f, 3.83f, -8.64f)
            curveToRelative(0.19f, -0.22f, 0.23f, -0.53f, 0.11f, -0.8f)
            curveToRelative(-0.12f, -0.27f, -0.39f, -0.44f, -0.68f, -0.44f)
            horizontalLineToRelative(-6.5f)
            curveTo(8.34f, 7.01f, 8f, 7.35f, 8f, 7.76f)
            reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.01f)
            curveToRelative(-1.03f, 1.53f, -2.63f, 4.41f, -3.26f, 8.12f)
            curveToRelative(-0.06f, 0.4f, 0.21f, 0.79f, 0.62f, 0.86f)
            close()
        }
    }.build()
}
