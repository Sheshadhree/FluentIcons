package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 12f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            curveToRelative(-1.32f, 0f, -2.554f, 0.365f, -3.608f, 1f)
            horizontalLineTo(9f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveTo(9.552f, 8f, 9f, 8f)
            horizontalLineTo(6f)
            curveTo(5.448f, 8f, 5f, 7.552f, 5f, 7f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.516f)
            curveTo(8.43f, 3.559f, 10.15f, 3f, 12f, 3f)
            curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
            reflectiveCurveToRelative(-4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            curveToRelative(0f, -0.38f, 0.024f, -0.755f, 0.07f, -1.124f)
            curveToRelative(0.068f, -0.548f, 0.568f, -0.937f, 1.116f, -0.868f)
            curveToRelative(0.548f, 0.068f, 0.937f, 0.568f, 0.868f, 1.116f)
            curveTo(5.02f, 11.41f, 5f, 11.703f, 5f, 12f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            close()
        }
    }.build()
}
