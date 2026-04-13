package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ribbon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ribbon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            curveToRelative(0f, 1.907f, -0.763f, 3.636f, -2f, 4.898f)
            verticalLineToRelative(7.352f)
            curveToRelative(0f, 0.572f, -0.607f, 0.92f, -1.093f, 0.668f)
            lineToRelative(-0.09f, -0.055f)
            lineTo(12f, 19.176f)
            lineToRelative(-3.816f, 2.687f)
            curveToRelative(-0.468f, 0.33f, -1.102f, 0.034f, -1.175f, -0.508f)
            lineTo(7f, 21.25f)
            lineToRelative(-0.002f, -7.352f)
            curveTo(5.763f, 12.636f, 5f, 10.907f, 5f, 9f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(3.5f, 17.805f)
            verticalLineToRelative(-4.741f)
            curveTo(14.47f, 15.659f, 13.274f, 16f, 12f, 16f)
            reflectiveCurveToRelative(-2.47f, -0.34f, -3.5f, -0.936f)
            verticalLineToRelative(4.74f)
            lineToRelative(3.067f, -2.159f)
            curveToRelative(0.227f, -0.16f, 0.52f, -0.18f, 0.763f, -0.06f)
            lineToRelative(0.1f, 0.06f)
            lineToRelative(3.07f, 2.16f)
            verticalLineToRelative(-4.741f)
            verticalLineToRelative(4.741f)
            close()
            moveTo(12f, 3.5f)
            curveTo(8.962f, 3.5f, 6.5f, 5.962f, 6.5f, 9f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveToRelative(-2.462f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.build()
}
