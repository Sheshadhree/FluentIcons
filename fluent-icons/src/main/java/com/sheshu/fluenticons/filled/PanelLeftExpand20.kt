package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelLeftExpand20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftExpand20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.179f, 10.5f)
            lineToRelative(-0.998f, 0.874f)
            curveToRelative(-0.208f, 0.182f, -0.23f, 0.497f, -0.047f, 0.705f)
            curveToRelative(0.181f, 0.208f, 0.497f, 0.23f, 0.705f, 0.047f)
            lineToRelative(2f, -1.75f)
            curveToRelative(0.108f, -0.095f, 0.17f, -0.232f, 0.17f, -0.376f)
            reflectiveCurveToRelative(-0.062f, -0.281f, -0.17f, -0.376f)
            lineToRelative(-2f, -1.75f)
            curveToRelative(-0.208f, -0.182f, -0.524f, -0.161f, -0.706f, 0.047f)
            curveToRelative(-0.181f, 0.208f, -0.16f, 0.523f, 0.048f, 0.705f)
            lineTo(13.178f, 9.5f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 9.5f, 9f, 9.724f, 9f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3.679f)
            close()
            moveTo(2f, 14f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(8f)
            close()
            moveToRelative(6f, 1f)
            verticalLineTo(5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
