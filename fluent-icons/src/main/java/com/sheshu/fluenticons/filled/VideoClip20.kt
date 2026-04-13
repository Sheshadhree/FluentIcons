package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClip20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClip20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 15.88f, 3.12f, 17f, 4.5f, 17f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(18f, 4.12f, 16.88f, 3f, 15.5f, 3f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(4.265f, 4.076f)
            lineToRelative(4f, 2.502f)
            curveTo(12.91f, 9.668f, 12.998f, 9.825f, 13f, 9.995f)
            curveToRelative(0.002f, 0.17f, -0.082f, 0.33f, -0.224f, 0.424f)
            lineToRelative(-4f, 2.648f)
            curveToRelative(-0.153f, 0.101f, -0.35f, 0.11f, -0.513f, 0.024f)
            curveTo(8.101f, 13.003f, 8f, 12.834f, 8f, 12.65f)
            verticalLineTo(7.5f)
            curveToRelative(0f, -0.182f, 0.099f, -0.35f, 0.258f, -0.437f)
            curveTo(8.417f, 6.975f, 8.61f, 6.98f, 8.765f, 7.076f)
            close()
        }
    }.build()
}
