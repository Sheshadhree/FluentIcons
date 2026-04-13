package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveToRelative(-3.935f, 1.779f)
            curveTo(14.405f, 5.414f, 16.037f, 4f, 18f, 4f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            curveToRelative(-1.935f, 0f, -3.549f, -1.374f, -3.92f, -3.2f)
            curveToRelative(-0.764f, 0.189f, -1.33f, 0.878f, -1.33f, 1.7f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.647f, -1.226f, 3.009f, -2.815f, 3.221f)
            curveTo(9.595f, 18.586f, 7.963f, 20f, 6f, 20f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            curveToRelative(1.935f, 0f, 3.549f, 1.374f, 3.92f, 3.2f)
            curveToRelative(0.764f, -0.189f, 1.33f, -0.878f, 1.33f, -1.7f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.647f, 1.226f, -3.008f, 2.815f, -3.221f)
            close()
            moveTo(6f, 13.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
        }
    }.build()
}
