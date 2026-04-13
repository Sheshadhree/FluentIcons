package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ColumnSingleCompare20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColumnSingleCompare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.035f, 0.787f, 1.887f, 1.795f, 1.99f)
            curveTo(5.863f, 17.997f, 5.931f, 18f, 6f, 18f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 6f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(1f)
            horizontalLineTo(5f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 5f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(3f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
