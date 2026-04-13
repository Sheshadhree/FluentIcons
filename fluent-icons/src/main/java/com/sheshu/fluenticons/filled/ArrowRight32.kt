package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 16f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(20.537f)
            lineToRelative(-7.432f, -7.628f)
            curveToRelative(-0.482f, -0.494f, -0.472f, -1.285f, 0.023f, -1.767f)
            curveToRelative(0.494f, -0.482f, 1.285f, -0.472f, 1.767f, 0.023f)
            lineToRelative(9.497f, 9.747f)
            curveTo(28.88f, 15.367f, 29f, 15.683f, 29f, 16f)
            curveToRelative(0f, 0.317f, -0.12f, 0.633f, -0.358f, 0.875f)
            lineToRelative(-9.497f, 9.747f)
            curveToRelative(-0.482f, 0.495f, -1.273f, 0.505f, -1.767f, 0.023f)
            curveToRelative(-0.495f, -0.482f, -0.505f, -1.273f, -0.023f, -1.767f)
            lineToRelative(7.432f, -7.628f)
            horizontalLineTo(4.25f)
            curveTo(3.56f, 17.25f, 3f, 16.69f, 3f, 16f)
            close()
        }
    }.build()
}
