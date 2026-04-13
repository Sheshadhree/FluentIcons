package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RowTriple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RowTriple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.672f, 2f, 3f, 2.672f, 3f, 3.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 5.328f, 3.672f, 6f, 4.5f, 6f)
            horizontalLineToRelative(11f)
            curveTo(16.328f, 6f, 17f, 5.328f, 17f, 4.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 2.672f, 16.328f, 2f, 15.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, 6f)
            curveTo(3.672f, 8f, 3f, 8.672f, 3f, 9.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 11.328f, 3.672f, 12f, 4.5f, 12f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, 6f)
            curveTo(3.672f, 14f, 3f, 14.672f, 3f, 15.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 17.328f, 3.672f, 18f, 4.5f, 18f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
