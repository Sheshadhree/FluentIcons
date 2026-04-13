package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Target32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Target32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 18f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(-7f, -2f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
            moveToRelative(7f, -5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveTo(4f, 16.001f)
            curveTo(4f, 9.373f, 9.373f, 4f, 16.001f, 4f)
            curveToRelative(6.628f, 0f, 12.002f, 5.373f, 12.002f, 12.001f)
            curveToRelative(0f, 6.628f, -5.373f, 12.002f, -12.002f, 12.002f)
            curveTo(9.373f, 28.003f, 4f, 22.63f, 4f, 16f)
            close()
            moveTo(16.001f, 6f)
            curveTo(10.478f, 6f, 6f, 10.478f, 6f, 16.001f)
            curveToRelative(0f, 5.524f, 4.478f, 10.002f, 10.001f, 10.002f)
            curveToRelative(5.524f, 0f, 10.002f, -4.478f, 10.002f, -10.002f)
            curveTo(26.003f, 10.478f, 21.525f, 6f, 16f, 6f)
            close()
        }
    }.build()
}
