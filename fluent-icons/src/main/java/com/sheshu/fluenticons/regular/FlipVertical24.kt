package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.656f, 2.12f)
            curveTo(19.871f, 2.256f, 20f, 2.494f, 20f, 2.75f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveToRelative(-0.353f, 0f, -0.658f, -0.246f, -0.733f, -0.591f)
            curveToRelative(-0.075f, -0.345f, 0.101f, -0.696f, 0.423f, -0.842f)
            lineToRelative(16.5f, -7.5f)
            curveToRelative(0.232f, -0.105f, 0.502f, -0.086f, 0.716f, 0.052f)
            close()
            moveTo(6.213f, 9.5f)
            horizontalLineTo(18.5f)
            verticalLineTo(3.915f)
            lineTo(6.213f, 9.5f)
            close()
            moveTo(20f, 21.5f)
            curveToRelative(0f, 0.171f, -0.087f, 0.33f, -0.232f, 0.422f)
            curveToRelative(-0.145f, 0.092f, -0.326f, 0.103f, -0.48f, 0.03f)
            lineToRelative(-17f, -8f)
            curveToRelative(-0.213f, -0.1f, -0.327f, -0.333f, -0.276f, -0.561f)
            curveTo(2.063f, 13.162f, 2.266f, 13f, 2.5f, 13f)
            horizontalLineToRelative(17f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(8f)
            close()
        }
    }.build()
}
