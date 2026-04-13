package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Warning28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Warning28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.592f, 4.17f)
            curveToRelative(1.046f, -1.894f, 3.77f, -1.895f, 4.816f, 0f)
            lineToRelative(9.25f, 16.75f)
            curveTo(26.67f, 22.753f, 25.344f, 25f, 23.251f, 25f)
            horizontalLineTo(4.757f)
            curveToRelative(-2.093f, 0f, -3.42f, -2.246f, -2.408f, -4.079f)
            lineToRelative(9.243f, -16.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(5.75319f, -0.727679f),
                end = Offset(19.7142f, 27.9572f)
            )
        ) {
            moveTo(11.592f, 4.17f)
            curveToRelative(1.046f, -1.894f, 3.77f, -1.895f, 4.816f, 0f)
            lineToRelative(9.25f, 16.75f)
            curveTo(26.67f, 22.753f, 25.344f, 25f, 23.251f, 25f)
            horizontalLineTo(4.757f)
            curveToRelative(-2.093f, 0f, -3.42f, -2.246f, -2.408f, -4.079f)
            lineToRelative(9.243f, -16.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF242424)
                ),
                start = Offset(11.3333f, 9.5f),
                end = Offset(17.3376f, 20.6383f)
            )
        ) {
            moveTo(15f, 20f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-1.75f, -3.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(6.5f)
            close()
        }
    }.build()
}
