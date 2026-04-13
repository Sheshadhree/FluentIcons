package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudArrowUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudArrowUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 6f)
            curveToRelative(-6.29f, 0f, -11.45f, 4.84f, -11.959f, 11f)
            horizontalLineTo(11.5f)
            curveTo(6.806f, 17f, 3f, 20.806f, 3f, 25.5f)
            reflectiveCurveTo(6.806f, 34f, 11.5f, 34f)
            horizontalLineTo(21f)
            curveToRelative(0f, -7.18f, 5.82f, -13f, 13f, -13f)
            curveToRelative(4.556f, 0f, 8.565f, 2.344f, 10.887f, 5.892f)
            curveTo(44.96f, 26.44f, 45f, 25.974f, 45f, 25.5f)
            curveToRelative(0f, -4.694f, -3.806f, -8.5f, -8.5f, -8.5f)
            horizontalLineToRelative(-0.541f)
            curveTo(35.45f, 10.84f, 30.29f, 6f, 24f, 6f)
            close()
            moveToRelative(21f, 28f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveToRelative(-11f, -4.925f, -11f, -11f)
            reflectiveCurveToRelative(4.925f, -11f, 11f, -11f)
            reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
            close()
            moveToRelative(-10.293f, -7.707f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineTo(33f, 29.414f)
            verticalLineTo(41f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(29.414f)
            lineToRelative(3.293f, 3.293f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-5f, -5f)
            close()
        }
    }.build()
}
