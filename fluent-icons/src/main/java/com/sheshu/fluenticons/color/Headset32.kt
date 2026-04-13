package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headset32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headset32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(13.5833f, 26.8333f),
                end = Offset(12.2252f, 20.4835f)
            )
        ) {
            moveTo(7f, 21f)
            lineToRelative(1f, 1f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6.83f)
            curveToRelative(0.11f, 0.313f, 0.17f, 0.65f, 0.17f, 1f)
            reflectiveCurveToRelative(-0.06f, 0.687f, -0.17f, 1f)
            horizontalLineTo(12f)
            curveToRelative(-3.314f, 0f, -6f, -2.686f, -6f, -6f)
            lineToRelative(1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF383B3D),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(18.25f, 29.25f),
                end = Offset(13.1675f, 26.2809f)
            )
        ) {
            moveTo(19f, 27f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveTo(8f, 12f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(6f, 6.477f, 6f, 12f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(16f, 12f),
                end = Offset(16f, 22f)
            )
        ) {
            moveTo(8f, 22f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            verticalLineToRelative(10f)
            close()
            moveToRelative(16f, -10f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.729f, 0f, 1.412f, -0.195f, 2f, -0.535f)
            verticalLineTo(12f)
            close()
            moveTo(8f, 12f)
            horizontalLineTo(6f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(2f)
            verticalLineTo(12f)
            close()
            moveToRelative(16f, 9.465f)
            curveToRelative(1.196f, -0.692f, 2f, -1.984f, 2f, -3.465f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(9.465f)
            close()
        }
    }.build()
}
