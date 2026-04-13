package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Building16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Building16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4f, 2.375f),
                end = Offset(15.4427f, 13.3621f)
            )
        ) {
            moveTo(5.5f, 2f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(10f)
            curveTo(4f, 13.776f, 4.224f, 14f, 4.5f, 14f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(13f, 7.672f, 12.328f, 7f, 11.5f, 7f)
            horizontalLineTo(11f)
            verticalLineTo(3.5f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(8.10714f, 11.5625f),
                end = Offset(10.1775f, 13.7135f)
            )
        ) {
            moveTo(8.5f, 14f)
            lineTo(8f, 12.5f)
            lineTo(8.5f, 11f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(14f)
            horizontalLineTo(8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(6.08929f, 11.5625f),
                end = Offset(8.13983f, 13.3379f)
            )
        ) {
            moveTo(6f, 14f)
            verticalLineToRelative(-2.5f)
            curveTo(6f, 11.224f, 6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5f, -4.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 9.776f, 10f, 9.5f)
            reflectiveCurveTo(10.224f, 9f, 10.5f, 9f)
            reflectiveCurveTo(11f, 9.224f, 11f, 9.5f)
            close()
            moveToRelative(-2f, 0f)
            curveTo(9f, 9.776f, 8.776f, 10f, 8.5f, 10f)
            reflectiveCurveTo(8f, 9.776f, 8f, 9.5f)
            reflectiveCurveTo(8.224f, 9f, 8.5f, 9f)
            reflectiveCurveTo(9f, 9.224f, 9f, 9.5f)
            close()
            moveToRelative(-2f, 0f)
            curveTo(7f, 9.776f, 6.776f, 10f, 6.5f, 10f)
            reflectiveCurveTo(6f, 9.776f, 6f, 9.5f)
            reflectiveCurveTo(6.224f, 9f, 6.5f, 9f)
            reflectiveCurveTo(7f, 9.224f, 7f, 9.5f)
            close()
            moveTo(9f, 7f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(8f, 7.276f, 8f, 7f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(9f, 6.724f, 9f, 7f)
            close()
            moveTo(7f, 7f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(6f, 7.276f, 6f, 7f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(7f, 6.724f, 7f, 7f)
            close()
            moveToRelative(2f, -2.5f)
            curveTo(9f, 4.776f, 8.776f, 5f, 8.5f, 5f)
            reflectiveCurveTo(8f, 4.776f, 8f, 4.5f)
            reflectiveCurveTo(8.224f, 4f, 8.5f, 4f)
            reflectiveCurveTo(9f, 4.224f, 9f, 4.5f)
            close()
            moveToRelative(-2f, 0f)
            curveTo(7f, 4.776f, 6.776f, 5f, 6.5f, 5f)
            reflectiveCurveTo(6f, 4.776f, 6f, 4.5f)
            reflectiveCurveTo(6.224f, 4f, 6.5f, 4f)
            reflectiveCurveTo(7f, 4.224f, 7f, 4.5f)
            close()
        }
    }.build()
}
