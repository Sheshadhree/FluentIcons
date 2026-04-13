package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Window48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Window48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 6f)
            horizontalLineToRelative(23.5f)
            curveTo(39.202f, 6f, 42f, 8.798f, 42f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineToRelative(-23.5f)
            curveTo(6f, 8.798f, 8.798f, 6f, 12.25f, 6f)
            close()
            moveTo(8.5f, 16.5f)
            verticalLineToRelative(19.25f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(-31f)
            close()
            moveToRelative(31f, -2.5f)
            verticalLineToRelative(-1.75f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineToRelative(-23.5f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineTo(14f)
            horizontalLineToRelative(31f)
            close()
        }
    }.build()
}
