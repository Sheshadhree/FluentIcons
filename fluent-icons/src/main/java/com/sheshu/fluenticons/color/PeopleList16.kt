package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PeopleList16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PeopleList16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(3.40243f, 9.59821f),
                end = Offset(5.00013f, 14.1336f)
            )
        ) {
            moveTo(9.5f, 10.5f)
            curveTo(9.5f, 9.672f, 8.828f, 9f, 8f, 9f)
            horizontalLineTo(3f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(0.075f)
            reflectiveCurveToRelative(0f, 2.925f, 4f, 2.925f)
            curveToRelative(3.812f, 0f, 3.991f, -2.656f, 4f, -2.906f)
            verticalLineTo(10.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(5.5f, 8.46429f),
                end = Offset(7.75023f, 15.9387f)
            )
        ) {
            moveTo(9.5f, 10.5f)
            curveTo(9.5f, 9.672f, 8.828f, 9f, 8f, 9f)
            horizontalLineTo(3f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(0.075f)
            reflectiveCurveToRelative(0f, 2.925f, 4f, 2.925f)
            curveToRelative(3.812f, 0f, 3.991f, -2.656f, 4f, -2.906f)
            verticalLineTo(10.5f)
            close()
            moveToRelative(2f, -2.5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(8f, 5.5f)
            curveTo(8f, 6.88f, 6.88f, 8f, 5.5f, 8f)
            reflectiveCurveTo(3f, 6.88f, 3f, 5.5f)
            reflectiveCurveTo(4.12f, 3f, 5.5f, 3f)
            reflectiveCurveTo(8f, 4.12f, 8f, 5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(10.2143f, 7f),
                end = Offset(13.6624f, 15.5148f)
            )
        ) {
            moveTo(7f, 9f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(6.5003f, 5.5f),
                end = Offset(14f, 14f)
            )
        ) {
            moveTo(9.5f, 9f)
            curveTo(9.224f, 9f, 9f, 9.224f, 9f, 9.5f)
            reflectiveCurveTo(9.224f, 10f, 9.5f, 10f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(0f, 2f)
            curveTo(9.224f, 11f, 9f, 11.224f, 9f, 11.5f)
            reflectiveCurveTo(9.224f, 12f, 9.5f, 12f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(0f, 2f)
            curveTo(9.224f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(9.224f, 14f, 9.5f, 14f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 13f, 13.5f, 13f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
