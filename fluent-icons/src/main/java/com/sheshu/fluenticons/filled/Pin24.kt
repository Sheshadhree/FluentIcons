package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.068f, 7.758f)
            lineToRelative(-4.826f, -4.826f)
            curveToRelative(-1.327f, -1.327f, -3.564f, -0.964f, -4.404f, 0.715f)
            lineToRelative(-2.435f, 4.87f)
            curveToRelative(-0.088f, 0.176f, -0.24f, 0.31f, -0.426f, 0.374f)
            lineToRelative(-4.166f, 1.44f)
            curveToRelative(-0.873f, 0.3f, -1.129f, 1.412f, -0.476f, 2.065f)
            lineTo(7.439f, 15.5f)
            lineTo(3f, 19.94f)
            verticalLineTo(21f)
            horizontalLineToRelative(1.06f)
            lineToRelative(4.44f, -4.44f)
            lineToRelative(3.104f, 3.105f)
            curveToRelative(0.653f, 0.653f, 1.764f, 0.397f, 2.066f, -0.476f)
            lineToRelative(1.44f, -4.166f)
            curveToRelative(0.063f, -0.185f, 0.197f, -0.338f, 0.373f, -0.426f)
            lineToRelative(4.87f, -2.435f)
            curveToRelative(1.68f, -0.84f, 2.042f, -3.077f, 0.715f, -4.404f)
            close()
        }
    }.build()
}
