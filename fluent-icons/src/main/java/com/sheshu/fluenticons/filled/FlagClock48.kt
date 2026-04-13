package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagClock48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagClock48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 6f)
            curveTo(8.06f, 6f, 7.5f, 6.56f, 7.5f, 7.25f)
            verticalLineToRelative(35.5f)
            curveTo(7.5f, 43.44f, 8.06f, 44f, 8.75f, 44f)
            reflectiveCurveTo(10f, 43.44f, 10f, 42.75f)
            verticalLineTo(33f)
            horizontalLineToRelative(12.153f)
            curveTo(23.115f, 26.77f, 28.5f, 22f, 35f, 22f)
            curveToRelative(0.218f, 0f, 0.434f, 0.005f, 0.65f, 0.016f)
            lineTo(33.8f, 19.5f)
            lineToRelative(8.456f, -11.51f)
            curveToRelative(0.28f, -0.38f, 0.321f, -0.884f, 0.108f, -1.304f)
            curveTo(42.152f, 6.264f, 41.721f, 6f, 41.25f, 6f)
            horizontalLineTo(8.75f)
            close()
            moveTo(46f, 35f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveToRelative(-11f, -4.925f, -11f, -11f)
            reflectiveCurveToRelative(4.925f, -11f, 11f, -11f)
            reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
            close()
            moveToRelative(-5f, 0f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
            curveTo(34.48f, 35.895f, 34.735f, 36f, 35f, 36f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
