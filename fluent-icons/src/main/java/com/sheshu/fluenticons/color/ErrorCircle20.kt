package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ErrorCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ErrorCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(4.5f, -0.5f),
                end = Offset(15f, 19.5f)
            )
        ) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(8f, 6f),
                end = Offset(12f, 14f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.5f, 6.5f)
            curveTo(10.5f, 6.224f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 6.224f, 9.5f, 6.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(6.5f)
            close()
            moveTo(10f, 14f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.414f, 12.5f, 10f, 12.5f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(9.586f, 14f, 10f, 14f)
            close()
        }
    }.build()
}
