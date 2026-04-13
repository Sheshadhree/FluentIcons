package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Video32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Video32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10.5f)
            curveTo(2f, 8.015f, 4.015f, 6f, 6.5f, 6f)
            horizontalLineToRelative(10f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-10f)
            curveTo(4.015f, 26f, 2f, 23.985f, 2f, 21.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(27.996f, -0.746f)
            curveToRelative(0f, -1.814f, -2.036f, -2.882f, -3.529f, -1.852f)
            lineToRelative(-3.967f, 2.74f)
            verticalLineToRelative(10.716f)
            lineToRelative(3.968f, 2.74f)
            curveToRelative(1.492f, 1.03f, 3.528f, -0.038f, 3.528f, -1.852f)
            verticalLineTo(9.754f)
            close()
        }
    }.build()
}
