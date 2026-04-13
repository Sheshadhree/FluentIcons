package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentLandscape20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentLandscape20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 14f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8.586f)
            curveToRelative(0.398f, 0f, 0.78f, 0.158f, 1.06f, 0.44f)
            lineToRelative(3.915f, 3.913f)
            curveTo(17.842f, 8.636f, 18f, 9.017f, 18f, 9.415f)
            verticalLineTo(14f)
            close()
            moveToRelative(-2f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-3.5f)
            curveTo(12.672f, 10f, 12f, 9.328f, 12f, 8.5f)
            verticalLineTo(5f)
            horizontalLineTo(4f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            close()
            moveToRelative(-3f, -9.793f)
            verticalLineTo(8.5f)
            curveTo(13f, 8.776f, 13.224f, 9f, 13.5f, 9f)
            horizontalLineToRelative(3.293f)
            lineTo(13f, 5.207f)
            close()
        }
    }.build()
}
