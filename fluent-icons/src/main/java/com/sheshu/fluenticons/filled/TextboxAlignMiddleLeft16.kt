package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextboxAlignMiddleLeft16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignMiddleLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(1f, 4f)
            horizontalLineToRelative(5f)
            curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
            reflectiveCurveTo(10.776f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            reflectiveCurveTo(5.224f, 6f, 5.5f, 6f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineToRelative(3f)
            curveTo(8.776f, 9f, 9f, 9.224f, 9f, 9.5f)
            reflectiveCurveTo(8.776f, 10f, 8.5f, 10f)
            horizontalLineToRelative(-3f)
            curveTo(5.224f, 10f, 5f, 9.776f, 5f, 9.5f)
            reflectiveCurveTo(5.224f, 9f, 5.5f, 9f)
            close()
        }
    }.build()
}
