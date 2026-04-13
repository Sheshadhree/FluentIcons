package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SwipeRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SwipeRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 12f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(11.585f)
            lineToRelative(-1.292f, 1.293f)
            curveToRelative(-0.36f, 0.36f, -0.388f, 0.928f, -0.083f, 1.32f)
            lineToRelative(0.083f, 0.094f)
            curveToRelative(0.36f, 0.36f, 0.928f, 0.388f, 1.32f, 0.083f)
            lineToRelative(0.094f, -0.083f)
            lineToRelative(3f, -3f)
            curveToRelative(0.36f, -0.36f, 0.388f, -0.928f, 0.083f, -1.32f)
            lineToRelative(-0.083f, -0.094f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.36f, 0.36f, -0.388f, 0.928f, -0.083f, 1.32f)
            lineToRelative(0.083f, 0.094f)
            lineTo(18.585f, 11f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(-4f, 0f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            curveToRelative(2.05f, 0f, 3.812f, -1.234f, 4.584f, -3f)
            horizontalLineTo(9.872f)
            curveTo(9.239f, 14.908f, 8.189f, 15.5f, 7f, 15.5f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(5.067f, 8.5f, 7f, 8.5f)
            curveToRelative(1.19f, 0f, 2.24f, 0.593f, 2.873f, 1.5f)
            horizontalLineToRelative(1.711f)
            curveTo(10.813f, 8.235f, 9.05f, 7f, 7f, 7f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            close()
        }
    }.build()
}
