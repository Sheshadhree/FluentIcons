package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelBottomExpand20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelBottomExpand20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 8.826f)
            lineToRelative(0.874f, 0.998f)
            curveToRelative(0.182f, 0.208f, 0.497f, 0.23f, 0.705f, 0.047f)
            curveToRelative(0.208f, -0.181f, 0.23f, -0.497f, 0.047f, -0.705f)
            lineToRelative(-1.75f, -2f)
            curveToRelative(-0.095f, -0.109f, -0.232f, -0.17f, -0.376f, -0.17f)
            reflectiveCurveToRelative(-0.281f, 0.061f, -0.376f, 0.17f)
            lineToRelative(-1.75f, 2f)
            curveTo(7.692f, 9.374f, 7.713f, 9.69f, 7.92f, 9.87f)
            curveToRelative(0.208f, 0.182f, 0.523f, 0.161f, 0.705f, -0.047f)
            lineTo(9.5f, 8.826f)
            verticalLineToRelative(3.679f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3.68f)
            close()
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(1.505f)
            curveToRelative(0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(11f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
