package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipVertical32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.43f, 2.201f)
            curveTo(27.786f, 2.431f, 28f, 2.826f, 28f, 3.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(3.25f)
            curveToRelative(-0.59f, 0f, -1.1f, -0.412f, -1.222f, -0.99f)
            curveToRelative(-0.123f, -0.576f, 0.174f, -1.16f, 0.712f, -1.401f)
            lineToRelative(23.5f, -10.5f)
            curveToRelative(0.387f, -0.173f, 0.835f, -0.138f, 1.19f, 0.092f)
            close()
            moveTo(9.112f, 12.5f)
            horizontalLineTo(25.5f)
            verticalLineTo(5.178f)
            lineTo(9.112f, 12.5f)
            close()
            moveTo(28f, 29f)
            curveToRelative(0f, 0.34f, -0.173f, 0.658f, -0.46f, 0.842f)
            curveToRelative(-0.286f, 0.184f, -0.647f, 0.209f, -0.956f, 0.067f)
            lineToRelative(-24f, -11f)
            curveToRelative(-0.428f, -0.196f, -0.66f, -0.663f, -0.56f, -1.122f)
            curveTo(2.123f, 17.327f, 2.53f, 17f, 3f, 17f)
            horizontalLineToRelative(24f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(11f)
            close()
        }
    }.build()
}
