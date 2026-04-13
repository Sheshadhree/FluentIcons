package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Target24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Target24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.998f, 14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            curveToRelative(0f, -1.104f, -0.895f, -2f, -2f, -2f)
            curveToRelative(-1.104f, 0f, -2f, 0.896f, -2f, 2f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            close()
            moveToRelative(-6f, -2f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-3.313f, 0f, -6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(6f, -4.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(1.996f, 12f)
            curveToRelative(0f, -5.524f, 4.478f, -10.002f, 10.002f, -10.002f)
            curveTo(17.522f, 1.998f, 22f, 6.476f, 22f, 12f)
            curveToRelative(0f, 5.524f, -4.478f, 10.002f, -10.002f, 10.002f)
            curveToRelative(-5.524f, 0f, -10.002f, -4.478f, -10.002f, -10.002f)
            close()
            moveToRelative(10.002f, -8.502f)
            curveToRelative(-4.695f, 0f, -8.502f, 3.807f, -8.502f, 8.502f)
            curveToRelative(0f, 4.696f, 3.807f, 8.502f, 8.502f, 8.502f)
            curveToRelative(4.696f, 0f, 8.502f, -3.806f, 8.502f, -8.502f)
            curveToRelative(0f, -4.695f, -3.806f, -8.502f, -8.502f, -8.502f)
            close()
        }
    }.build()
}
