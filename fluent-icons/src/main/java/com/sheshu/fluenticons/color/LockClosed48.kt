package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LockClosed48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LockClosed48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(19.4286f, 1.89851f),
                end = Offset(31.6698f, 22.1132f)
            )
        ) {
            moveTo(16f, 12f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -3.038f, 2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            verticalLineToRelative(3f)
            horizontalLineTo(32f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(42.2857f, 43.75f),
                end = Offset(13.084f, 16.5556f)
            )
        ) {
            moveTo(40f, 20.25f)
            curveToRelative(0f, -3.452f, -2.798f, -6.25f, -6.25f, -6.25f)
            horizontalLineToRelative(-19.5f)
            curveTo(10.798f, 14f, 8f, 16.798f, 8f, 20.25f)
            verticalLineToRelative(15.5f)
            curveTo(8f, 39.202f, 10.798f, 42f, 14.25f, 42f)
            horizontalLineToRelative(19.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-15.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                center = Offset(25.5f, 31f),
                radius = 10.9202f
            )
        ) {
            moveTo(27f, 28f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}
