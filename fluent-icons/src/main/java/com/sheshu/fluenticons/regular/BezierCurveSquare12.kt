package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BezierCurveSquare12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BezierCurveSquare12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(3f)
            close()
            moveToRelative(1f, 5.968f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8.968f)
            curveTo(9.24f, 8.866f, 8.667f, 8.53f, 8.233f, 8.057f)
            curveTo(7.73f, 7.507f, 7.437f, 6.799f, 7.216f, 6.165f)
            curveToRelative(-0.07f, -0.2f, -0.133f, -0.39f, -0.191f, -0.567f)
            curveToRelative(-0.14f, -0.425f, -0.26f, -0.786f, -0.415f, -1.087f)
            curveTo(6.404f, 4.11f, 6.224f, 4f, 6f, 4f)
            curveTo(5.776f, 4f, 5.596f, 4.11f, 5.39f, 4.51f)
            curveTo(5.234f, 4.813f, 5.114f, 5.174f, 4.974f, 5.599f)
            curveToRelative(-0.058f, 0.178f, -0.12f, 0.367f, -0.19f, 0.567f)
            curveTo(4.562f, 6.8f, 4.27f, 7.508f, 3.766f, 8.057f)
            curveTo(3.333f, 8.53f, 2.76f, 8.866f, 2f, 8.967f)
            close()
            moveToRelative(8f, -1.013f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
            verticalLineToRelative(4.955f)
            curveToRelative(0.457f, -0.088f, 0.779f, -0.3f, 1.03f, -0.574f)
            curveToRelative(0.356f, -0.389f, 0.595f, -0.93f, 0.81f, -1.546f)
            curveToRelative(0.053f, -0.15f, 0.105f, -0.309f, 0.158f, -0.47f)
            curveToRelative(0.15f, -0.457f, 0.308f, -0.937f, 0.503f, -1.313f)
            curveTo(4.78f, 3.515f, 5.224f, 3f, 6f, 3f)
            curveToRelative(0.776f, 0f, 1.221f, 0.514f, 1.499f, 1.052f)
            curveToRelative(0.195f, 0.377f, 0.353f, 0.857f, 0.503f, 1.313f)
            curveToRelative(0.053f, 0.161f, 0.105f, 0.32f, 0.157f, 0.47f)
            curveTo(8.375f, 6.45f, 8.614f, 6.992f, 8.97f, 7.38f)
            curveTo(9.222f, 7.655f, 9.543f, 7.867f, 10f, 7.955f)
            close()
        }
    }.build()
}
