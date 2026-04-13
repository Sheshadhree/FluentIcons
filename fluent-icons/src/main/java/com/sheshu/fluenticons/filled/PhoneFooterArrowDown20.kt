package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneFooterArrowDown20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneFooterArrowDown20",
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
            moveToRelative(0f, 13.5f)
            curveTo(7f, 15.224f, 7.224f, 15f, 7.5f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 16f, 12.5f, 16f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 16f, 7f, 15.776f, 7f, 15.5f)
            close()
            moveToRelative(5.354f, -3.646f)
            lineToRelative(-2f, 2f)
            lineToRelative(-0.003f, 0.002f)
            curveToRelative(-0.047f, 0.047f, -0.102f, 0.082f, -0.16f, 0.106f)
            curveTo(10.133f, 13.986f, 10.07f, 14f, 10.003f, 14f)
            horizontalLineTo(9.997f)
            curveToRelative(-0.067f, 0f, -0.13f, -0.014f, -0.188f, -0.038f)
            curveToRelative(-0.06f, -0.024f, -0.115f, -0.06f, -0.162f, -0.108f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(9.5f, 12.293f)
            verticalLineTo(9.5f)
            curveTo(9.5f, 9.224f, 9.724f, 9f, 10f, 9f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2.793f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
