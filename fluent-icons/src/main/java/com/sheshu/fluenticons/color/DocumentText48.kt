package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentText48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentText48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(30.4f, 4f),
                end = Offset(33.4843f, 36.9112f)
            )
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(41.3333f, 5.21875f),
                radius = 24.7968f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(32.9766f, 9.83333f),
                end = Offset(29.4766f, 15.6667f)
            )
        ) {
            moveTo(26f, 15f)
            verticalLineTo(4f)
            lineToRelative(14f, 14f)
            horizontalLineTo(29f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(33f, 43.3f),
                end = Offset(17.47f, 15.8049f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(16.25f, 23f)
            curveTo(15.56f, 23f, 15f, 23.56f, 15f, 24.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(32.44f, 23f, 31.75f, 23f)
            horizontalLineToRelative(-15.5f)
            close()
            moveTo(15f, 30.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-15.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
            moveTo(16.25f, 35f)
            curveTo(15.56f, 35f, 15f, 35.56f, 15f, 36.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(32.44f, 35f, 31.75f, 35f)
            horizontalLineToRelative(-15.5f)
            close()
        }
    }.build()
}
