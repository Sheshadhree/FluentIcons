package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelTopExpand20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelTopExpand20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 11.174f)
            lineToRelative(0.874f, -0.998f)
            curveToRelative(0.182f, -0.208f, 0.497f, -0.23f, 0.705f, -0.047f)
            curveToRelative(0.208f, 0.181f, 0.23f, 0.497f, 0.047f, 0.705f)
            lineToRelative(-1.75f, 2f)
            curveToRelative(-0.095f, 0.109f, -0.232f, 0.17f, -0.376f, 0.17f)
            reflectiveCurveToRelative(-0.281f, -0.061f, -0.376f, -0.17f)
            lineToRelative(-1.75f, -2f)
            curveTo(7.692f, 10.626f, 7.713f, 10.31f, 7.92f, 10.13f)
            curveToRelative(0.208f, -0.182f, 0.523f, -0.161f, 0.705f, 0.047f)
            lineTo(9.5f, 11.174f)
            verticalLineTo(7.495f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3.68f)
            close()
            moveTo(4f, 16f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(-1f, -2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            horizontalLineToRelative(-5.5f)
            verticalLineTo(8f)
            horizontalLineTo(17f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(1f)
            horizontalLineTo(3f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
