package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.InkingTool16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.InkingTool16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 1.5f)
            curveTo(2f, 1.224f, 1.776f, 1f, 1.5f, 1f)
            reflectiveCurveTo(1f, 1.224f, 1f, 1.5f)
            verticalLineToRelative(2f)
            curveTo(1f, 4.328f, 1.672f, 5f, 2.5f, 5f)
            horizontalLineToRelative(0.252f)
            lineToRelative(3.262f, 6.451f)
            curveToRelative(0.121f, 0.24f, 0.33f, 0.415f, 0.576f, 0.498f)
            curveToRelative(-0.122f, 0.624f, -0.111f, 1.233f, 0.021f, 1.74f)
            curveTo(6.78f, 14.328f, 7.215f, 15f, 8.005f, 15f)
            curveToRelative(0.79f, 0f, 1.226f, -0.672f, 1.393f, -1.31f)
            curveToRelative(0.133f, -0.509f, 0.144f, -1.12f, 0.02f, -1.745f)
            curveToRelative(0.242f, -0.084f, 0.447f, -0.258f, 0.566f, -0.494f)
            lineTo(13.247f, 5f)
            horizontalLineTo(13.5f)
            curveTo(14.328f, 5f, 15f, 4.328f, 15f, 3.5f)
            verticalLineToRelative(-2f)
            curveTo(15f, 1.224f, 14.776f, 1f, 14.5f, 1f)
            reflectiveCurveTo(14f, 1.224f, 14f, 1.5f)
            verticalLineToRelative(2f)
            curveTo(14f, 3.776f, 13.776f, 4f, 13.5f, 4f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(3.873f, 5f)
            horizontalLineToRelative(8.253f)
            lineToRelative(-3.034f, 6f)
            horizontalLineTo(6.907f)
            lineTo(3.873f, 5f)
            close()
            moveToRelative(3.729f, 7f)
            horizontalLineToRelative(0.806f)
            curveToRelative(0.129f, 0.547f, 0.122f, 1.059f, 0.023f, 1.436f)
            curveTo(8.304f, 13.922f, 8.099f, 14f, 8.005f, 14f)
            curveToRelative(-0.094f, 0f, -0.299f, -0.078f, -0.426f, -0.564f)
            curveTo(7.48f, 13.059f, 7.473f, 12.547f, 7.602f, 12f)
            close()
        }
    }.build()
}
