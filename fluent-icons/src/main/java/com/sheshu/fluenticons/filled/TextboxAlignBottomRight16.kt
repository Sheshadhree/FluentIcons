package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextboxAlignBottomRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignBottomRight16",
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
            moveToRelative(6f, 5f)
            curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
            reflectiveCurveTo(10.776f, 8f, 10.5f, 8f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 8f, 5f, 7.776f, 5f, 7.5f)
            reflectiveCurveTo(5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 11f, 10.5f, 11f)
            horizontalLineToRelative(-3f)
            curveTo(7.224f, 11f, 7f, 10.776f, 7f, 10.5f)
            reflectiveCurveTo(7.224f, 10f, 7.5f, 10f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
