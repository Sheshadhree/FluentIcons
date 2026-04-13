package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopMac16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopMac16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.01f, 3.796f)
            curveTo(2.004f, 3.863f, 2f, 3.93f, 2f, 4f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveTo(6f, 12.776f, 5.776f, 13f, 5.5f, 13f)
            horizontalLineTo(5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(4.724f, 14f, 5f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.276f, 13f, 11f, 13f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveTo(2.965f, 2f, 2.113f, 2.787f, 2.01f, 3.796f)
            close()
            moveTo(9f, 12f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.175f, 0.03f, 0.344f, 0.085f, 0.5f)
            horizontalLineToRelative(-2.17f)
            curveTo(6.97f, 12.844f, 7f, 12.675f, 7f, 12.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(3f, -1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
