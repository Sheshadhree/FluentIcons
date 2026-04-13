package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headphones48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headphones48",
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
                start = Offset(-8.5f, 7.76494f),
                end = Offset(3.94912f, 34.8678f)
            )
        ) {
            moveTo(6.5f, 24f)
            curveToRelative(0f, -9.665f, 7.835f, -17.5f, 17.5f, -17.5f)
            reflectiveCurveTo(41.5f, 14.335f, 41.5f, 24f)
            verticalLineToRelative(4f)
            lineToRelative(1.5f, 1f)
            lineToRelative(1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -11.046f, -8.954f, -20f, -20f, -20f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            verticalLineToRelative(4f)
            lineToRelative(1f, 1f)
            lineToRelative(1.5f, -1f)
            verticalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-10.2857f, 4f),
                end = Offset(-5.60124f, 24.341f)
            )
        ) {
            moveTo(6.5f, 24f)
            curveToRelative(0f, -9.665f, 7.835f, -17.5f, 17.5f, -17.5f)
            reflectiveCurveTo(41.5f, 14.335f, 41.5f, 24f)
            verticalLineToRelative(4f)
            lineToRelative(1.5f, 1f)
            lineToRelative(1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -11.046f, -8.954f, -20f, -20f, -20f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            verticalLineToRelative(4f)
            lineToRelative(1f, 1f)
            lineToRelative(1.5f, -1f)
            verticalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(24f, 28f),
                end = Offset(24f, 42.9941f)
            )
        ) {
            moveTo(4f, 38.25f)
            verticalLineTo(28f)
            horizontalLineToRelative(2.5f)
            lineToRelative(3.5f, 7f)
            lineToRelative(-3.5f, 7.994f)
            curveTo(4.99f, 41.958f, 4f, 40.22f, 4f, 38.25f)
            close()
            moveToRelative(40f, 0f)
            curveToRelative(0f, 1.97f, -0.99f, 3.708f, -2.5f, 4.744f)
            lineToRelative(-3f, -7.494f)
            lineToRelative(3f, -7.5f)
            horizontalLineTo(44f)
            verticalLineToRelative(10.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(21.8125f, 28f),
                end = Offset(21.8125f, 44f)
            )
        ) {
            moveTo(6.5f, 28f)
            verticalLineToRelative(14.994f)
            curveTo(7.425f, 43.63f, 8.544f, 44f, 9.75f, 44f)
            horizontalLineToRelative(6f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-13.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(6.5f)
            close()
            moveToRelative(35f, 14.994f)
            verticalLineTo(28f)
            horizontalLineToRelative(-9.25f)
            curveTo(31.56f, 28f, 31f, 28.56f, 31f, 29.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(6f)
            curveToRelative(1.206f, 0f, 2.325f, -0.371f, 3.25f, -1.006f)
            close()
        }
    }.build()
}
