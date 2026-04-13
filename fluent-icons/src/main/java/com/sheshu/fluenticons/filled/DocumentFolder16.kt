package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentFolder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentFolder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 9f)
            horizontalLineTo(12f)
            verticalLineTo(4.085f)
            curveToRelative(0.582f, 0.206f, 1f, 0.762f, 1f, 1.415f)
            verticalLineToRelative(3.55f)
            curveTo(12.838f, 9.017f, 12.671f, 9f, 12.5f, 9f)
            close()
            moveTo(6.854f, 4.732f)
            lineTo(11f, 8.88f)
            verticalLineTo(3.5f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(3.672f, 2f, 3f, 2.672f, 3f, 3.5f)
            verticalLineToRelative(0.55f)
            curveTo(3.162f, 4.017f, 3.329f, 4f, 3.5f, 4f)
            horizontalLineToRelative(1.586f)
            curveToRelative(0.663f, 0f, 1.299f, 0.263f, 1.768f, 0.732f)
            close()
            moveTo(3.5f, 5f)
            curveTo(2.672f, 5f, 2f, 5.672f, 2f, 6.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.586f)
            curveToRelative(-0.132f, 0f, -0.26f, -0.053f, -0.353f, -0.146f)
            lineTo(6.146f, 5.439f)
            curveTo(5.866f, 5.158f, 5.484f, 5f, 5.086f, 5f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}
