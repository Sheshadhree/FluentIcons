package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingToolAccent32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingToolAccent32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4f)
            horizontalLineToRelative(26f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            curveToRelative(0f, 0.15f, -0.034f, 0.303f, -0.106f, 0.447f)
            lineToRelative(-5f, 10f)
            curveToRelative(-0.247f, 0.494f, -0.847f, 0.694f, -1.341f, 0.447f)
            curveToRelative(-0.494f, -0.247f, -0.694f, -0.847f, -0.447f, -1.341f)
            lineTo(20.882f, 9f)
            horizontalLineTo(4f)
            curveTo(3.448f, 9f, 3f, 8.552f, 3f, 8f)
            verticalLineTo(4f)
            close()
            moveToRelative(14.857f, 21.875f)
            curveToRelative(0f, 1.864f, -0.863f, 3.375f, -1.928f, 3.375f)
            curveToRelative(-1.066f, 0f, -1.929f, -1.511f, -1.929f, -3.375f)
            reflectiveCurveToRelative(0.864f, -3.375f, 1.929f, -3.375f)
            reflectiveCurveToRelative(1.928f, 1.511f, 1.928f, 3.375f)
            close()
        }
    }.build()
}
