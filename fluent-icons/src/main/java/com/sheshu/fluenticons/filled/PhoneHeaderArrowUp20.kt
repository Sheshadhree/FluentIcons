package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneHeaderArrowUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneHeaderArrowUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2f)
            curveTo(5.895f, 2f, 5f, 2.895f, 5f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(7f, 4.224f, 7.224f, 4f, 7.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 5f, 7f, 4.776f, 7f, 4.5f)
            close()
            moveToRelative(5.354f, 3.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            lineTo(10.5f, 7.708f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(7.707f)
            lineTo(8.354f, 8.854f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            lineToRelative(2f, -2f)
            curveToRelative(0.047f, -0.049f, 0.103f, -0.085f, 0.162f, -0.11f)
            curveTo(9.867f, 6.015f, 9.93f, 6f, 9.997f, 6f)
            horizontalLineToRelative(0.006f)
            curveToRelative(0.067f, 0f, 0.13f, 0.014f, 0.188f, 0.038f)
            curveToRelative(0.058f, 0.024f, 0.113f, 0.06f, 0.16f, 0.106f)
            lineToRelative(0.003f, 0.003f)
            lineToRelative(2f, 2f)
            close()
        }
    }.build()
}
