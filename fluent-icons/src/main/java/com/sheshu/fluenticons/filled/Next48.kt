package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Next48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Next48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.75f, 6f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(33.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(42f, 41.44f, 42f, 40.75f)
            verticalLineTo(7.25f)
            curveTo(42f, 6.56f, 41.44f, 6f, 40.75f, 6f)
            close()
            moveTo(6f, 9.256f)
            curveToRelative(0f, -2.615f, 2.931f, -4.16f, 5.088f, -2.68f)
            lineToRelative(21.504f, 14.743f)
            curveToRelative(1.883f, 1.29f, 1.883f, 4.07f, 0f, 5.36f)
            lineTo(11.088f, 41.424f)
            curveTo(8.93f, 42.9f, 6f, 41.357f, 6f, 38.743f)
            verticalLineTo(9.255f)
            close()
        }
    }.build()
}
