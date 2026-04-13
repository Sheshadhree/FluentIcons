package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveTo(5.895f, 6f, 5f, 6.896f, 5f, 8f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(13f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 2.209f, -1.791f, 4f, -4f, 4f)
            horizontalLineTo(7f)
            curveToRelative(-2.21f, 0f, -4f, -1.791f, -4f, -4f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.209f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(7.293f, -0.707f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(13.121f, 16.293f)
            lineTo(11f, 17f)
            lineToRelative(0.707f, -2.121f)
            lineTo(23.293f, 3.293f)
            close()
        }
    }.build()
}
