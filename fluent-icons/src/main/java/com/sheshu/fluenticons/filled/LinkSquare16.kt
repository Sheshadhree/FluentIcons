package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LinkSquare16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LinkSquare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.25f)
            curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
            horizontalLineToRelative(3.5f)
            curveTo(8.993f, 2f, 10f, 3.007f, 10f, 4.25f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.98f, -0.626f, 1.813f, -1.5f, 2.122f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            curveTo(3.836f, 3.5f, 3.5f, 3.836f, 3.5f, 4.25f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(5f)
            verticalLineTo(10f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 10f, 2f, 8.993f, 2f, 7.75f)
            verticalLineToRelative(-3.5f)
            close()
            moveToRelative(4f, 7.5f)
            curveTo(6f, 12.993f, 7.007f, 14f, 8.25f, 14f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-3.5f)
            curveTo(14f, 7.007f, 12.993f, 6f, 11.75f, 6f)
            horizontalLineTo(11f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(0.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(6.128f)
            curveTo(6.626f, 6.437f, 6f, 7.27f, 6f, 8.25f)
            verticalLineToRelative(3.5f)
            close()
        }
    }.build()
}
