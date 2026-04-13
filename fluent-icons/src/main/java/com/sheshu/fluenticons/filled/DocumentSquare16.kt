package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentSquare16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 5.5f)
            curveTo(9f, 6.328f, 9.672f, 7f, 10.5f, 7f)
            horizontalLineTo(14f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineToRelative(-8.5f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineTo(9f)
            verticalLineToRelative(3.5f)
            close()
            moveToRelative(1f, -3.42f)
            curveToRelative(0.27f, 0.083f, 0.517f, 0.23f, 0.72f, 0.433f)
            lineToRelative(2.767f, 2.767f)
            curveToRelative(0.203f, 0.203f, 0.35f, 0.45f, 0.434f, 0.72f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 6f, 10f, 5.776f, 10f, 5.5f)
            verticalLineTo(2.08f)
            close()
        }
    }.build()
}
