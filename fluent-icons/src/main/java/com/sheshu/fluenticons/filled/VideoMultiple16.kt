package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(3f, 10.88f, 4.12f, 12f, 5.5f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveTo(11f, 4.12f, 9.88f, 3f, 8.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(2f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(2f, 11.433f, 3.567f, 13f, 5.5f, 13f)
            horizontalLineToRelative(3f)
            curveToRelative(-0.456f, 0.607f, -1.182f, 1f, -2f, 1f)
            horizontalLineToRelative(-1f)
            curveTo(3.015f, 14f, 1f, 11.986f, 1f, 9.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.818f, 0.393f, -1.543f, 1f, -2f)
            close()
            moveToRelative(13f, -0.248f)
            curveToRelative(0f, -0.999f, -1.12f, -1.594f, -1.95f, -1.04f)
            lineTo(12f, 4.912f)
            verticalLineToRelative(5.177f)
            lineToRelative(1.05f, 0.7f)
            curveToRelative(0.83f, 0.553f, 1.95f, -0.042f, 1.95f, -1.04f)
            verticalLineTo(5.252f)
            close()
        }
    }.build()
}
