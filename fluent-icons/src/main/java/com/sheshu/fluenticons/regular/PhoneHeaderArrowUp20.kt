package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhoneHeaderArrowUp20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneHeaderArrowUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4.5f)
            curveTo(7f, 4.224f, 7.224f, 4f, 7.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 5f, 7f, 4.776f, 7f, 4.5f)
            close()
            moveTo(5f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(2f, -1f)
            curveTo(6.448f, 3f, 6f, 3.448f, 6f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
            moveToRelative(5.354f, 5.146f)
            lineToRelative(-2f, -2f)
            lineToRelative(-0.003f, -0.002f)
            curveToRelative(-0.047f, -0.047f, -0.102f, -0.082f, -0.16f, -0.106f)
            curveTo(10.133f, 6.014f, 10.07f, 6f, 10.003f, 6f)
            horizontalLineTo(9.997f)
            curveTo(9.93f, 6f, 9.867f, 6.014f, 9.809f, 6.038f)
            curveToRelative(-0.06f, 0.024f, -0.115f, 0.06f, -0.162f, 0.108f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0f)
            lineTo(9.5f, 7.708f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7.707f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
