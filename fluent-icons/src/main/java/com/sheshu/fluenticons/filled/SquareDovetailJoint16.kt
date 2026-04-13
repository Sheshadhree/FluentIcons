package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareDovetailJoint16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareDovetailJoint16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 9.5f)
            curveToRelative(0f, -0.161f, 0.077f, -0.312f, 0.208f, -0.405f)
            curveTo(6.337f, 9f, 6.505f, 8.976f, 6.658f, 9.026f)
            lineTo(9f, 9.807f)
            verticalLineTo(6.194f)
            lineToRelative(-2.342f, 0.78f)
            curveToRelative(-0.153f, 0.051f, -0.321f, 0.024f, -0.45f, -0.068f)
            curveTo(6.077f, 6.812f, 6f, 6.661f, 6f, 6.5f)
            verticalLineTo(2f)
            horizontalLineTo(4.5f)
            curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
            horizontalLineTo(6f)
            verticalLineTo(9.5f)
            close()
            moveTo(11.5f, 2f)
            horizontalLineTo(7f)
            verticalLineToRelative(3.806f)
            lineToRelative(2.342f, -0.78f)
            curveToRelative(0.152f, -0.054f, 0.32f, -0.025f, 0.45f, 0.068f)
            curveTo(9.923f, 5.188f, 10f, 5.339f, 10f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.161f, -0.077f, 0.312f, -0.208f, 0.405f)
            curveToRelative(-0.13f, 0.094f, -0.298f, 0.117f, -0.45f, 0.069f)
            lineTo(7f, 10.193f)
            verticalLineTo(14f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.381f, 0f, 2.5f, -1.119f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
            close()
        }
    }.build()
}
