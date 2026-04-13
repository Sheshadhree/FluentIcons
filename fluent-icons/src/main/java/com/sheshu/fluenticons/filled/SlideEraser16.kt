package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideEraser16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideEraser16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.75f)
            curveTo(1f, 2.784f, 1.784f, 2f, 2.75f, 2f)
            horizontalLineToRelative(10.5f)
            curveTo(14.216f, 2f, 15f, 2.784f, 15f, 3.75f)
            verticalLineToRelative(4.32f)
            lineToRelative(-1.41f, -1.41f)
            curveToRelative(-0.878f, -0.879f, -2.303f, -0.879f, -3.182f, 0f)
            lineTo(6.66f, 10.41f)
            curveTo(6.219f, 10.848f, 6f, 11.423f, 6f, 12f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 12f, 1f, 11.216f, 1f, 10.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(10.116f, 3.616f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.767f, 0f)
            lineToRelative(1.75f, 1.75f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-2.576f, 2.575f)
            lineTo(8.54f, 9.943f)
            lineToRelative(2.577f, -2.577f)
            close()
            moveTo(7.94f, 10.541f)
            lineToRelative(-0.575f, 0.575f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(1.75f, 1.749f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.767f, 0f)
            lineToRelative(0.576f, -0.575f)
            lineTo(7.94f, 10.54f)
            close()
        }
    }.build()
}
