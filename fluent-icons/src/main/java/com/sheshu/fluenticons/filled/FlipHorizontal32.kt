package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipHorizontal32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29.799f, 27.43f)
            curveTo(29.569f, 27.786f, 29.174f, 28f, 28.75f, 28f)
            horizontalLineToRelative(-10.5f)
            curveTo(17.56f, 28f, 17f, 27.44f, 17f, 26.75f)
            verticalLineTo(3.25f)
            curveToRelative(0f, -0.59f, 0.412f, -1.1f, 0.99f, -1.222f)
            curveToRelative(0.576f, -0.123f, 1.16f, 0.174f, 1.401f, 0.712f)
            lineToRelative(10.5f, 23.5f)
            curveToRelative(0.173f, 0.387f, 0.138f, 0.835f, -0.092f, 1.19f)
            close()
            moveTo(19.5f, 9.112f)
            verticalLineTo(25.5f)
            horizontalLineToRelative(7.322f)
            lineTo(19.5f, 9.112f)
            close()
            moveTo(3f, 28f)
            curveToRelative(-0.34f, 0f, -0.658f, -0.173f, -0.842f, -0.46f)
            curveToRelative(-0.183f, -0.286f, -0.209f, -0.647f, -0.067f, -0.956f)
            lineToRelative(11f, -24f)
            curveToRelative(0.196f, -0.428f, 0.663f, -0.66f, 1.122f, -0.56f)
            curveTo(14.673f, 2.123f, 15f, 2.53f, 15f, 3f)
            verticalLineToRelative(24f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
