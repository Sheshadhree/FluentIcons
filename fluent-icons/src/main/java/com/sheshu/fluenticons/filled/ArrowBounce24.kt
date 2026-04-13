package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBounce24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBounce24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            curveTo(2.448f, 6f, 2f, 6.448f, 2f, 7f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(9.414f)
            lineToRelative(8.043f, 8.043f)
            curveToRelative(0.188f, 0.188f, 0.442f, 0.293f, 0.707f, 0.293f)
            curveToRelative(0.265f, 0f, 0.52f, -0.105f, 0.707f, -0.293f)
            lineToRelative(8.25f, -8.25f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-7.543f, 7.543f)
            lineTo(5.414f, 8f)
            horizontalLineTo(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
