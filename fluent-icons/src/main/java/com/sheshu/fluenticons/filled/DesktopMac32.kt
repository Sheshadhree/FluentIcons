package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopMac32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopMac32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.02f, 7.591f)
            curveTo(4.008f, 7.726f, 4f, 7.861f, 4f, 8f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(4f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(8f)
            curveTo(5.929f, 4f, 4.226f, 5.574f, 4.02f, 7.591f)
            close()
            moveTo(18f, 24f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.35f, 0.06f, 0.687f, 0.17f, 1f)
            horizontalLineToRelative(-4.34f)
            curveToRelative(0.11f, -0.313f, 0.17f, -0.65f, 0.17f, -1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(6f, -2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            horizontalLineToRelative(20f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            close()
        }
    }.build()
}
