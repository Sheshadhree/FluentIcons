package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Maximize28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Maximize28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(14f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(7f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(7f)
            close()
            moveToRelative(4f, -2f)
            curveTo(5.895f, 5f, 5f, 5.895f, 5f, 7f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
