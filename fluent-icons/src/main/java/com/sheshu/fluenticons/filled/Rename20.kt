package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rename20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rename20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 2f)
            curveTo(8.224f, 2f, 8f, 2.224f, 8f, 2.5f)
            reflectiveCurveTo(8.224f, 3f, 8.5f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(14f)
            horizontalLineToRelative(-1f)
            curveTo(8.224f, 17f, 8f, 17.224f, 8f, 17.5f)
            reflectiveCurveTo(8.224f, 18f, 8.5f, 18f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 17f, 11.5f, 17f)
            horizontalLineToRelative(-1f)
            verticalLineTo(3f)
            horizontalLineToRelative(1f)
            curveTo(11.776f, 3f, 12f, 2.776f, 12f, 2.5f)
            reflectiveCurveTo(11.776f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-4f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-4f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineToRelative(-7f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            close()
            moveToRelative(11f, 12f)
            horizontalLineToRelative(-4f)
            verticalLineTo(4f)
            horizontalLineToRelative(4f)
            curveTo(16.88f, 4f, 18f, 5.12f, 18f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.build()
}
