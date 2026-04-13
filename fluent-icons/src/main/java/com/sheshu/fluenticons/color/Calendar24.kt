package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Calendar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Calendar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(15.25f, 22.7807f),
                end = Offset(9.83449f, 7.32114f)
            )
        ) {
            moveTo(21f, 7.5f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineToRelative(9f, -1f)
            lineToRelative(9f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(13.9286f, 12.4318f),
                end = Offset(16.625f, 24.267f)
            )
        ) {
            moveTo(21f, 7.5f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineToRelative(9f, -1f)
            lineToRelative(9f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(10.9091f, 9.69231f),
                end = Offset(13.0595f, 23.6971f)
            )
        ) {
            moveTo(7.25f, 15f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(7.94f, 17.5f, 7.25f, 17.5f)
            reflectiveCurveTo(6f, 16.94f, 6f, 16.25f)
            reflectiveCurveTo(6.56f, 15f, 7.25f, 15f)
            close()
            moveTo(12f, 15f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(12.69f, 17.5f, 12f, 17.5f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(11.31f, 15f, 12f, 15f)
            close()
            moveToRelative(-4.75f, -4.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(7.94f, 13f, 7.25f, 13f)
            reflectiveCurveTo(6f, 12.44f, 6f, 11.75f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            close()
            moveToRelative(4.75f, 0f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(12.69f, 13f, 12f, 13f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            close()
            moveToRelative(4.75f, 0f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(17.44f, 13f, 16.75f, 13f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            close()
            moveToRelative(1f, -7.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
    }.build()
}
