package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Mic48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Mic48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(10f, 13.2692f),
                end = Offset(23.4502f, 46.0598f)
            )
        ) {
            moveTo(25f, 37.715f)
            curveToRelative(7.265f, -0.513f, 13f, -6.57f, 13f, -13.965f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            curveToRelative(0f, 6.351f, -5.149f, 11.5f, -11.5f, 11.5f)
            reflectiveCurveToRelative(-11.5f, -5.149f, -11.5f, -11.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveTo(10f, 23.06f, 10f, 23.75f)
            curveToRelative(0f, 7.225f, 5.473f, 13.172f, 12.5f, 13.92f)
            verticalLineToRelative(5.08f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(25f, 43.44f, 25f, 42.75f)
            verticalLineToRelative(-5.035f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(12f, -2.36364f),
                end = Offset(26.6914f, 47.6571f)
            )
        ) {
            moveTo(16f, 12f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            verticalLineTo(12f)
            close()
        }
    }.build()
}
