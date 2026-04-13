package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShieldCheckmark24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShieldCheckmark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2),
                    0.682436f to Color(0xFF5750E2),
                    0.860903f to Color(0xFFCC23D1)
                ),
                center = Offset(-4.07143f, -9.25f),
                radius = 47.5993f
            )
        ) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveToRelative(2.663f, 0f, 5.258f, -0.944f, 7.8f, -2.85f)
            curveToRelative(0.267f, -0.2f, 0.633f, -0.2f, 0.9f, 0f)
            curveTo(14.992f, 4.056f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveToRelative(0f, 5.001f, -2.958f, 8.676f, -8.725f, 10.948f)
            curveToRelative(-0.177f, 0.07f, -0.373f, 0.07f, -0.55f, 0f)
            curveTo(5.958f, 19.676f, 3f, 16f, 3f, 11f)
            verticalLineTo(5.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0xFF1E1868),
                    1f to Color(0x001E1868)
                ),
                center = Offset(17.7857f, 18.875f),
                radius = 8.125f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveToRelative(2.663f, 0f, 5.258f, -0.944f, 7.8f, -2.85f)
            curveToRelative(0.267f, -0.2f, 0.633f, -0.2f, 0.9f, 0f)
            curveTo(14.992f, 4.056f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveToRelative(0f, 5.001f, -2.958f, 8.676f, -8.725f, 10.948f)
            curveToRelative(-0.177f, 0.07f, -0.373f, 0.07f, -0.55f, 0f)
            curveTo(5.958f, 19.676f, 3f, 16f, 3f, 11f)
            verticalLineTo(5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(12.3929f, 14.0625f),
                end = Offset(19.9842f, 21.9496f)
            )
        ) {
            moveTo(17.5f, 12f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(20.538f, 23f, 17.5f, 23f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(15.3125f, 15.51f),
                end = Offset(16.4497f, 21.1303f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(20.854f, 15.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(1.646f, 1.647f)
            lineToRelative(3.646f, -3.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
