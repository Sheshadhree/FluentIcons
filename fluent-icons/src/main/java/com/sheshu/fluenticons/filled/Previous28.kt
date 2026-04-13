package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Previous28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Previous28",
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
        }
    }.build()
}
