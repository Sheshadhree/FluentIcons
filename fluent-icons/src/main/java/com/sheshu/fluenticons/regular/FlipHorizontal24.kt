package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.88f, 19.656f)
            curveTo(21.744f, 19.871f, 21.506f, 20f, 21.25f, 20f)
            horizontalLineToRelative(-7.5f)
            curveTo(13.336f, 20f, 13f, 19.664f, 13f, 19.25f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.353f, 0.246f, -0.658f, 0.591f, -0.733f)
            curveToRelative(0.345f, -0.075f, 0.696f, 0.101f, 0.842f, 0.423f)
            lineToRelative(7.5f, 16.5f)
            curveToRelative(0.105f, 0.232f, 0.086f, 0.502f, -0.052f, 0.716f)
            close()
            moveTo(14.5f, 6.213f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(5.585f)
            lineTo(14.5f, 6.213f)
            close()
            moveTo(2.5f, 20f)
            curveToRelative(-0.171f, 0f, -0.33f, -0.087f, -0.422f, -0.232f)
            curveToRelative(-0.092f, -0.145f, -0.103f, -0.326f, -0.03f, -0.48f)
            lineToRelative(8f, -17f)
            curveToRelative(0.1f, -0.213f, 0.333f, -0.327f, 0.561f, -0.276f)
            curveTo(10.838f, 2.063f, 11f, 2.266f, 11f, 2.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
