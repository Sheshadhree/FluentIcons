package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatEmpty24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatEmpty24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            curveToRelative(-1.618f, 0f, -3.182f, -0.385f, -4.587f, -1.112f)
            lineToRelative(-3.826f, 1.067f)
            curveToRelative(-0.665f, 0.186f, -1.354f, -0.202f, -1.54f, -0.867f)
            curveToRelative(-0.062f, -0.22f, -0.062f, -0.453f, 0f, -0.673f)
            lineToRelative(1.068f, -3.823f)
            curveTo(2.386f, 15.186f, 2f, 13.62f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            curveToRelative(0f, 1.47f, 0.373f, 2.883f, 1.073f, 4.137f)
            lineToRelative(0.15f, 0.27f)
            lineToRelative(-1.112f, 3.984f)
            lineToRelative(3.986f, -1.112f)
            lineToRelative(0.27f, 0.15f)
            curveTo(9.12f, 20.13f, 10.532f, 20.5f, 12f, 20.5f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveTo(16.694f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}
