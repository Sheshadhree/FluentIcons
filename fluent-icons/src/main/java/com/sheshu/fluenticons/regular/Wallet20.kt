package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Wallet20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Wallet20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 11f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 11f, 14.5f, 11f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.268f)
            curveTo(16.598f, 5.613f, 17f, 6.26f, 17f, 7f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-10f)
            close()
            moveTo(14f, 4f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 4f, 4f, 4.224f, 4f, 4.5f)
            reflectiveCurveTo(4.224f, 5f, 4.5f, 5f)
            horizontalLineTo(15f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveTo(4.5f, 6f)
            curveTo(4.325f, 6f, 4.156f, 5.97f, 4f, 5.915f)
            verticalLineTo(14.5f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineTo(15f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4.5f)
            close()
        }
    }.build()
}
