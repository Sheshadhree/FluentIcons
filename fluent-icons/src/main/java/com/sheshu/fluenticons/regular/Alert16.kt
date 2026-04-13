package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Alert16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Alert16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.515f, 2f, 3.5f, 4.015f, 3.5f, 6.5f)
            verticalLineToRelative(2.401f)
            lineToRelative(-0.964f, 2.414f)
            curveToRelative(-0.062f, 0.154f, -0.043f, 0.328f, 0.05f, 0.465f)
            curveTo(2.679f, 11.918f, 2.834f, 12f, 3f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(0f, 1.108f, 0.892f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.892f, 2f, -2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.166f, 0f, 0.321f, -0.082f, 0.414f, -0.22f)
            curveToRelative(0.093f, -0.137f, 0.112f, -0.311f, 0.05f, -0.465f)
            lineTo(12.5f, 8.9f)
            verticalLineTo(6.5f)
            curveTo(12.5f, 4.015f, 10.485f, 2f, 8f, 2f)
            close()
            moveToRelative(1f, 10f)
            curveToRelative(0f, 0.556f, -0.444f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.444f, -1f, -1f)
            horizontalLineToRelative(2f)
            close()
            moveTo(4.5f, 6.5f)
            curveTo(4.5f, 4.567f, 6.067f, 3f, 8f, 3f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(2.498f)
            curveToRelative(0f, 0.063f, 0.012f, 0.126f, 0.036f, 0.185f)
            lineTo(12.262f, 11f)
            horizontalLineTo(3.738f)
            lineToRelative(0.726f, -1.817f)
            curveTo(4.488f, 9.124f, 4.5f, 9.061f, 4.5f, 8.998f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}
