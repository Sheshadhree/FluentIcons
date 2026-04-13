package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentBorder20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentBorder20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            verticalLineToRelative(11f)
            curveTo(4f, 16.88f, 5.12f, 18f, 6.5f, 18f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-11f)
            curveTo(16f, 3.12f, 14.88f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(14.328f, 3f, 15f, 3.672f, 15f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.672f, 17f, 5f, 16.328f, 5f, 15.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(6.75f, 4f)
            curveTo(6.336f, 4f, 6f, 4.336f, 6f, 4.75f)
            verticalLineToRelative(10.5f)
            curveTo(6f, 15.664f, 6.336f, 16f, 6.75f, 16f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.75f)
            curveTo(14f, 4.336f, 13.664f, 4f, 13.25f, 4f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
