package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7f)
            close()
            moveToRelative(11.649f, 5.733f)
            lineTo(14f, 11.599f)
            verticalLineTo(6.402f)
            lineToRelative(1.649f, -1.134f)
            curveToRelative(0.995f, -0.684f, 2.35f, 0.028f, 2.35f, 1.236f)
            verticalLineToRelative(4.993f)
            curveToRelative(0f, 1.207f, -1.355f, 1.92f, -2.35f, 1.236f)
            close()
            moveTo(3.007f, 6.757f)
            curveTo(3.002f, 6.837f, 3f, 6.918f, 3f, 7f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.209f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(3f)
            curveToRelative(0.081f, 0f, 0.162f, -0.003f, 0.243f, -0.007f)
            curveTo(9.693f, 15.61f, 8.892f, 16f, 8f, 16f)
            horizontalLineTo(7f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.892f, 0.39f, -1.693f, 1.007f, -2.243f)
            close()
        }
    }.build()
}
