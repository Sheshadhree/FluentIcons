package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentCopy24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCopy24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 6.75f)
            verticalLineTo(2f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 2f, 6.5f, 3.007f, 6.5f, 4.25f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(9f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(9f)
            horizontalLineToRelative(-4.75f)
            curveTo(14.007f, 9f, 13f, 7.993f, 13f, 6.75f)
            close()
            moveToRelative(1.5f, 0f)
            verticalLineTo(2.5f)
            lineToRelative(5f, 5f)
            horizontalLineToRelative(-4.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveTo(5.503f, 4.627f)
            curveTo(4.627f, 4.935f, 4f, 5.769f, 4f, 6.75f)
            verticalLineToRelative(10.504f)
            curveToRelative(0f, 2.623f, 2.127f, 4.75f, 4.75f, 4.75f)
            horizontalLineToRelative(6.494f)
            curveToRelative(0.98f, 0f, 1.813f, -0.626f, 2.122f, -1.5f)
            horizontalLineTo(8.75f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            lineTo(5.503f, 4.627f)
            close()
        }
    }.build()
}
