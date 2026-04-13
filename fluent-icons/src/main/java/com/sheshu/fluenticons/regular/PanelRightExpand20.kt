package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelRightExpand20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRightExpand20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.821f, 10.5f)
            lineToRelative(0.998f, 0.874f)
            curveToRelative(0.208f, 0.182f, 0.23f, 0.497f, 0.048f, 0.705f)
            curveToRelative(-0.182f, 0.208f, -0.498f, 0.23f, -0.706f, 0.047f)
            lineToRelative(-2f, -1.75f)
            curveToRelative(-0.108f, -0.095f, -0.17f, -0.232f, -0.17f, -0.376f)
            reflectiveCurveToRelative(0.062f, -0.281f, 0.17f, -0.376f)
            lineToRelative(2f, -1.75f)
            curveTo(7.369f, 7.692f, 7.685f, 7.713f, 7.867f, 7.92f)
            curveToRelative(0.181f, 0.208f, 0.16f, 0.523f, -0.048f, 0.705f)
            lineTo(6.821f, 9.5f)
            horizontalLineTo(10.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(6.821f)
            close()
            moveTo(18f, 14f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            close()
            moveToRelative(-2f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-4f, 0f)
            verticalLineTo(5f)
            horizontalLineTo(4f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            close()
        }
    }.build()
}
