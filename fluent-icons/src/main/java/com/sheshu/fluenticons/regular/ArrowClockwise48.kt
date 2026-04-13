package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowClockwise48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowClockwise48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 24f)
            curveToRelative(0f, -8.56f, 6.94f, -15.5f, 15.5f, -15.5f)
            curveToRelative(4.509f, 0f, 8.568f, 1.924f, 11.402f, 5f)
            horizontalLineTo(31.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(30.56f, 16f, 31.25f, 16f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-6.5f)
            curveTo(39f, 7.56f, 38.44f, 7f, 37.75f, 7f)
            reflectiveCurveTo(36.5f, 7.56f, 36.5f, 8.25f)
            verticalLineToRelative(2.798f)
            curveTo(33.263f, 7.924f, 28.856f, 6f, 24f, 6f)
            curveTo(14.059f, 6f, 6f, 14.059f, 6f, 24f)
            reflectiveCurveToRelative(8.059f, 18f, 18f, 18f)
            reflectiveCurveToRelative(18f, -8.059f, 18f, -18f)
            curveToRelative(0f, -1.003f, -0.082f, -1.989f, -0.24f, -2.95f)
            curveToRelative(-0.113f, -0.68f, -0.756f, -1.141f, -1.437f, -1.03f)
            curveToRelative(-0.681f, 0.113f, -1.143f, 0.756f, -1.03f, 1.438f)
            curveTo(39.429f, 22.284f, 39.5f, 23.133f, 39.5f, 24f)
            curveToRelative(0f, 8.56f, -6.94f, 15.5f, -15.5f, 15.5f)
            curveToRelative(-8.56f, 0f, -15.5f, -6.94f, -15.5f, -15.5f)
            close()
        }
    }.build()
}
