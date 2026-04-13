package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipVertical28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.543f, 2.16f)
            curveTo(23.828f, 2.344f, 24f, 2.66f, 24f, 3f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveToRelative(-0.471f, 0f, -0.879f, -0.33f, -0.978f, -0.79f)
            curveToRelative(-0.099f, -0.461f, 0.138f, -0.929f, 0.568f, -1.122f)
            lineToRelative(20f, -9f)
            curveToRelative(0.31f, -0.14f, 0.668f, -0.112f, 0.953f, 0.072f)
            close()
            moveTo(7.66f, 11f)
            horizontalLineTo(22f)
            verticalLineTo(4.547f)
            lineTo(7.66f, 11f)
            close()
            moveTo(24f, 25.25f)
            curveToRelative(0f, 0.256f, -0.13f, 0.494f, -0.346f, 0.632f)
            curveToRelative(-0.216f, 0.138f, -0.487f, 0.156f, -0.719f, 0.048f)
            lineToRelative(-20.5f, -9.5f)
            curveToRelative(-0.32f, -0.148f, -0.493f, -0.498f, -0.417f, -0.841f)
            curveTo(2.094f, 15.245f, 2.398f, 15f, 2.75f, 15f)
            horizontalLineToRelative(20.5f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(9.5f)
            close()
        }
    }.build()
}
