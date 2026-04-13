package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Library24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Library24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
            verticalLineToRelative(15f)
            curveTo(7f, 20.328f, 6.328f, 21f, 5.5f, 21f)
            horizontalLineToRelative(-2f)
            curveTo(2.672f, 21f, 2f, 20.328f, 2f, 19.5f)
            verticalLineToRelative(-15f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(6f, 0f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveTo(8.672f, 21f, 8f, 20.328f, 8f, 19.5f)
            verticalLineToRelative(-15f)
            curveTo(8f, 3.672f, 8.672f, 3f, 9.5f, 3f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(7.281f, 3.124f)
            lineToRelative(3.214f, 12.519f)
            curveToRelative(0.206f, 0.802f, -0.277f, 1.62f, -1.08f, 1.826f)
            lineToRelative(-1.876f, 0.48f)
            curveToRelative(-0.803f, 0.207f, -1.62f, -0.276f, -1.826f, -1.08f)
            lineTo(13.999f, 7.354f)
            curveToRelative(-0.206f, -0.803f, 0.277f, -1.62f, 1.08f, -1.826f)
            lineToRelative(1.876f, -0.483f)
            curveToRelative(0.803f, -0.205f, 1.62f, 0.279f, 1.826f, 1.08f)
            close()
        }
    }.build()
}
