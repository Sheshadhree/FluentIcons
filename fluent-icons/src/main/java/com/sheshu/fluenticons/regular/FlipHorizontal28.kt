package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipHorizontal28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.882f, 23.654f)
            curveTo(25.744f, 23.869f, 25.506f, 24f, 25.25f, 24f)
            horizontalLineToRelative(-9.5f)
            curveTo(15.336f, 24f, 15f, 23.664f, 15f, 23.25f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.352f, 0.245f, -0.657f, 0.588f, -0.732f)
            curveToRelative(0.344f, -0.076f, 0.694f, 0.097f, 0.842f, 0.417f)
            lineToRelative(9.5f, 20.5f)
            curveToRelative(0.108f, 0.232f, 0.09f, 0.503f, -0.048f, 0.719f)
            close()
            moveTo(16.5f, 6.152f)
            verticalLineTo(22.5f)
            horizontalLineToRelative(7.576f)
            lineTo(16.5f, 6.152f)
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
