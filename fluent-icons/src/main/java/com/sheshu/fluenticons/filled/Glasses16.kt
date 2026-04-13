package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Glasses16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Glasses16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.168f, 3.126f)
            curveTo(5.26f, 3.045f, 5.378f, 3f, 5.5f, 3f)
            horizontalLineToRelative(1f)
            curveTo(6.776f, 3f, 7f, 3.224f, 7f, 3.5f)
            reflectiveCurveTo(6.776f, 4f, 6.5f, 4f)
            horizontalLineTo(5.69f)
            lineTo(3.438f, 6f)
            horizontalLineTo(5.5f)
            curveTo(6.328f, 6f, 7f, 6.672f, 7f, 7.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(2f)
            verticalLineTo(7.5f)
            curveTo(9f, 6.672f, 9.672f, 6f, 10.5f, 6f)
            horizontalLineToRelative(2.062f)
            lineTo(10.31f, 4f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 4f, 9f, 3.776f, 9f, 3.5f)
            reflectiveCurveTo(9.224f, 3f, 9.5f, 3f)
            horizontalLineToRelative(1f)
            curveToRelative(0.122f, 0f, 0.24f, 0.045f, 0.332f, 0.126f)
            lineToRelative(3.622f, 3.216f)
            curveTo(14.787f, 6.617f, 15f, 7.034f, 15f, 7.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1f)
            curveTo(10.12f, 12f, 9f, 10.88f, 9f, 9.5f)
            verticalLineTo(9f)
            horizontalLineTo(7f)
            verticalLineToRelative(0.5f)
            curveTo(7f, 10.88f, 5.88f, 12f, 4.5f, 12f)
            horizontalLineToRelative(-1f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.466f, 0.213f, -0.883f, 0.546f, -1.158f)
            lineToRelative(3.622f, -3.216f)
            close()
        }
    }.build()
}
