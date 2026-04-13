package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DesktopMac32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopMac32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(16f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(10f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-1f)
            horizontalLineTo(8f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(8f)
            close()
            moveToRelative(14.17f, 18f)
            curveTo(18.06f, 25.687f, 18f, 25.35f, 18f, 25f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.35f, -0.06f, 0.687f, -0.17f, 1f)
            horizontalLineToRelative(4.34f)
            close()
            moveTo(24f, 22f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            horizontalLineTo(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(16f)
            close()
            moveToRelative(2f, -14f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            curveTo(6.895f, 6f, 6f, 6.895f, 6f, 8f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(20f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
