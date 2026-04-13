package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Broom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Broom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.453f, 1.923f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(-6.928f, 6.929f)
            curveToRelative(1.735f, 2.255f, 1.57f, 5.501f, -0.496f, 7.567f)
            lineToRelative(-0.832f, 0.832f)
            lineToRelative(-2.787f, 4.18f)
            curveToRelative(-0.124f, 0.187f, -0.326f, 0.308f, -0.55f, 0.33f)
            curveToRelative(-0.224f, 0.023f, -0.445f, -0.056f, -0.604f, -0.215f)
            lineTo(1.77f, 14.12f)
            curveToRelative(-0.158f, -0.159f, -0.238f, -0.38f, -0.216f, -0.604f)
            curveToRelative(0.023f, -0.223f, 0.144f, -0.425f, 0.33f, -0.55f)
            lineToRelative(4.182f, -2.787f)
            lineToRelative(0.831f, -0.832f)
            curveToRelative(2.066f, -2.065f, 5.312f, -2.23f, 7.567f, -0.496f)
            lineToRelative(6.929f, -6.928f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
            moveTo(7.604f, 10.762f)
            lineToRelative(6.01f, 6.01f)
            lineToRelative(0.354f, -0.353f)
            curveToRelative(1.66f, -1.66f, 1.66f, -4.351f, 0f, -6.01f)
            curveToRelative(-1.66f, -1.66f, -4.35f, -1.66f, -6.01f, 0f)
            lineToRelative(-0.354f, 0.353f)
            close()
            moveToRelative(-1.156f, 0.965f)
            lineToRelative(-2.97f, 1.98f)
            lineToRelative(7.191f, 7.191f)
            lineToRelative(1.98f, -2.97f)
            lineToRelative(-6.201f, -6.201f)
            close()
        }
    }.build()
}
