package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelLeftText20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftText20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            close()
            moveTo(9f, 16f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(9f)
            verticalLineToRelative(12f)
            close()
            moveToRelative(-4.59f, -2.992f)
            curveTo(4.177f, 13.05f, 4f, 13.255f, 4f, 13.5f)
            curveTo(4f, 13.776f, 4.224f, 14f, 4.5f, 14f)
            horizontalLineToRelative(2f)
            lineToRelative(0.09f, -0.008f)
            curveTo(6.823f, 13.95f, 7f, 13.745f, 7f, 13.5f)
            curveTo(7f, 13.224f, 6.776f, 13f, 6.5f, 13f)
            horizontalLineToRelative(-2f)
            lineToRelative(-0.09f, 0.008f)
            close()
            moveTo(4.5f, 9.5f)
            curveTo(4.224f, 9.5f, 4f, 9.724f, 4f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveTo(6.776f, 10.5f, 7f, 10.276f, 7f, 10f)
            reflectiveCurveTo(6.776f, 9.5f, 6.5f, 9.5f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(4.41f, 6.008f)
            curveTo(4.177f, 6.05f, 4f, 6.255f, 4f, 6.5f)
            curveTo(4f, 6.776f, 4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(2f)
            lineToRelative(0.09f, -0.008f)
            curveTo(6.823f, 6.95f, 7f, 6.745f, 7f, 6.5f)
            curveTo(7f, 6.224f, 6.776f, 6f, 6.5f, 6f)
            horizontalLineToRelative(-2f)
            lineTo(4.41f, 6.008f)
            close()
        }
    }.build()
}
