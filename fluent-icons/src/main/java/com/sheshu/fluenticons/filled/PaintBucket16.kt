package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBucket16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBucket16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1.5f)
            curveTo(8f, 1.224f, 7.776f, 1f, 7.5f, 1f)
            reflectiveCurveTo(7f, 1.224f, 7f, 1.5f)
            verticalLineToRelative(0.838f)
            curveTo(6.748f, 2.402f, 6.51f, 2.533f, 6.313f, 2.73f)
            lineTo(1.337f, 7.706f)
            curveTo(0.76f, 8.282f, 0.75f, 9.212f, 1.31f, 9.802f)
            lineToRelative(3.62f, 3.8f)
            curveToRelative(0.582f, 0.611f, 1.551f, 0.623f, 2.147f, 0.027f)
            lineToRelative(5.068f, -5.068f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineTo(8.434f, 2.73f)
            curveTo(8.304f, 2.6f, 8.157f, 2.5f, 8f, 2.429f)
            verticalLineTo(1.5f)
            close()
            moveTo(11.293f, 8f)
            horizontalLineTo(2.457f)
            lineTo(7f, 3.457f)
            verticalLineTo(4.5f)
            curveTo(7f, 4.776f, 7.224f, 5f, 7.5f, 5f)
            reflectiveCurveTo(8f, 4.776f, 8f, 4.5f)
            verticalLineTo(3.71f)
            lineToRelative(3.439f, 3.437f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(11.293f, 8f)
            close()
            moveToRelative(1.628f, 2.222f)
            curveToRelative(-0.223f, -0.255f, -0.62f, -0.255f, -0.842f, 0f)
            lineToRelative(-1.15f, 1.315f)
            curveTo(9.746f, 12.887f, 10.705f, 15f, 12.5f, 15f)
            reflectiveCurveToRelative(2.753f, -2.113f, 1.572f, -3.463f)
            lineToRelative(-1.15f, -1.315f)
            close()
        }
    }.build()
}
