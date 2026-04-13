package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.085f, 4f)
            horizontalLineTo(5.05f)
            curveTo(5.282f, 2.859f, 6.29f, 2f, 7.5f, 2f)
            horizontalLineTo(14f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            verticalLineToRelative(-1.035f)
            curveToRelative(0.583f, -0.206f, 1f, -0.762f, 1f, -1.415f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(7.5f)
            curveTo(6.847f, 3f, 6.291f, 3.417f, 6.085f, 4f)
            close()
            moveTo(2f, 7.5f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineToRelative(8f)
            curveTo(13.88f, 5f, 15f, 6.12f, 15f, 7.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-8f)
            curveTo(3.12f, 18f, 2f, 16.88f, 2f, 15.5f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}
