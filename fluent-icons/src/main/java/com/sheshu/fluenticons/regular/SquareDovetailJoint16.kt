package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareDovetailJoint16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareDovetailJoint16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.381f, 0f, 2.5f, -1.119f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
            close()
            moveTo(3f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.161f, 0.077f, 0.312f, 0.208f, 0.406f)
            curveTo(6.337f, 7f, 6.505f, 7.025f, 6.658f, 6.974f)
            lineTo(9f, 6.194f)
            verticalLineToRelative(3.612f)
            lineToRelative(-2.342f, -0.78f)
            curveToRelative(-0.153f, -0.054f, -0.321f, -0.025f, -0.45f, 0.068f)
            curveTo(6.077f, 9.188f, 6f, 9.339f, 6f, 9.5f)
            verticalLineTo(13f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            close()
            moveToRelative(10f, 0f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(7f)
            verticalLineToRelative(-2.806f)
            lineToRelative(2.342f, 0.78f)
            curveToRelative(0.152f, 0.051f, 0.32f, 0.024f, 0.45f, -0.068f)
            curveTo(9.923f, 10.812f, 10f, 10.661f, 10f, 10.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.161f, -0.077f, -0.312f, -0.208f, -0.406f)
            curveTo(9.662f, 5f, 9.494f, 4.973f, 9.342f, 5.026f)
            lineTo(7f, 5.806f)
            verticalLineTo(3f)
            horizontalLineToRelative(4.5f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            close()
        }
    }.build()
}
