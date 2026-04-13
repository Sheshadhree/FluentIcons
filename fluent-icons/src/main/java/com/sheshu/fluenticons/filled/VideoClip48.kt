package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClip48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClip48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 8f)
            curveTo(6.798f, 8f, 4f, 10.798f, 4f, 14.25f)
            verticalLineToRelative(19.5f)
            curveTo(4f, 37.202f, 6.798f, 40f, 10.25f, 40f)
            horizontalLineToRelative(27.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-19.5f)
            curveTo(44f, 10.798f, 41.202f, 8f, 37.75f, 8f)
            horizontalLineToRelative(-27.5f)
            close()
            moveTo(18f, 18f)
            curveToRelative(0f, -1.139f, 1.219f, -1.863f, 2.218f, -1.317f)
            lineToRelative(11f, 6f)
            curveToRelative(1.042f, 0.569f, 1.042f, 2.065f, 0f, 2.634f)
            lineToRelative(-11f, 6f)
            curveTo(19.218f, 31.862f, 18f, 31.139f, 18f, 30f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
