package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Highlight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Highlight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 2f)
            curveTo(4.007f, 2f, 3f, 3.007f, 3f, 4.25f)
            verticalLineToRelative(3f)
            curveTo(3f, 8.493f, 4.007f, 9.5f, 5.25f, 9.5f)
            horizontalLineToRelative(13.5f)
            curveTo(19.993f, 9.5f, 21f, 8.493f, 21f, 7.25f)
            verticalLineToRelative(-3f)
            curveTo(21f, 3.007f, 19.993f, 2f, 18.75f, 2f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5f, 11.75f)
            verticalLineTo(11f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(0.75f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-9.5f)
            curveTo(6.007f, 14f, 5f, 12.993f, 5f, 11.75f)
            close()
            moveToRelative(2.503f, 3.75f)
            horizontalLineTo(16.5f)
            verticalLineToRelative(1.288f)
            curveToRelative(0f, 0.815f, -0.44f, 1.561f, -1.141f, 1.958f)
            lineToRelative(-0.154f, 0.08f)
            lineToRelative(-6.635f, 3.106f)
            curveToRelative(-0.466f, 0.218f, -0.997f, -0.087f, -1.061f, -0.578f)
            lineToRelative(-0.007f, -0.101f)
            verticalLineTo(15.5f)
            close()
        }
    }.build()
}
