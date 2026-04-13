package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentSquare48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSquare48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.758f, 6f)
            curveToRelative(1.127f, 0f, 2.208f, 0.448f, 3.005f, 1.245f)
            lineToRelative(10.992f, 10.992f)
            curveTo(41.552f, 19.034f, 42f, 20.115f, 42f, 21.242f)
            verticalLineTo(37.75f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-27.5f)
            curveTo(7.903f, 42f, 6f, 40.097f, 6f, 37.75f)
            verticalLineToRelative(-27.5f)
            curveTo(6f, 7.903f, 7.903f, 6f, 10.25f, 6f)
            horizontalLineToRelative(16.508f)
            close()
            moveTo(10.25f, 8.5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(27.5f)
            curveToRelative(0f, 0.967f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(27.5f)
            curveToRelative(0.967f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            verticalLineTo(22f)
            horizontalLineToRelative(-9.25f)
            curveTo(27.903f, 22f, 26f, 20.097f, 26f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(10.25f)
            close()
            moveToRelative(18.25f, 9.25f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(8.232f)
            lineTo(28.5f, 9.518f)
            verticalLineToRelative(8.232f)
            close()
        }
    }.build()
}
