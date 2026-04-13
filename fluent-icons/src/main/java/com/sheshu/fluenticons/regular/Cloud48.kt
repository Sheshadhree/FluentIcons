package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cloud48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cloud48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 11.5f)
            curveToRelative(-5.247f, 0f, -9.5f, 4.253f, -9.5f, 9.5f)
            curveToRelative(0f, 0.074f, 0f, 0.148f, 0.002f, 0.221f)
            curveToRelative(0.008f, 0.337f, -0.12f, 0.662f, -0.355f, 0.903f)
            curveToRelative(-0.235f, 0.24f, -0.558f, 0.376f, -0.894f, 0.376f)
            horizontalLineTo(11.5f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            horizontalLineToRelative(25f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            horizontalLineToRelative(-1.753f)
            curveToRelative(-0.336f, 0f, -0.659f, -0.136f, -0.894f, -0.376f)
            reflectiveCurveToRelative(-0.363f, -0.566f, -0.355f, -0.902f)
            lineTo(33.5f, 21f)
            curveToRelative(0f, -5.247f, -4.253f, -9.5f, -9.5f, -9.5f)
            close()
            moveTo(12.041f, 20f)
            curveTo(12.55f, 13.84f, 17.71f, 9f, 24f, 9f)
            reflectiveCurveToRelative(11.45f, 4.84f, 11.959f, 11f)
            horizontalLineTo(36.5f)
            curveToRelative(4.694f, 0f, 8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveTo(41.194f, 37f, 36.5f, 37f)
            horizontalLineToRelative(-25f)
            curveTo(6.806f, 37f, 3f, 33.194f, 3f, 28.5f)
            reflectiveCurveTo(6.806f, 20f, 11.5f, 20f)
            horizontalLineToRelative(0.541f)
            close()
        }
    }.build()
}
