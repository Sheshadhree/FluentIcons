package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DesktopMac16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopMac16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(11f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.276f, 14f, 11f, 14f)
            horizontalLineTo(5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(4.724f, 13f, 5f, 13f)
            horizontalLineToRelative(0.5f)
            curveTo(5.776f, 13f, 6f, 12.776f, 6f, 12.5f)
            verticalLineTo(12f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(1f, 6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            horizontalLineTo(3f)
            close()
            moveToRelative(10f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(10f)
            close()
            moveToRelative(-4f, 3.5f)
            verticalLineTo(12f)
            horizontalLineTo(7f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.175f, -0.03f, 0.344f, -0.085f, 0.5f)
            horizontalLineTo(9.09f)
            curveTo(9.035f, 12.844f, 9f, 12.675f, 9f, 12.5f)
            close()
        }
    }.build()
}
