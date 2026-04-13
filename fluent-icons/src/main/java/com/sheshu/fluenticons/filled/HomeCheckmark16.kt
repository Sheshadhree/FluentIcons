package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.687f, 1.273f)
            curveToRelative(-0.385f, -0.364f, -0.988f, -0.364f, -1.374f, 0f)
            lineTo(2.47f, 5.848f)
            curveTo(2.17f, 6.131f, 2f, 6.525f, 2f, 6.938f)
            verticalLineTo(12.5f)
            curveTo(2f, 13.33f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.671f, 1.5f, -1.499f)
            verticalLineTo(6.937f)
            curveToRelative(0f, -0.412f, -0.17f, -0.806f, -0.47f, -1.089f)
            lineTo(8.688f, 1.273f)
            close()
            moveToRelative(2.167f, 5.38f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-3.5f, 3.497f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.499f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.706f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(7f, 9.797f)
            lineToRelative(3.146f, -3.143f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}
