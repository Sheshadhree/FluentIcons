package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Highlight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Highlight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.672f, 2f, 3f, 2.672f, 3f, 3.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 7.328f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineToRelative(11f)
            curveTo(16.328f, 8f, 17f, 7.328f, 17f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(17f, 2.672f, 16.328f, 2f, 15.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(6f, 11f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(1.074f)
            curveToRelative(0f, 0.758f, -0.428f, 1.45f, -1.106f, 1.789f)
            lineToRelative(-6.17f, 3.085f)
            curveTo(6.39f, 18.114f, 6f, 17.873f, 6f, 17.501f)
            verticalLineTo(12f)
            close()
        }
    }.build()
}
