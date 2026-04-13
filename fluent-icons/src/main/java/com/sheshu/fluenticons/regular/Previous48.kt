package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Previous48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Previous48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 7.25f)
            curveTo(8.5f, 6.56f, 7.94f, 6f, 7.25f, 6f)
            reflectiveCurveTo(6f, 6.56f, 6f, 7.25f)
            verticalLineToRelative(33.5f)
            curveTo(6f, 41.44f, 6.56f, 42f, 7.25f, 42f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(7.25f)
            close()
            moveTo(42f, 9.257f)
            curveToRelative(0f, -2.615f, -2.931f, -4.159f, -5.088f, -2.68f)
            lineTo(15.408f, 21.32f)
            curveToRelative(-1.883f, 1.291f, -1.883f, 4.07f, 0f, 5.361f)
            lineToRelative(21.504f, 14.743f)
            curveTo(39.07f, 42.904f, 42f, 41.36f, 42f, 38.744f)
            verticalLineTo(9.257f)
            close()
            moveTo(38.326f, 8.64f)
            curveTo(38.824f, 8.297f, 39.5f, 8.654f, 39.5f, 9.257f)
            verticalLineToRelative(29.487f)
            curveToRelative(0f, 0.603f, -0.676f, 0.96f, -1.174f, 0.618f)
            lineTo(16.822f, 24.62f)
            curveToRelative(-0.435f, -0.297f, -0.435f, -0.939f, 0f, -1.237f)
            lineTo(38.326f, 8.64f)
            close()
        }
    }.build()
}
