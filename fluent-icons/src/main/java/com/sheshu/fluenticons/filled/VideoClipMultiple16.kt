package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClipMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 2f)
            curveTo(3.007f, 2f, 2f, 3.007f, 2f, 4.25f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 10.993f, 3.007f, 12f, 4.25f, 12f)
            horizontalLineToRelative(6.5f)
            curveTo(11.993f, 12f, 13f, 10.993f, 13f, 9.75f)
            verticalLineToRelative(-5.5f)
            curveTo(13f, 3.007f, 11.993f, 2f, 10.75f, 2f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(6f, 8.996f)
            verticalLineTo(5.004f)
            curveToRelative(0f, -0.4f, 0.446f, -0.637f, 0.778f, -0.416f)
            lineToRelative(2.997f, 1.996f)
            curveToRelative(0.297f, 0.198f, 0.297f, 0.635f, 0f, 0.833f)
            lineTo(6.777f, 9.412f)
            curveTo(6.445f, 9.634f, 6f, 9.396f, 6f, 8.996f)
            close()
            moveTo(6f, 14f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(7.25f)
            curveToRelative(1.52f, 0f, 2.75f, -1.23f, 2.75f, -2.75f)
            verticalLineTo(4f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
