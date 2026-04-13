package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Gift20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Gift20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    0.347899f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(9.23437f, 21.5366f),
                end = Offset(9.23437f, 5.49463f)
            )
        ) {
            moveTo(4f, 9f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.12f, 18f, 4f, 16.88f, 4f, 15.5f)
            verticalLineTo(9f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.196406f to Color(0xFF5B2AB5),
                    0.762565f to Color(0xFF8B57ED),
                    1f to Color(0xFFBB45EA)
                ),
                center = Offset(10f, 4.5f),
                radius = 18.0312f
            )
        ) {
            moveTo(4f, 6f)
            horizontalLineToRelative(12f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
            verticalLineToRelative(2f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            horizontalLineTo(4f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            verticalLineTo(7f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.25f, 18f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(9.25f, 5.5f),
                end = Offset(9.25f, 16.6087f)
            )
        ) {
            moveTo(9.25f, 18f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(-1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 5.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(-1.5f)
            verticalLineTo(5.75f)
            horizontalLineToRelative(1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(9.25f, -12.4643f),
                end = Offset(9.25f, 17.2857f)
            )
        ) {
            moveTo(10.75f, 5.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(-1.5f)
            verticalLineTo(5.75f)
            horizontalLineToRelative(1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(12.6389f, 7.25053f),
                end = Offset(9.79432f, -4.05891f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 2.612f)
            lineToRelative(0.056f, -0.057f)
            curveToRelative(1.073f, -1.074f, 2.815f, -1.074f, 3.889f, 0f)
            curveToRelative(1.073f, 1.074f, 1.073f, 2.816f, 0f, 3.89f)
            curveToRelative(-0.543f, 0.542f, -1.256f, 0.81f, -1.966f, 0.805f)
            curveToRelative(-0.25f, -0.002f, -0.742f, -0.002f, -1.176f, -0.002f)
            horizontalLineTo(10.75f)
            verticalLineToRelative(0.004f)
            lineTo(10f, 7.25f)
            lineTo(9.25f, 7.252f)
            verticalLineTo(7.249f)
            horizontalLineTo(8.021f)
            curveToRelative(-0.71f, 0.006f, -1.423f, -0.262f, -1.966f, -0.804f)
            curveToRelative(-1.074f, -1.074f, -1.074f, -2.816f, 0f, -3.89f)
            curveToRelative(1.074f, -1.074f, 2.816f, -1.074f, 3.89f, 0f)
            lineTo(10f, 2.612f)
            close()
            moveToRelative(2.884f, 1.004f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            curveTo(10.872f, 3.86f, 10.75f, 4.18f, 10.75f, 4.5f)
            verticalLineToRelative(1.249f)
            horizontalLineToRelative(0.052f)
            curveToRelative(0.431f, -0.001f, 0.931f, -0.001f, 1.188f, 0.001f)
            curveToRelative(0.325f, 0.002f, 0.647f, -0.12f, 0.894f, -0.366f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            close()
            moveTo(9.25f, 4.5f)
            curveToRelative(0f, -0.321f, -0.122f, -0.64f, -0.366f, -0.884f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            curveTo(7.363f, 5.63f, 7.686f, 5.752f, 8.01f, 5.75f)
            curveToRelative(0.257f, -0.002f, 0.757f, -0.002f, 1.188f, -0.002f)
            horizontalLineTo(9.25f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}
