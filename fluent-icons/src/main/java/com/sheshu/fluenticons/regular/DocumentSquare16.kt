package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentSquare16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.482f, 2f)
            curveToRelative(0.465f, 0f, 0.91f, 0.185f, 1.238f, 0.513f)
            lineToRelative(2.767f, 2.767f)
            curveTo(13.815f, 5.608f, 14f, 6.053f, 14f, 6.518f)
            verticalLineToRelative(5.732f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(2.784f, 14f, 2f, 13.216f, 2f, 12.25f)
            verticalLineToRelative(-8.5f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(5.732f)
            close()
            moveTo(3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 12.664f, 3.336f, 13f, 3.75f, 13f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(7f)
            horizontalLineToRelative(-2.5f)
            curveTo(9.672f, 7f, 9f, 6.328f, 9f, 5.5f)
            verticalLineTo(3f)
            horizontalLineTo(3.75f)
            close()
            moveTo(10f, 5.5f)
            curveTo(10f, 5.776f, 10.224f, 6f, 10.5f, 6f)
            horizontalLineToRelative(2.291f)
            lineToRelative(-0.01f, -0.013f)
            lineToRelative(-2.768f, -2.767f)
            lineTo(10f, 3.209f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
