package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareDovetailJoint20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareDovetailJoint20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveTo(4f, 14f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4.227f)
            curveToRelative(0f, 0.164f, 0.08f, 0.317f, 0.214f, 0.41f)
            curveToRelative(0.134f, 0.094f, 0.308f, 0.114f, 0.459f, 0.059f)
            lineTo(12f, 7.467f)
            verticalLineToRelative(5.061f)
            lineToRelative(-3.324f, -1.247f)
            curveToRelative(-0.155f, -0.058f, -0.326f, -0.036f, -0.461f, 0.057f)
            curveTo(8.08f, 11.432f, 8f, 11.585f, 8f, 11.749f)
            verticalLineToRelative(4.25f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(14f)
            close()
            moveToRelative(12f, 0f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            verticalLineToRelative(-3.528f)
            lineToRelative(3.324f, 1.247f)
            curveToRelative(0.155f, 0.058f, 0.325f, 0.036f, 0.461f, -0.057f)
            curveTo(12.92f, 13.568f, 13f, 13.415f, 13f, 13.251f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.164f, -0.08f, -0.317f, -0.214f, -0.41f)
            curveToRelative(-0.135f, -0.095f, -0.31f, -0.116f, -0.459f, -0.059f)
            lineTo(9f, 7.511f)
            verticalLineTo(4.002f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            verticalLineTo(14f)
            close()
        }
    }.build()
}
