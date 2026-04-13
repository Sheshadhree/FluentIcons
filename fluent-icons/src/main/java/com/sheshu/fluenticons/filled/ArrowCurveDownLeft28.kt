package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCurveDownLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCurveDownLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.868f, 3.504f)
            curveToRelative(0.274f, 0.48f, 0.108f, 1.09f, -0.372f, 1.364f)
            curveTo(15.138f, 7.36f, 15f, 11.476f, 15f, 15f)
            verticalLineToRelative(7.086f)
            lineToRelative(4.293f, -4.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-6f, 6f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-6f, -6f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(13f, 22.086f)
            verticalLineTo(15f)
            curveToRelative(0f, -3.475f, 0.063f, -8.759f, 5.504f, -11.868f)
            curveToRelative(0.48f, -0.274f, 1.09f, -0.107f, 1.364f, 0.372f)
            close()
        }
    }.build()
}
