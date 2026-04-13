package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 10.732f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.06f, -0.55f, -1.992f, -1.38f, -2.526f)
            curveTo(12.151f, 3.174f, 11.595f, 3f, 11f, 3f)
            horizontalLineTo(3.268f)
            curveTo(3.613f, 2.402f, 4.26f, 2f, 5f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.74f, -0.402f, 1.387f, -1f, 1.732f)
            close()
            moveTo(1f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7.073f)
            lineToRelative(-2.485f, 1.807f)
            curveTo(3.928f, 15.287f, 3f, 14.815f, 3f, 13.998f)
            verticalLineTo(13f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
