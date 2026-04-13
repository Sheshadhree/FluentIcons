package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BreakoutRoom28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BreakoutRoom28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-6.826f)
            curveTo(15.397f, 24.047f, 16f, 22.719f, 16f, 21.25f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
            horizontalLineToRelative(-4f)
            curveTo(5.281f, 12f, 3.953f, 12.603f, 3f, 13.576f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(0f, 10.5f)
            verticalLineToRelative(4f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(4f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineToRelative(-4f)
            curveTo(4.679f, 13.5f, 3f, 15.179f, 3f, 17.25f)
            close()
        }
    }.build()
}
