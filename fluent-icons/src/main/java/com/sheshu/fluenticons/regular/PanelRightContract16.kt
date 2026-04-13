package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelRightContract16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRightContract16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.293f, 8.5f)
            lineTo(5.646f, 9.147f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(6.293f, 7.5f)
            horizontalLineTo(4.502f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1.79f)
            close()
            moveTo(12f, 13.001f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
            verticalLineToRelative(6.002f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(1f, -2f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9.998f)
            verticalLineTo(4f)
            horizontalLineTo(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6.002f)
            close()
            moveTo(8.998f, 4f)
            verticalLineToRelative(8.002f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.998f)
            close()
        }
    }.build()
}
