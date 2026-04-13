package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipHorizontal28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.84f, 23.543f)
            curveTo(25.656f, 23.828f, 25.34f, 24f, 25f, 24f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.471f, 0.33f, -0.879f, 0.79f, -0.978f)
            curveToRelative(0.461f, -0.099f, 0.928f, 0.138f, 1.122f, 0.568f)
            lineToRelative(9f, 20f)
            curveToRelative(0.14f, 0.31f, 0.112f, 0.668f, -0.072f, 0.953f)
            close()
            moveTo(17f, 7.66f)
            verticalLineTo(22f)
            horizontalLineToRelative(6.453f)
            lineTo(17f, 7.66f)
            close()
            moveTo(2.75f, 24f)
            curveToRelative(-0.256f, 0f, -0.494f, -0.13f, -0.632f, -0.346f)
            curveToRelative(-0.138f, -0.216f, -0.156f, -0.487f, -0.048f, -0.719f)
            lineToRelative(9.5f, -20.5f)
            curveToRelative(0.147f, -0.32f, 0.498f, -0.493f, 0.841f, -0.417f)
            curveTo(12.755f, 2.094f, 13f, 2.398f, 13f, 2.75f)
            verticalLineToRelative(20.5f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
