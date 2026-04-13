package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContactCard48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContactCard48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(18.2857f, 8f),
                end = Offset(28.6178f, 39.8924f)
            )
        ) {
            moveTo(4f, 12.25f)
            curveTo(4f, 9.903f, 5.903f, 8f, 8.25f, 8f)
            horizontalLineToRelative(31.5f)
            curveTo(42.097f, 8f, 44f, 9.903f, 44f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(8.25f)
            curveTo(5.903f, 40f, 4f, 38.097f, 4f, 35.75f)
            verticalLineToRelative(-23.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.446512f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(30.1905f, 11.9298f),
                end = Offset(38.9669f, 57.58f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(4f, 12.25f)
            curveTo(4f, 9.903f, 5.903f, 8f, 8.25f, 8f)
            horizontalLineToRelative(31.5f)
            curveTo(42.097f, 8f, 44f, 9.903f, 44f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(8.25f)
            curveTo(5.903f, 40f, 4f, 38.097f, 4f, 35.75f)
            verticalLineToRelative(-23.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(29.9091f, 17.9038f),
                end = Offset(33.7945f, 36.5488f)
            )
        ) {
            moveTo(25f, 20.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
            moveTo(26.25f, 26f)
            curveTo(25.56f, 26f, 25f, 26.56f, 25f, 27.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(36.44f, 26f, 35.75f, 26f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(11f, 26.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(27f)
            reflectiveCurveToRelative(0f, 4f, -5f, 4f)
            reflectiveCurveToRelative(-5f, -4f, -5f, -4f)
            verticalLineToRelative(-0.5f)
            close()
            moveToRelative(8f, -6.5f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}
