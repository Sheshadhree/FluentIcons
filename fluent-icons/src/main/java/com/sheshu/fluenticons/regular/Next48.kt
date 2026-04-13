package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Next48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Next48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39.5f, 7.25f)
            curveTo(39.5f, 6.56f, 40.06f, 6f, 40.75f, 6f)
            reflectiveCurveTo(42f, 6.56f, 42f, 7.25f)
            verticalLineToRelative(33.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(7.25f)
            close()
            moveTo(6f, 9.257f)
            verticalLineToRelative(29.487f)
            curveToRelative(0f, 2.615f, 2.931f, 4.16f, 5.088f, 2.68f)
            lineToRelative(21.504f, -14.743f)
            curveToRelative(1.883f, -1.29f, 1.883f, -4.07f, 0f, -5.36f)
            lineTo(11.088f, 6.576f)
            curveTo(8.93f, 5.098f, 6f, 6.642f, 6f, 9.257f)
            close()
            moveTo(9.674f, 8.64f)
            lineToRelative(21.504f, 14.743f)
            curveToRelative(0.435f, 0.298f, 0.435f, 0.94f, 0f, 1.237f)
            lineTo(9.674f, 39.362f)
            curveTo(9.177f, 39.704f, 8.5f, 39.347f, 8.5f, 38.744f)
            verticalLineTo(9.257f)
            curveToRelative(0f, -0.603f, 0.677f, -0.96f, 1.174f, -0.618f)
            close()
        }
    }.build()
}
