package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BowlChopsticks20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BowlChopsticks20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.926f, 2.238f)
            curveTo(4.78f, 2.003f, 4.473f, 1.93f, 4.238f, 2.074f)
            curveTo(4.003f, 2.22f, 3.929f, 2.527f, 4.074f, 2.762f)
            lineTo(7.913f, 9f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 4.418f, 3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            verticalLineTo(9.5f)
            curveTo(18f, 9.224f, 17.776f, 9f, 17.5f, 9f)
            horizontalLineToRelative(-5.413f)
            lineTo(7.926f, 2.238f)
            curveTo(7.78f, 2.003f, 7.473f, 1.93f, 7.238f, 2.074f)
            curveTo(7.003f, 2.22f, 6.929f, 2.527f, 7.074f, 2.762f)
            lineTo(10.913f, 9f)
            horizontalLineTo(9.087f)
            lineTo(4.926f, 2.238f)
            close()
            moveTo(3.29f, 12f)
            curveTo(3.1f, 11.366f, 3f, 10.695f, 3f, 10f)
            horizontalLineToRelative(14f)
            curveToRelative(0f, 0.695f, -0.101f, 1.366f, -0.29f, 2f)
            horizontalLineTo(3.29f)
            close()
            moveToRelative(0.384f, 1f)
            horizontalLineToRelative(12.652f)
            curveToRelative(-1.123f, 2.365f, -3.534f, 4f, -6.326f, 4f)
            reflectiveCurveToRelative(-5.203f, -1.635f, -6.326f, -4f)
            close()
        }
    }.build()
}
