package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.25f, 5.25f)
            curveTo(25.25f, 4.56f, 24.69f, 4f, 24f, 4f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(32.446f)
            lineTo(10.141f, 24.874f)
            curveToRelative(-0.484f, -0.493f, -1.275f, -0.5f, -1.767f, -0.015f)
            curveToRelative(-0.493f, 0.484f, -0.5f, 1.275f, -0.015f, 1.767f)
            lineToRelative(14.75f, 15f)
            curveTo(23.344f, 41.866f, 23.665f, 42f, 24f, 42f)
            curveToRelative(0.335f, 0f, 0.656f, -0.135f, 0.891f, -0.374f)
            lineToRelative(14.75f, -15f)
            curveToRelative(0.484f, -0.492f, 0.478f, -1.283f, -0.015f, -1.767f)
            curveToRelative(-0.492f, -0.484f, -1.283f, -0.478f, -1.767f, 0.015f)
            lineTo(25.25f, 37.696f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}
