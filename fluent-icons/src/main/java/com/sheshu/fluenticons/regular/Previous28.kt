package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Previous28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Previous28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3.75f)
            curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
            reflectiveCurveTo(3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(20.5f)
            curveTo(3f, 24.664f, 3.336f, 25f, 3.75f, 25f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveTo(25f, 5.254f)
            curveToRelative(0f, -1.816f, -2.041f, -2.884f, -3.533f, -1.848f)
            lineToRelative(-12.504f, 8.68f)
            curveToRelative(-1.284f, 0.891f, -1.29f, 2.787f, -0.013f, 3.688f)
            lineToRelative(12.504f, 8.81f)
            curveTo(22.944f, 25.634f, 25f, 24.57f, 25f, 22.745f)
            verticalLineTo(5.254f)
            close()
            moveToRelative(-2.678f, -0.616f)
            curveToRelative(0.497f, -0.345f, 1.178f, 0.01f, 1.178f, 0.616f)
            verticalLineToRelative(17.491f)
            curveToRelative(0f, 0.608f, -0.685f, 0.963f, -1.182f, 0.613f)
            lineToRelative(-12.504f, -8.81f)
            curveToRelative(-0.426f, -0.3f, -0.424f, -0.933f, 0.004f, -1.23f)
            lineToRelative(12.504f, -8.68f)
            close()
        }
    }.build()
}
