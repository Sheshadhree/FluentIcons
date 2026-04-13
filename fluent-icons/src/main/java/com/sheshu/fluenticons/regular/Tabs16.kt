package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tabs16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tabs16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(-0.607f, -0.456f, -1f, -1.182f, -1f, -2f)
            verticalLineToRelative(-3f)
            curveTo(1f, 3.462f, 3.462f, 1f, 6.5f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.818f, 0f, 1.544f, 0.393f, 2f, 1f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(4.06f, 6.395f)
            curveTo(4.34f, 5.028f, 5.55f, 4f, 7f, 4f)
            horizontalLineToRelative(6.5f)
            curveToRelative(-0.456f, -0.607f, -1.182f, -1f, -2f, -1f)
            horizontalLineTo(7f)
            curveTo(4.79f, 3f, 3f, 4.79f, 3f, 7f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.818f, 0.393f, 1.544f, 1f, 2f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.207f, 0.021f, -0.41f, 0.06f, -0.605f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 6.12f, 6.12f, 5f, 7.5f, 5f)
            horizontalLineToRelative(5f)
            curveTo(13.88f, 5f, 15f, 6.12f, 15f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(6.12f, 15f, 5f, 13.88f, 5f, 12.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(7.5f, 6f)
            curveTo(6.672f, 6f, 6f, 6.672f, 6f, 7.5f)
            verticalLineToRelative(5f)
            curveTo(6f, 13.328f, 6.672f, 14f, 7.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 6.672f, 13.328f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
