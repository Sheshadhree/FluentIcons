package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonHeart48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonHeart48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(34.798f, 27.01f)
            curveToRelative(2.562f, -2.68f, 6.842f, -2.68f, 9.404f, 0f)
            curveToRelative(2.403f, 2.515f, 2.403f, 6.474f, 0f, 8.988f)
            lineToRelative(-9.115f, 9.538f)
            curveToRelative(-0.59f, 0.618f, -1.578f, 0.618f, -2.169f, 0f)
            lineToRelative(-9.116f, -9.538f)
            curveToRelative(-2.403f, -2.514f, -2.403f, -6.473f, 0f, -8.987f)
            curveToRelative(2.561f, -2.68f, 6.842f, -2.68f, 9.404f, 0f)
            lineToRelative(0.796f, 0.832f)
            lineToRelative(0.796f, -0.832f)
            close()
            moveTo(20.753f, 28f)
            curveToRelative(-1.39f, 3.076f, -0.855f, 6.806f, 1.603f, 9.379f)
            lineToRelative(5.704f, 5.969f)
            curveTo(26.174f, 43.786f, 24.123f, 44f, 22f, 44f)
            curveToRelative(-4.214f, 0f, -8.151f, -0.837f, -11.08f, -2.62f)
            curveTo(7.942f, 39.567f, 6f, 36.755f, 6f, 33f)
            verticalLineToRelative(-0.751f)
            curveTo(6f, 29.901f, 7.903f, 28f, 10.25f, 28f)
            horizontalLineToRelative(10.503f)
            close()
            moveTo(22f, 4f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
            reflectiveCurveTo(16.477f, 4f, 22f, 4f)
            close()
        }
    }.build()
}
