package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipVertical28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipVertical28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.654f, 2.118f)
            curveTo(23.869f, 2.256f, 24f, 2.494f, 24f, 2.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveToRelative(-0.352f, 0f, -0.657f, -0.245f, -0.732f, -0.588f)
            curveToRelative(-0.076f, -0.344f, 0.097f, -0.695f, 0.417f, -0.843f)
            lineToRelative(20.5f, -9.5f)
            curveToRelative(0.232f, -0.107f, 0.503f, -0.089f, 0.719f, 0.049f)
            close()
            moveTo(6.152f, 11.5f)
            horizontalLineTo(22.5f)
            verticalLineTo(3.924f)
            lineTo(6.152f, 11.5f)
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
