package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.085f, 4f)
            horizontalLineTo(10f)
            curveToRelative(1.104f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.915f)
            curveToRelative(0.582f, -0.206f, 1f, -0.762f, 1f, -1.415f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.344f, -3f, -3f, -3f)
            horizontalLineTo(6.5f)
            curveTo(5.846f, 3f, 5.29f, 3.417f, 5.085f, 4f)
            close()
            moveTo(4.5f, 5f)
            curveTo(3.672f, 5f, 3f, 5.672f, 3f, 6.5f)
            verticalLineToRelative(5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(11f, 5.672f, 10.328f, 5f, 9.5f, 5f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
