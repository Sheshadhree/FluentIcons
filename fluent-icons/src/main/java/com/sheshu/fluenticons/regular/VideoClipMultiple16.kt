package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoClipMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoClipMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5.004f)
            lineTo(5.999f, 8.997f)
            curveToRelative(0f, 0.399f, 0.445f, 0.637f, 0.777f, 0.416f)
            lineToRelative(2.998f, -1.996f)
            curveToRelative(0.297f, -0.198f, 0.297f, -0.635f, 0f, -0.832f)
            lineTo(6.777f, 4.588f)
            curveTo(6.444f, 4.367f, 6f, 4.605f, 6f, 5.004f)
            close()
            moveTo(2f, 4.25f)
            curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
            horizontalLineToRelative(6.5f)
            curveTo(11.993f, 2f, 13f, 3.007f, 13f, 4.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.007f, 12f, 2f, 10.993f, 2f, 9.75f)
            verticalLineToRelative(-5.5f)
            close()
            moveTo(4.25f, 3f)
            curveTo(3.56f, 3f, 3f, 3.56f, 3f, 4.25f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 10.44f, 3.56f, 11f, 4.25f, 11f)
            horizontalLineToRelative(6.5f)
            curveTo(11.44f, 11f, 12f, 10.44f, 12f, 9.75f)
            verticalLineToRelative(-5.5f)
            curveTo(12f, 3.56f, 11.44f, 3f, 10.75f, 3f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(4f, 13f)
            curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
            horizontalLineToRelative(5.25f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.818f, -0.393f, -1.544f, -1f, -2f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
