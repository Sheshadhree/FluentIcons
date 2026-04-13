package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleCommunity32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleCommunity32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(15.1333f, 6.16006f),
                radius = 5.6215f
            )
        ) {
            moveTo(16f, 3f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveTo(13.515f, 12f, 16f, 12f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(18.485f, 3f, 16f, 3f)
            close()
            moveTo(6f, 6f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(20f, 0f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-4.618f, 9.296f)
            curveToRelative(-1.334f, -0.357f, -2.705f, 0.434f, -3.062f, 1.768f)
            lineToRelative(-0.906f, 3.38f)
            curveToRelative(-0.858f, 3.202f, 1.042f, 6.492f, 4.243f, 7.35f)
            curveToRelative(3.2f, 0.857f, 6.49f, -1.043f, 7.348f, -4.243f)
            lineToRelative(0.906f, -3.381f)
            curveToRelative(0.357f, -1.334f, -0.434f, -2.705f, -1.768f, -3.062f)
            lineToRelative(-6.761f, -1.812f)
            close()
            moveToRelative(-10.768f, 0f)
            curveToRelative(1.334f, -0.357f, 2.705f, 0.434f, 3.062f, 1.768f)
            lineToRelative(0.906f, 3.38f)
            curveToRelative(0.857f, 3.202f, -1.042f, 6.492f, -4.243f, 7.35f)
            curveToRelative(-3.2f, 0.857f, -6.49f, -1.043f, -7.348f, -4.243f)
            lineTo(2.085f, 20.17f)
            curveToRelative(-0.357f, -1.334f, 0.434f, -2.705f, 1.768f, -3.062f)
            lineToRelative(6.761f, -1.812f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338691f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(14.8444f, 18.9157f),
                radius = 8.44834f
            )
        ) {
            moveTo(12.5f, 14f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
