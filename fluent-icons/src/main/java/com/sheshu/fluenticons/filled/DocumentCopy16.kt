package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentCopy16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCopy16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.998f, 4.5f)
            verticalLineTo(1f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(12.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(-3.502f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(1.25f)
            lineTo(13.748f, 5f)
            horizontalLineToRelative(-3.25f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveTo(3f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            verticalLineToRelative(8.5f)
            curveTo(4f, 12.88f, 5.12f, 14f, 6.5f, 14f)
            horizontalLineTo(12f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.556f)
            curveTo(4.592f, 15f, 3f, 13.408f, 3f, 11.444f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}
