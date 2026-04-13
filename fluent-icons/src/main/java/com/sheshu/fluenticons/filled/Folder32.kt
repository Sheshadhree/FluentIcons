package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Folder32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Folder32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8.5f)
            curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
            horizontalLineToRelative(3.964f)
            curveToRelative(0.929f, 0f, 1.819f, 0.369f, 2.475f, 1.025f)
            lineTo(15f, 7.085f)
            lineToRelative(-3.475f, 3.476f)
            curveTo(11.244f, 10.842f, 10.862f, 11f, 10.465f, 11f)
            horizontalLineTo(2f)
            verticalLineTo(8.5f)
            close()
            moveTo(2f, 13f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(12f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-8.086f)
            lineToRelative(-4.475f, 4.475f)
            curveTo(12.283f, 12.63f, 11.393f, 13f, 10.464f, 13f)
            horizontalLineTo(2f)
            close()
        }
    }.build()
}
