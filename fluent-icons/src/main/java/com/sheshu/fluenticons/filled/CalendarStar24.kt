package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarStar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarStar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 12f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(20.538f, 23f, 17.5f, 23f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            close()
            moveTo(21f, 8.5f)
            lineToRelative(0.001f, 3.523f)
            curveTo(19.991f, 11.375f, 18.79f, 11f, 17.5f, 11f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            curveToRelative(0f, 1.29f, 0.375f, 2.49f, 1.023f, 3.501f)
            lineTo(6.25f, 21f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(18f)
            close()
            moveToRelative(-4.016f, 5.546f)
            lineToRelative(-0.04f, 0.098f)
            lineToRelative(-0.556f, 1.787f)
            horizontalLineToRelative(-1.803f)
            curveToRelative(-0.532f, 0f, -0.772f, 0.668f, -0.417f, 1.036f)
            lineToRelative(0.074f, 0.065f)
            lineToRelative(1.458f, 1.105f)
            lineToRelative(-0.557f, 1.787f)
            curveToRelative(-0.165f, 0.53f, 0.375f, 0.975f, 0.821f, 0.73f)
            lineToRelative(0.078f, -0.05f)
            lineTo(17.5f, 19.5f)
            lineToRelative(1.458f, 1.104f)
            curveToRelative(0.433f, 0.328f, 1.006f, -0.07f, 0.92f, -0.588f)
            lineToRelative(-0.021f, -0.092f)
            lineToRelative(-0.557f, -1.787f)
            lineToRelative(1.458f, -1.105f)
            curveToRelative(0.43f, -0.326f, 0.248f, -1.014f, -0.247f, -1.093f)
            lineToRelative(-0.096f, -0.008f)
            horizontalLineToRelative(-1.803f)
            lineToRelative(-0.557f, -1.787f)
            curveToRelative(-0.163f, -0.526f, -0.843f, -0.559f, -1.071f, -0.098f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
    }.build()
}
